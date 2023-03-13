package com.example.webservices.model;

import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Profile {
	
	private long id;
	private String name;
	private int age;
	private String bio;
	
	public Profile() {
		
	}
	
	public Profile(long id, String name, int age, String bio) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.bio = bio;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getBio() {
		return bio;
	}
	public void setBio(String bio) {
		this.bio = bio;
	}
	
	
}
