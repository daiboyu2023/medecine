package com.medecine.wjf.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.medecine.wjf.dao.CustomerMapper;
import com.medecine.wjf.pojo.CustomerPojo;
import com.medecine.wjf.service.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService{

	@Autowired
	private CustomerMapper mapper;
	@Override
	public PageInfo<CustomerPojo> Customerquery(int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		List<CustomerPojo> list=mapper.Customerquery();
		PageInfo<CustomerPojo> pageinfo=new PageInfo<>(list);
		return pageinfo;
	}

}
