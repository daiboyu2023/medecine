package com.medecine.dby.service;

import java.util.List;

import com.medecine.dby.pojo.userInfo;

public interface dbyService {
		//判断登录
		userInfo getUser(userInfo u);
		//获取权限
		userInfo getAuthority(userInfo u);
}
