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
@Table(name="adminLogin_detail")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AdminLogin {

	@Id  // Primary key
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int aLogin_id;
	private String a_username;
	private String a_pass;
}
