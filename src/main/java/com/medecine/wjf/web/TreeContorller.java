package com.medecine.wjf.web;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.medecine.wjf.pojo.TreesPojo;
import com.medecine.wjf.service.TreesService;

@RestController
public class TreeContorller {

	@Autowired
	private TreesService service;
	
	@RequestMapping("/wujunfan/trees")
	public List<TreesPojo> Trees(HttpServletRequest request,HttpServletResponse response){
		int nid=0;
		try {
			nid=Integer.parseInt(request.getParameter("id"));
		}catch (Exception e) {
			nid=0;
		}
		TreesPojo pojo=new TreesPojo();
		pojo.setNid(nid);
//		String string=(String) request.getSession().getAttribute("authority");
//		if(string==null) {
			request.getRequestDispatcher("login.html");
//		}
		pojo.setAid(1);
		List<TreesPojo> list=service.Trees(pojo);
		return list;
	}
}
