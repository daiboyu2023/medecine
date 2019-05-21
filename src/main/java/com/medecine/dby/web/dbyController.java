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

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.medecine.dby.pojo.userInfo;
import com.medecine.dby.service.dbyService;


@RestController
public class dbyController {

	@Autowired
	private dbyService dby; 
	userInfo u=new userInfo();

	//登录
	@RequestMapping("login_dby")
	public int login(HttpServletRequest request,HttpServletResponse response) {
		System.out.println("进入");
		String userPhone = request.getParameter("userPhone");
		String userPwd = request.getParameter("userPwd");
		System.out.println(userPhone+"--"+userPwd);
		
		u.setUserPhone(userPhone);
		u.setUserPwd(userPwd);
		
		userInfo list = dby.getUser(u);
		System.out.println("----------------------------------");
		System.out.println(list);
		if(list==null) {
			return 0;
		}else {
			
			userInfo info = dby.getAuthority(list);
			request.getSession().setAttribute("userInfo", info);
			userInfo info1 = (userInfo)request.getSession().getAttribute("userInfo");
			
			System.out.println("----------------------------------");
			System.out.println(info1);
			//获取id
			return 1;
		}
		
	}

}
