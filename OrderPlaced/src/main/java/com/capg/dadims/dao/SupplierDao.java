package com.capg.dadims.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capg.dadims.entity.SupplierDetails;

public interface SupplierDao extends JpaRepository<SupplierDetails, Integer>{

}
