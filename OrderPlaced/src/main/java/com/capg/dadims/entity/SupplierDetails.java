package com.capg.dadims.entity;

import java.sql.Date;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.InheritanceType;

@Entity

@Table(name="supplierdetail")
@AttributeOverrides({  
    @AttributeOverride(name="orderId", column=@Column(name="orderId")),  
     
})  
public class SupplierDetails extends RawMaterialOrderDetails{
	
	@Column(length=4)
	@GeneratedValue
	private int supplierId;
	@Column(length=20)
	private String supplierName;
	@Column(length=20)
	private String materialName;
	@Column(length=50)
	private String address;
	@Column(length=10)
	private long phonenumber;
	@Column(length=25)
	private String emailId;
	@Column(length=25)
	private int TrackingId;
	@Column(length=25)
	private Date processDate;
	

	public int getSupplierId() {
		return supplierId;
	}

	public void setSupplierId(int supplierId) {
		this.supplierId = supplierId;
	}

	public String getSupplierName() {
		return supplierName;
	}

	public void setSupplierName(String supplierName) {
		this.supplierName = supplierName;
	}

	public String getMaterialName() {
		return materialName;
	}

	public void setMaterialName(String materialName) {
		this.materialName = materialName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public long getPhonenumber() {
		return phonenumber;
	}

	public void setPhonenumber(long phonenumber) {
		this.phonenumber = phonenumber;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public int getTrackingId() {
		return TrackingId;
	}

	public void setTrackingId(int trackingId) {
		TrackingId = trackingId;
	}

	public Date getProcessDate() {
		return processDate;
	}

	public void setProcessDate(Date processDate) {
		this.processDate = processDate;
	}
	

	
	
	
}
