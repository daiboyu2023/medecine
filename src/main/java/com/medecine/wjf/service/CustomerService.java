package com.medecine.wjf.service;

import com.github.pagehelper.PageInfo;
import com.medecine.wjf.pojo.CustomerPojo;

public interface CustomerService {

	PageInfo<CustomerPojo> Customerquery(int pageNum,int pageSize);
	
	int CustomerAdd(CustomerPojo pojo);
	
	int CustomerUpdate(CustomerPojo pojo);
}
