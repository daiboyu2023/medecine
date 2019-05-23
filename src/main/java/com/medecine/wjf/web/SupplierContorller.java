package com.medecine.wjf.web;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.github.pagehelper.PageInfo;
import com.medecine.wjf.pojo.SupplierPojo;
import com.medecine.wjf.service.SupplierService;

@RestController
public class SupplierContorller {

	@Autowired
	private SupplierService service;
	
	@RequestMapping("/wujunfan/supplierquery")
	public Map<String,Object> Supplierquery(HttpServletRequest req){
		int currpage = 1;
		int pagesize = 10;
		try {
			 currpage=Integer.parseInt(req.getParameter("page"));
			 pagesize=Integer.parseInt(req.getParameter("rows"));	
		} catch (Exception e) {
		     currpage=1;
		     pagesize=10;
		}
		PageInfo<SupplierPojo> pageinfo=service.Supplierquery(currpage, pagesize);
		Map<String,Object> map = new HashMap<>();
		map.put("rows",pageinfo.getList());
		map.put("total",pageinfo.getTotal());
		return map;
	}
}
