package com.medecine.dby.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.medecine.dby.pojo.userPojo;



@Mapper
public interface dbyMapper {
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
	
	//获取要修改的员工信息
	int update(userPojo u);
	
	//开除员工
	int delete(userPojo u);
	
	//修改密码
	int updatePwd(userPojo u);
 }
