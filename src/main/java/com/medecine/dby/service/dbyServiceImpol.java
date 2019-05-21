package com.medecine.dby.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.medecine.dby.dao.dbyMapper;
import com.medecine.dby.pojo.userInfo;


@Service
public class dbyServiceImpol implements dbyService {

	@Autowired
	private dbyMapper dby;

	
	

	@Override
	public userInfo getUser(userInfo u) {
		// TODO Auto-generated method stub
		return dby.getUser(u);
	}




	@Override
	public userInfo getAuthority(userInfo u) {
		// TODO Auto-generated method stub
		return dby.getAuthority(u);
	}

	


	

	
	


}
