package com.devsuperior.dsvendas.dto;

import java.io.Serializable;

import com.devsuperior.dsvendas.entities.Seller;

public class SaleSumDTO implements Serializable {
	private static final long serialVersionUID = 1l;
	private String selleName;
	private double sum;
	
	
	
	
	public SaleSumDTO() {
		
		
		
	}

	public SaleSumDTO(Seller seller, double sum) {
		this.selleName = seller.getName();
		this.sum = sum;
	}

	public String getSelleName() {
		return selleName;
	}

	public void setSelleName(String selleName) {
		this.selleName = selleName;
	}

	public double getSum() {
		return sum;
	}

	public void setSum(double sum) {
		this.sum = sum;
	}
	
	
	
	
	

}
