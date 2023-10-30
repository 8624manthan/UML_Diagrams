package com.project.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class Customer extends Admin{

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int cid;
	private String c_password;
	private String c_name;
	private String c_email;
	private String c_contact;
	private String c_address;
	
//	@OneToMany(mappedBy = "Product",cascade = CascadeType.PERSIST);
//	@JoinColumn(name = "PId")
//	@JsonIgnoreProperties("Product")
//	private Product product;
}
