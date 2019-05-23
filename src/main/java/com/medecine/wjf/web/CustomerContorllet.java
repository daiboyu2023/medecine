package com.medecine.wjf.web;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.github.pagehelper.PageInfo;
import com.medecine.wjf.pojo.CustomerPojo;
import com.medecine.wjf.pojo.DruginfoPojo;
import com.medecine.wjf.service.CustomerService;

@RestController
public class CustomerContorllet {

	@Autowired
	private CustomerService service;
	
	@RequestMapping("/wujunfan/Customerquery")
	public Map<String, Object> Customerquery(HttpServletRequest req) {
		int currpage = 1;
		int pagesize = 10;
		try {
			 currpage=Integer.parseInt(req.getParameter("page"));
			 pagesize=Integer.parseInt(req.getParameter("rows"));	
		} catch (Exception e) {
		     currpage=1;
		     pagesize=10;
		}
		PageInfo<CustomerPojo> pageinfo=service.Customerquery(currpage, pagesize);
		Map<String,Object> map = new HashMap<>();
		map.put("rows",pageinfo.getList());
		map.put("total",pageinfo.getTotal());
		return map;
	}
}
