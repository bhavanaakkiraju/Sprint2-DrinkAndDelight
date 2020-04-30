package com.capg.dadims.entity;

import java.sql.Date;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "rawmaterialdetails")
public class RawMaterialDetails 
{
	    @Id
		private int rmId;
	    @Column(length=25)
		private String itemName;
	    @Column(length=25)
		private int quantityUnit;
	    @Column(length=5)
		private double pricePerUnit;
	    @Column(length=25)
		private Date manufacturingDate;
	    @Column(length=25)
	    private Date expiryDate;
		public int getRmId() {
			return rmId;
		}
		public void setRmId(int rmId) {
			this.rmId = rmId;
		}
		public String getItemName() {
			return itemName;
		}
		public void setItemName(String itemName) {
			this.itemName = itemName;
		}
		public int getQuantityUnit() {
			return quantityUnit;
		}
		public void setQuantityUnit(int quantityUnit) {
			this.quantityUnit = quantityUnit;
		}
		public double getPricePerUnit() {
			return pricePerUnit;
		}
		public void setPricePerUnit(double pricePerUnit) {
			this.pricePerUnit = pricePerUnit;
		}
		public Date getManufacturingDate() {
			return manufacturingDate;
		}
		public void setManufacturingDate(Date manufacturingDate) {
			this.manufacturingDate = manufacturingDate;
		}
		public Date getExpiryDate() {
			return expiryDate;
		}
		public void setExpiryDate(Date expiryDate) {
			this.expiryDate = expiryDate;
		}

}
