package com.styletrademark.ecommerce.dto;

import org.apache.tomcat.util.codec.binary.Base64;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Entity
@Data
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	private String name;
	private String brand;
	private String size;
	private String description;
	private int stock;
	private double price;
	private String type;
	private String img1;
	private String img2;
	private String img3;

//	@Lob
//	@Column(columnDefinition = "MEDIUMBLOB")
//	byte[] picture;

	@ManyToOne
	private Seller seller;

//	public String base64Image() {
//		return Base64.encodeBase64String(picture);
//	}

}
