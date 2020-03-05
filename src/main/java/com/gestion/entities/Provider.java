package com.gestion.entities;



import java.util.*;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotBlank;

@Entity
public class Provider {
	
	private Long id;
	
	
	@NotBlank(message = "Name is mandatory")
	@Column(name = "name")
	private String name;
	

	@NotBlank(message = "Address is mandatory")
	@Column(name = "address")
	private String address;
	

	@NotBlank(message = "Email is mandatory")
	@Column(name = "email")
	private String email;

	public Provider() {
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}

	
	private List<Article> articles;
	@OneToMany(cascade=CascadeType.ALL,mappedBy = "provider")
	public List<Article> getArticles(){
		return articles;
	}
	public void setArticles(List<Article> articles) {
		this.articles=articles;
	}
	@Override
	public String toString() {
		return "Provider [id=" + id + ", name=" + name + ", address=" + address + ", email=" + email + "]";
	}
	
	

}
