package com.medecine.dby.service;

import java.util.List;

import com.medecine.dby.pojo.userPojo;

public interface dbyService {
		//判断登录
		userPojo getUser(userPojo u);
		//获取权限
		userPojo getAuthority(userPojo u);
}
