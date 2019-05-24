package com.medecine.wjf.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.medecine.wjf.dao.DruginfoMapper;
import com.medecine.wjf.pojo.DruginfoPojo;
import com.medecine.wjf.service.DruginfoService;

@Service
public class DruginfoServiceImpl implements DruginfoService{

	@Autowired
	private DruginfoMapper mapper;
	@Override
	public PageInfo<DruginfoPojo> Druginfoquery(int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		List<DruginfoPojo> list=mapper.Druginfoquery();
		PageInfo<DruginfoPojo> pageinfo=new PageInfo<>(list);
		return pageinfo;
	}

}
