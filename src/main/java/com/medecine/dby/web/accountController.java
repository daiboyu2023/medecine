package com.medecine.dby.web;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.medecine.dby.pojo.Map1;
import com.medecine.dby.pojo.rows1;
import com.medecine.dby.pojo.userPojo;
import com.medecine.dby.service.dbyService;



@RestController
public class accountController {

	@Autowired
	private dbyService dby;

	//登录
	@RequestMapping("login_dby")
	public int doLogin(HttpServletRequest request,userPojo u) {
		userPojo user = dby.getUser(u);
		System.out.println(user);
		userPojo authority = dby.getAuthority(user);
		user.setAuthorityName(authority.getAuthorityName());
		System.out.println(user);
		request.getSession().setAttribute("userInfo", user);
		request.getSession().setAttribute("userId", user.getUserId());
		request.getSession().setAttribute("authorityName", user.getAuthorityName());
		request.getSession().setAttribute("recordTime", user.getRecordTime());
		if(authority!=null) {
			return 1;
		}else {
			return 0;
		}
	} 

	//查询
	@RequestMapping("getUser_dby")
	public  Map1 getAccount(rows1 ro,HttpServletRequest request,HttpServletResponse response) {
		List<userPojo> list =null;
		userPojo uuu=new userPojo();
		int page=Integer.parseInt(request.getParameter("page"));
		int rows=Integer.parseInt(request.getParameter("rows"));
		System.out.println(page+"-----"+rows);
		int a=(page-1)*rows;
		ro.setA(a);
		ro.setRows(rows);
		int count ;

		//添加条件

		String state=request.getParameter("state1");					//获取模糊查询在职状态
		System.out.println("state===="+state);
		if(state.equals("1")) {
			state="";
		}else if(state.equals("2")) {
			state="在职";
		}else if(state.equals("3")) {
			state="离职";
		}


		//判断时间
		String startTime=request.getParameter("startTime");//获取模糊查询时间段
		String endTime=request.getParameter("endTime");
		if(startTime=="") {
			startTime="2019-05-01";
		}
		if(endTime=="") {
			endTime="2030-05-01";
		}

		System.out.println("开始时间："+startTime);
		System.out.println("结束时间："+endTime);
		//添加数据

		uuu.setEndTime(endTime);
		uuu.setState(state);
		uuu.setStartTime(startTime);
		uuu.setA(ro.getA());				
		uuu.setRows(ro.getRows());
		//判断是否有id，用不同的sql语句
		String userName=request.getParameter("username");				//获取模糊查询姓名
		if(userName==null) {
			userName="";
		}
		System.out.println("userName===="+userName);
		uuu.setUserName(userName);

		System.out.println("实体类==="+uuu);

		list = dby.getUserAll(uuu);
		System.out.println("集合==="+list);
		count=dby.getUserCount(uuu);
		Map1 m=new Map1();

		m.setRows(list);
		m.setTotal(count);
		System.out.println(m);
		return m;
	}


	@RequestMapping("add_dby")
	public int addUser(HttpServletRequest request,userPojo u) {
		int addUser = dby.addUser(u);
		return addUser; 
	} 
}
