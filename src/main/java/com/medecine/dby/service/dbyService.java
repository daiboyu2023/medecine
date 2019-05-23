package com.medecine.dby.service;

import java.util.List;

import com.medecine.dby.pojo.userPojo;

public interface dbyService {
		//判断登录
		userPojo getUser(userPojo u);
		//获取权限
		userPojo getAuthority(userPojo u);
		
		//查询所有用户
		List<userPojo> getUserAll(userPojo u);
		
		//查询总数
		int getUserCount(userPojo u);
		
		//添加用户
		int addUser(userPojo u);
}
