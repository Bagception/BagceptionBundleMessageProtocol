package de.uniulm.bagception.bundlemessageprotocol.entities;

public class Location {
	
	int id;
	String name;
	Float lon;
	Float lat;
	Float radius;
	String mac;
	
	
//------------------------- constructors -------------------------//
	
	public Location() {
		
	}
	
	public Location(String name, Float lon, Float lat, Float radius, String mac) {
		this.name = name;
		this.lon = lon;
		this.lat = lat;
		this.radius = radius;
		this.mac = mac;
	}
	
	public Location(int id, String name, Float lon, Float lat, Float radius, String mac) {
		this.id = id;
		this.name = name;
		this.lon = lon;
		this.lat = lat;
		this.radius = radius;
		this.mac = mac;
	}
	
	
	
//------------------------- setter -------------------------//
	
	public void setId(int id) {
		this.id = id;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setLon(Float lon) {
		this.lon = lon;
	}
	
	public void setLat(Float lat) {
		this.lat = lat;
	}
	
	public void setRadius(Float radius) {
		this.radius = radius;
	}
	
	public void setMac(String mac) {
		this.mac = mac;
	}
	
	
	
//------------------------- getter -------------------------//
	
	public long getId() {
		return this.id;
	}
	
	public String getName() {
		return this.name;
	}
	
	public Float getLon() {
		return this.lon;
	}
	
	public Float getLat() {
		return this.lat;
	}
	
	public Float getRadius() {
		return this.radius;
	}
	
	public String getMac() {
		return this.mac;
	}

}




























