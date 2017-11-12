package com.asthvinayak.dto;

import java.math.BigDecimal;
import java.util.Date;

//domain class
public class ProductDTO {
	private int productId;
	private String productName;
	private double price;
	private BigDecimal tax;
	private Date purchaseDate;

	// default constructor
	public ProductDTO() {
	}

	// minimal constructor
	public ProductDTO(int productId) {
		this.productId = productId;
	}

	// setter and getter method
	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public BigDecimal getTax() {
		return tax;
	}

	public void setTax(BigDecimal tax) {
		this.tax = tax;
	}

	public Date getPurchaseDate() {
		return purchaseDate;
	}

	public void setPurchaseDate(Date purchaseDate) {
		this.purchaseDate = purchaseDate;
	}

	@Override
	public String toString() {
		return "ProductDTO [productId=" + productId + ", productName=" + productName + ", price=" + price + ", tax="
				+ tax + ", purchaseDate=" + purchaseDate + "]";
	}

}
