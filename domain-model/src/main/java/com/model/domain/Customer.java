package com.model.domain;




public class Customer {

	private long id;
	private String name;
	private InventoryDate dateOfBirth;
	private String gender;
	
	public Customer() {
	}
	

	public String getMyName(String str){
		return "Hello "+str+" !!!";
	}
	
	public Customer(long id, String name, InventoryDate dateOfBirth, String gender) {
		this.id = id;
		this.name = name;
		this.dateOfBirth = dateOfBirth;
		this.gender = gender;
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

	public InventoryDate getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(InventoryDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", dateOfBirth="
				+ dateOfBirth + ", gender=" + gender + "]";
	}
	
	
}
