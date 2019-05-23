package com.medecine.dby.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.medecine.dby.dao.dbyMapper;
import com.medecine.dby.pojo.userPojo;


@Service
public class dbyServiceImpol implements dbyService {

	@Autowired
	private dbyMapper dby;

	
	

	@Override
	public userPojo getUser(userPojo u) {
		// TODO Auto-generated method stub
		return dby.getUser(u);
	}




	@Override
	public userPojo getAuthority(userPojo u) {
		// TODO Auto-generated method stub
		return dby.getAuthority(u);
	}




	@Override
	public List<userPojo> getUserAll(userPojo u) {
		// TODO Auto-generated method stub
		return dby.getUserAll(u);
	}




	@Override
	public int getUserCount(userPojo u) {
		// TODO Auto-generated method stub
		return dby.getUserCount(u);
	}




	@Override
	public int addUser(userPojo u) {
		// TODO Auto-generated method stub
		return dby.addUser(u);
	}

	


	

	
	


}
