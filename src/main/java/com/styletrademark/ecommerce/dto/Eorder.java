package com.styletrademark.ecommerce.dto;

import java.time.LocalDateTime;
import java.util.List;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import lombok.Data;

@Entity
@Data
public class Eorder {
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	private int id;
	private String orderId;
	private String paymentId;
	@ManyToMany(fetch = FetchType.EAGER)
	private List<Item> items;
	private double price;
	@CreationTimestamp
	LocalDateTime timeStamp;
	private boolean status;
	


}
