package com.styletrademark.ecommerce.dto;




import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Item {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	String name;
	String brand;
	String size;
	String description;
	String type;
	int quantity;
	double price;
	private String picture;


}
//@Lob
//@Column(columnDefinition = "MEDIUMBLOB")
//byte[] picture;
//
//public String base64Image() {
//	return Base64.encodeBase64String(picture);
//}