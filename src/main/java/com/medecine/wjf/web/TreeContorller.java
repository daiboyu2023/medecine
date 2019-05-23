package com.medecine.wjf.web;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.medecine.dby.pojo.userPojo;
import com.medecine.wjf.pojo.TreesPojo;
import com.medecine.wjf.pojo.Userinfo;
import com.medecine.wjf.service.TreesService;

@RestController
public class TreeContorller {

	@Autowired
	private TreesService service;
	
	@RequestMapping("/wujunfan/trees")
	public List<TreesPojo> Trees(HttpServletRequest request){
		int nid=0;
		try {
			nid=Integer.parseInt(request.getParameter("id"));
		}catch (Exception e) {
			nid=0;
		}
		userPojo user=(userPojo) request.getSession().getAttribute("userInfo");
		TreesPojo pojo=new TreesPojo();
		pojo.setNid(nid);
		pojo.setAid(user.getAuthorityId());
		List<TreesPojo> list=service.Trees(pojo);
		return list;
	}
}
