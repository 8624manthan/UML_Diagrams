package com.project.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class SellerLogin {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int sl_id;
	private String sl_name;
	private String sl_password;
}
