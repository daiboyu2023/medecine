package com.medecine.wjf.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.medecine.wjf.dao.TreesMapper;
import com.medecine.wjf.pojo.TreesPojo;
import com.medecine.wjf.service.TreesService;

@Service
public class TreesServiceImpl implements TreesService{

	@Autowired
	private TreesMapper mapper;
	
	@Override
	public List<TreesPojo> Trees(TreesPojo pojo) {
		List<TreesPojo> list=mapper.trees(pojo);
		System.out.println(list);
		return list;
	}

}
