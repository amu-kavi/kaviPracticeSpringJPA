package com.ninja.libraries.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

/* Lombok is used to reduce
 *  boilerplate code for model/data objects, 
 *  e.g., it can generate getters and setters for
 *   those object automatically by using Lombok 
 *   annotations.*/
@Entity
@Data
public class Users {

	@Id
	private String userId;
	@Column(name="firstName")
	private String firstName;
	@Column(name="lastName")
	private String lastName;
	@Column(name="role")
	private String role;
	@Column(name="cadder")
	private String cadder;

	public Users() {
		
	}
}
