package com.medecine.wjf.service;

import com.github.pagehelper.PageInfo;
import com.medecine.wjf.pojo.SupplierPojo;

public interface SupplierService {

	PageInfo<SupplierPojo> Supplierquery(int pageNum,int pageSize);
	
	int SupplierAdd(SupplierPojo pojo);
	
	int SupplierUpdate(SupplierPojo pojo);
}
