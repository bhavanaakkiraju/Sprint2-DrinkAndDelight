package com.capg.dadims.entity;
import java.io.Serializable;
import java.sql.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.persistence.InheritanceType;
import org.springframework.format.annotation.DateTimeFormat;


@Entity
@Inheritance(strategy=InheritanceType.JOINED)
@Table(name = "rawmaterialorderdetail1")
public class RawMaterialOrderDetails{

	@Id
	@Column(name="orderId",length=5)
	@GeneratedValue
	private int orderId;
	@Column(length=25)
    private String itemName;
	@Column(length=10)
	private int quantityUnit;
	@Column(length=10)
	private double pricePerUnit;
	@Column(length=10)
    private double totalPrice=(pricePerUnit*quantityUnit);
	@Column(length=20)
	
	private Date orderDate;
	@Column(length=20)
	//@NotEmpty(message="Please provide the Delivery Date")
	private Date deliveryDate;
	@Column(length=25)
	//@NotEmpty(message="Please provide the Delivery Status")
	private String deliveryStatus;
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
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
	public double getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(double totalPrice) {
		this.totalPrice = this.pricePerUnit *this.quantityUnit;
	}
	public Date getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}
	public Date getDeliveryDate() {
		return deliveryDate;
	}
	public void setDeliveryDate(Date deliveryDate) {
		this.deliveryDate = deliveryDate;
	}
	public String getDeliveryStatus() {
		return deliveryStatus;
	}
	public void setDeliveryStatus(String deliveryStatus) {
		this.deliveryStatus = deliveryStatus;
	}

	
	
	
	
	

	
	

	
	

	
	

}
