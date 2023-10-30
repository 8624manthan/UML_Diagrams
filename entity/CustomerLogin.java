package com.project.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="CustomerLogin_detail")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CustomerLogin {

//	@Id  // Primary key
//	@GeneratedValue(strategy=GenerationType.AUTO)
	private int cLogin_id;
	private String cl_username;
	private String cl_pass;
}
