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
public class Seller {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int s_id;
	private String s_name;
	private String s_title;
	private String s_password;
	private String s_address;
	private String img;
}
