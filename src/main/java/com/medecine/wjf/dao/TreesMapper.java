package com.medecine.wjf.dao;

import java.util.List;

import com.medecine.wjf.pojo.TreesPojo;

public interface TreesMapper {
	
	//查询树状图
	List<TreesPojo> trees(TreesPojo pojo);
}
