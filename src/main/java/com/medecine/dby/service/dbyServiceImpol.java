package com.medecine.dby.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.medecine.dby.dao.dbyMapper;
import com.medecine.dby.pojo.drugPojo;
import com.medecine.dby.pojo.loginPojo;
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




	@Override
	public int update(userPojo u) {
		// TODO Auto-generated method stub
		return dby.update(u);
	}




	@Override
	public int delete(userPojo u) {
		// TODO Auto-generated method stub
		return dby.delete(u);
	}




	@Override
	public int updatePwd(userPojo u) {
		// TODO Auto-generated method stub
		return dby.updatePwd(u);
	}




	@Override
	public List<drugPojo> getTixing() {
		// TODO Auto-generated method stub
		return dby.getTixing();
	}

	@Override
	public int getDrugCount() {
		// TODO Auto-generated method stub
		return dby.getDrugCount();
		}




	@Override
	public int addLogin(userPojo u) {
		// TODO Auto-generated method stub
		return dby.addLogin(u);
	}




	@Override
	public List<loginPojo> getLogin() {
		// TODO Auto-generated method stub
		return dby.getLogin();
	}




	@Override
	public int getLoginCount() {
		// TODO Auto-generated method stub
		return dby.getLoginCount();
	}


	

	
	


}
