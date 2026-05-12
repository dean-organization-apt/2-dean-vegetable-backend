package com.projectinventory.veggtables.entity;

import java.io.Serializable;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="product")
public class Product implements Serializable{

	
	private static final long serialVersionUID = -7468567075377356556L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	@Column(name="idproduct")
	private Integer idproduct;
	
	@Column(name="name")
	private String name;
	
	@Column(name="price")
	private Double price; 
	
	@Column(name="quantity")
	private Integer quantity;
	
	@Column(name="category")
	private String category;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="admin_idadmin")
	private Admin admin;

	

}
