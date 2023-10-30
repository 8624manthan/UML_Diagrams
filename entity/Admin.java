package com.project.demo.entity;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class Admin {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int aid;
	private String ad_name;
	private String ad_email;
	private String ad_password;	
	private long ad_number;
	
//	@OneToMany(fetch=FetchType.EAGER ) 		//,optional=false 
//	@JoinColumn(name="Product_id")
//	private Product product;

	
}
