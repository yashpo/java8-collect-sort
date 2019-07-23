package com.sb.drools;

public class Attorney {
	
	private int Id;
	private String name;
	private String address;
	 
	public Attorney(int id, String name, String address) {
		super();
		Id = id;
		this.name = name;
		this.address = address;
	}
	
	

	public int getId() {
		return Id;
	}



	public void setId(int id) {
		Id = id;
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



	@Override
	public String toString() {
		return "Attorney [Id=" + Id + ", name=" + name + ", address=" + address + "]";
	}
	 
	 

}
