package com.inn.product.pojo;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@DynamicInsert
@DynamicUpdate
@Table(name = "product")
@XmlRootElement(name = "product")
@JsonIgnoreProperties(value = { "hibernateLazyIntializer", "handler" })

public class ProductModel implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Id")
	private Integer id;

	@Column(name = "name")
	private String name;

	@Column(name = "price")
	private Float price;

	@Column(name = "description")
	private String description;

	public ProductModel() {

	}

	public ProductModel(Integer id, String name, Float price, String description) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.description = description;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Float getPrice() {
		return price;
	}

	public void setPrice(Float price) {
		this.price = price;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
