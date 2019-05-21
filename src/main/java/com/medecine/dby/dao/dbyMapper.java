package com.medecine.dby.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.medecine.dby.pojo.userInfo;



@Mapper
public interface dbyMapper {
	//判断登录
	userInfo getUser(userInfo u);
	
	//获取权限
	userInfo getAuthority(userInfo u);
 }
