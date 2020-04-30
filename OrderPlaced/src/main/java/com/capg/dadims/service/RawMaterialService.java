package com.capg.dadims.service;

import org.springframework.beans.factory.annotation.Autowired;


import com.capg.dadims.dao.RawMaterialDao;

import com.capg.dadims.dao.SupplierDao;
import com.capg.dadims.entity.RawMaterialOrderDetails;

public interface RawMaterialService {

	RawMaterialOrderDetails addRawMaterialOrder(RawMaterialOrderDetails r);

	
}
