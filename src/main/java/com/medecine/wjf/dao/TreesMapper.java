package com.medecine.wjf.dao;

import java.util.List;

import com.medecine.wjf.pojo.TreesPojo;

public interface TreesMapper {
	
	List<TreesPojo> trees(TreesPojo pojo);
}
