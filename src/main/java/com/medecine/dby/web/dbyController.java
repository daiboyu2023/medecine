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
import com.medecine.dby.pojo.userPojo;
import com.medecine.dby.service.dbyService;


@RestController
public class dbyController {

	@Autowired
	private dbyService dby; 
	userPojo u=new userPojo();

	//登录
	@RequestMapping("login_dby")
	public int login(userPojo pojo,HttpServletRequest request,HttpServletResponse response) {
		System.out.println("进入");

		System.out.println(pojo);
		

		
		userPojo list = dby.getUser(pojo);
		System.out.println("----------------------------------");
		System.out.println(list);
		if(list==null) {
			return 0;
		}else {
			
			userPojo info = dby.getAuthority(list);
			request.getSession().setAttribute("userInfo", info);
			userPojo info1 = (userPojo)request.getSession().getAttribute("userInfo");
			
			System.out.println("----------------------------------");
			System.out.println(info1);
			//获取id
			return 1;
		}
		
	}

}
