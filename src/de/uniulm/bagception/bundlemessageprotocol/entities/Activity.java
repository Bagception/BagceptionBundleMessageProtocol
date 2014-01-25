package de.uniulm.bagception.bundlemessageprotocol.entities;

public class Activity {
	
	int id;
	String name;
	int location_id;
	

//------------------------- constructors -------------------------//
	
	public Activity() {
		
	}
	
	public Activity(String name, int location_id) {
		this.name = name;
		this.location_id = location_id;
	}
	
	public Activity(int id, String name, int location_id) {
		this.id = id;
		this.name = name;
		this.location_id = location_id;
	}
	
	

//------------------------- setter -------------------------//
	
	public void setId(int id) {
		this.id = id;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setLocationId(int locations_id) {
		this.location_id = locations_id;
	}
	
	
	
//------------------------- getter -------------------------//
	
	public long getId() {
		return this.id;
	}
	
	public String getName(String name) {
		return this.name;
	}
	
	public int getLocationId(int location_id) {
		return this.location_id;
	}

}






























