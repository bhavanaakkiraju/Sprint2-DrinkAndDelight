package com.capg.dadims.service;

import javax.transaction.Transactional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capg.dadims.dao.RawMaterialDao;

import com.capg.dadims.dao.RawMaterialOrderDao1;
import com.capg.dadims.dao.SupplierDao;
import com.capg.dadims.entity.RawMaterialOrderDetails;
import com.capg.dadims.entity.SupplierDetails;


@Service
@Transactional
public class RawMaterialServiceImpl implements RawMaterialService{
	@Autowired
	RawMaterialDao materialorder;
	

	
	@Autowired
	SupplierDao supplierdetails;
	
	@Autowired
	RawMaterialOrderDao1 dao;

	@Override
	public RawMaterialOrderDetails addRawMaterialOrder(RawMaterialOrderDetails r) {
		// TODO Auto-generated method stub
		return dao.save(r) ;
	}



}
