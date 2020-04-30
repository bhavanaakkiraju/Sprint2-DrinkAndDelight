package com.capg.dadims.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capg.dadims.entity.RawMaterialDetails;


public interface RawMaterialDao extends JpaRepository<RawMaterialDetails, Integer>{

}
