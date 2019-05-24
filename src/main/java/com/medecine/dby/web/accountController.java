package com.medecine.dby.web;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.medecine.dby.pojo.Map1;
import com.medecine.dby.pojo.rows1;
import com.medecine.dby.pojo.userPojo;
import com.medecine.dby.service.dbyService;



@Controller
@RestController
public class accountController {

	@Autowired
	private dbyService dby;
	

	//登录
	@RequestMapping("login_dby")
	public int doLogin(HttpServletRequest request,userPojo u) {
		userPojo user = dby.getUser(u);
		if(user==null) {
			System.out.println("账号密码错误");
			return 0;
		}else{
			userPojo authority = dby.getAuthority(user);
			if(user.getState().equals("离职")) {
				return 2;
			}
			else {

				user.setAuthorityName(authority.getAuthorityName());
				System.out.println(user);
				request.getSession().setAttribute("userInfo", user);
				request.getSession().setAttribute("userPwd", user.getUserPwd());
				request.getSession().setAttribute("userId", user.getUserId());
				request.getSession().setAttribute("authorityName", user.getAuthorityName());
				request.getSession().setAttribute("recordTime", user.getRecordTime());
				return 1;
			}}
	} 

	//查询
	@RequestMapping("getUser_dby")
	public  Map1 getAccount(rows1 ro,HttpServletRequest request,HttpServletResponse response) {
		List<userPojo> list =null;
		userPojo uuu=new userPojo();
		int page=Integer.parseInt(request.getParameter("page"));
		int rows=Integer.parseInt(request.getParameter("rows"));
		int a=(page-1)*rows;
		ro.setA(a);
		ro.setRows(rows);
		int count ;

		//添加条件

		String state=request.getParameter("state1");					//获取模糊查询在职状态
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
		uuu.setUserName(userName);
		list = dby.getUserAll(uuu);
		System.out.println("集合==="+list);
		count=dby.getUserCount(uuu);
		Map1 m=new Map1();

		m.setRows(list);
		m.setTotal(count);
		return m;
	}

	//添加员工
	@RequestMapping("add_dby")
	public int addUser(HttpServletRequest request,userPojo u) {
		int addUser = dby.addUser(u);
		return addUser; 
	} 
	
	//修改员工信息
	@RequestMapping("update_dby")
	public int getUpdate(HttpServletRequest request,userPojo u) {
		int update = dby.update(u);
		return update;

	} 
	
	//开除员工
	@RequestMapping("delete_dby")
	public int delete(HttpServletRequest request,userPojo u) {
		int update = dby.delete(u);
		return update;
	} 
	
	//判断登录
	@RequestMapping("panduan_dby")
	public String panduan(HttpServletRequest request,userPojo u) {
		HttpSession se= request.getSession();
		Object ob = se.getAttribute("userInfo");
		if(ob==null) {
			return "0";
		}else {
			userPojo user=(userPojo)se.getAttribute("userInfo");
			System.out.println(user);
			String userName=user.getUserName();
			String zhiwei=user.getAuthorityName();
			
			return userName+zhiwei;
		}
	} 
	
	@RequestMapping("tuichu_dby")
	public int tuichu(HttpServletRequest request) {
		request.getSession().setAttribute("userInfo", null);
		return 1;
	}
	
	@RequestMapping("xiugai_dby")
	public int xiugai(HttpServletRequest request) {
		String pwd1 = request.getParameter("userPwd1");
		String pwd2 = request.getParameter("userPwd2");
		
		userPojo user = (userPojo) request.getSession().getAttribute("userInfo");
			if(pwd1.equals(user.getUserPwd())) {
				user.setUserPwd(pwd2);
				int i = dby.updatePwd(user);
				
				
				return i;
			}else {
				return 2;
			}
		
	
	}
}
