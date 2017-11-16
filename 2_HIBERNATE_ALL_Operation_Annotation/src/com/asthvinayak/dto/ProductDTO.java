/**FileName:ProductDTO.java
 * 
 */
package com.asthvinayak.dto;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;
import javax.persistence.Version;

import org.hibernate.annotations.Formula;

//Entity class
@Entity
@Table(name = "PRODUCT_ANNOTATION")
public class ProductDTO {

	@Id
	// @GeneratedValue
	//// AUTO is the default strategy, so the following definition is
	// equivalent:

	// @GeneratedValue(strategy = GenerationType.AUTO)
	// create sequence hibernate_sequence start with 1 increment by 1

	// @GeneratedValue(strategy = GenerationType.IDENTITY)
	// auto_increment in the definition of table to make it self-incremental

	// @GeneratedValue(strategy = GenerationType.SEQUENCE)
	// Sequence:oracle/MySql(hibernate_sequence)

	@SequenceGenerator(name = "generator", sequenceName = "manish_sequence")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "generator")
	@Column(name = "PRODUCT_ID", nullable = false)
	private long productId;

	@Column(name = "PRODUCT_NAME")
	private String productName;

	@Column(name = "PRICE")
	private double price;

	@Transient /*
				 * @Transient annotation is used to indicate that a field is not
				 * to be persisted in the database
				 */
	@Temporal(TemporalType.TIME) // java.util.Date
	@Column(name = "PURACHASEDATE")
	private Date purachaseDate;

	@Formula(" price*10/100+price")
	private double hikePrice;

	@Formula("(SELECT MIN(p.price) FROM product_annotation p WHERE p.product_id = product_id)")
	private double minPrice;

	@Version
	@Column(name = "version")
	private Date version;

	public double getMinPrice() {
		return minPrice;
	}

	public void setMinPrice(double minPrice) {
		this.minPrice = minPrice;
	}

	public double getHikePrice() {
		return hikePrice;
	}

	public void setHikePrice(double hikePrice) {
		this.hikePrice = hikePrice;
	}

	// setter and getter method
	public long getProductId() {
		return productId;
	}

	public Date getPurachaseDate() {
		return purachaseDate;
	}

	public void setPurachaseDate(Date purachaseDate) {
		this.purachaseDate = purachaseDate;
	}

	public void setProductId(long productId) {
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

	public Date getVersion() {
		return version;
	}

	public void setVersion(Date version) {
		this.version = version;
	}

	@Override
	public String toString() {
		return "ProductDTO [productId=" + productId + ", productName=" + productName + ", price=" + price
				+ ", purachaseDate=" + purachaseDate + ", hikePrice=" + hikePrice + ", minPrice=" + minPrice + "]";
	}

}
