package com.projectinventory.veggtables.dto;


public class ProductDTO {

	private String name;
	private Double price;
	private Integer quantity;
	private String category;
	private Integer idadmin;
	
	public Integer getIdadmin() {
		return idadmin;
	}
	public void setIdadmin(Integer idadmin) {
		this.idadmin = idadmin;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public Integer getQuantity() {
		return quantity;
	}
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	
	
	
}
