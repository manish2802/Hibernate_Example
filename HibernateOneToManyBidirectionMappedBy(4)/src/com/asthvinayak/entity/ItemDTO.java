package com.asthvinayak.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Item_otm_bi_Mapped")
public class ItemDTO {

	@Id
	@Column(name = "item_id")
	private String itemId;
	@Column(name = "item_name", length = 10)
	private String itemName;
	@Column(name = "price")
	private double price;

	@ManyToOne(targetEntity = CustomerDTO.class, cascade = CascadeType.ALL)
	@JoinColumn(name = "cid_fk")
	private CustomerDTO customer;

	public String getItemId() {
		return itemId;
	}

	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public double getPrice() {
		return price;
	}

	public CustomerDTO getCustomer() {
		return customer;
	}

	public void setCustomer(CustomerDTO customer) {
		this.customer = customer;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Item [itemId=" + itemId + ", itemName=" + itemName + ", price=" + price + "]";
	}

}
