package com.capg.dadims.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capg.dadims.entity.RawMaterialOrderDetails;
import com.capg.dadims.service.RawMaterialService;

@RestController
@RequestMapping(value="/rawmaterial")
@CrossOrigin(origins = "http://localhost:4200")
public class PlaceRawMaterialController {
	
	@Autowired
	RawMaterialService materialService;
	
	@PostMapping(value="/placeorder")
	public ResponseEntity<String> addRawMaterialOrder(@RequestBody RawMaterialOrderDetails materialOrderDetails){
		
		RawMaterialOrderDetails rawMaterialOrderDetails = materialService.addRawMaterialOrder(materialOrderDetails);
		return new ResponseEntity<String>("RawMaterialOrder placed successfully and your orderid is"+rawMaterialOrderDetails.getOrderId(),new HttpHeaders(),HttpStatus.OK);		
	}
		
		
	}


