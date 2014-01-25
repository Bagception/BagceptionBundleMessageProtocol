package de.uniulm.bagception.bundlemessageprotocol.entities;

public class Category {
	
	int id;
	String name;
	

//------------------------- constructors -------------------------//
	
	public Category() {
		
	}
	
	public Category (String name) {
		this.name = name;
	}
	
	public Category (int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	
//------------------------- setter -------------------------//
	
	public void setId (int id) {
		this.id = id;
	}
	
	public void setName (String name) {
		this.name = name;
	}
	
	
//------------------------- getter -------------------------//
	
	public long getId() {
		return this.id;
	}
	
	public String getName() {
		return this.name;
	}

}
