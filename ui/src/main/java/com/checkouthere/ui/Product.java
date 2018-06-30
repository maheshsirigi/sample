/**
 * 
 */
package com.checkouthere.ui;

import java.io.Serializable;

/**
 * @author manasamahesh
 *
 */
public class Product implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 6727292701498905563L;
	private String productID;
	private String name;
	private String description;
	private float price;
	public String getProductID() {
		return productID;
	}
	public void setProductID(String productID) {
		this.productID = productID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
}
