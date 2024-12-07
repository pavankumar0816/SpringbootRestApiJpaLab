package com.klef.jfsd.exam.model;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="order_table")
public class Order 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
	
	@Column(name="order_id")
	private String orderId;
	
	@Column(name="product_name")
	private String pname;
	
	@Column(name="order_date")
	private LocalDate orderDate;
	
	
	
	@Column(name="quantity")
	private int quantity;



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getOrderId() {
		return orderId;
	}



	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}



	public String getPname() {
		return pname;
	}



	public void setPname(String pname) {
		this.pname = pname;
	}



	public LocalDate getOrderDate() {
		return orderDate;
	}



	public void setOrderDate(LocalDate orderDate) {
		this.orderDate = orderDate;
	}



	public int getQuantity() {
		return quantity;
	}



	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
}
