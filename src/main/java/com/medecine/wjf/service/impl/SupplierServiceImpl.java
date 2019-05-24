package com.medecine.wjf.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.medecine.wjf.dao.SupplierMapper;
import com.medecine.wjf.pojo.SupplierPojo;
import com.medecine.wjf.service.SupplierService;

@Service
public class SupplierServiceImpl implements SupplierService{

	@Autowired
	private SupplierMapper mapper;

	@Override
	public PageInfo<SupplierPojo> Supplierquery(int pageNum,int pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		List<SupplierPojo> list=mapper.Supplierquery();
		PageInfo<SupplierPojo> pageinfo=new PageInfo<>(list);
		return pageinfo;
	}
	

}
