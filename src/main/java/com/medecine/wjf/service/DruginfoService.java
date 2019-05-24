package com.medecine.wjf.service;

import com.github.pagehelper.PageInfo;
import com.medecine.wjf.pojo.DruginfoPojo;

public interface DruginfoService {

	PageInfo<DruginfoPojo> Druginfoquery(int pageNum,int pageSize);
}
