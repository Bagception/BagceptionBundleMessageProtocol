package de.uniulm.bagception.bundlemessageprotocol.entities;

public class ItemAttribute {
	
	int id;
	int item_id;
	String temperature;
	String weather;
	String lightness;
	
	
//------------------------- constructors -------------------------//
	
	public ItemAttribute() {
		
	}
	
	public ItemAttribute (int item_id, String temperature, String weather, String lightness) {
		this.item_id = item_id;
		this.temperature = temperature;
		this.weather = weather;
		this.lightness = lightness;
	}
	
	public ItemAttribute (int id, int item_id, String temperature, String weather, String lightness) {
		this.id = id;
		this.item_id = item_id;
		this.temperature = temperature;
		this.weather = weather;
		this.lightness = lightness;
	}
	
	
//------------------------- setter -------------------------//
	
	public void setId(int id) {
		this.id = id;
	}
	
	public void setItemId(int item_id) {
		this.item_id = item_id;
	}
	
	public void setTemperature(String temperature) {
		this.temperature = temperature;
	}
	
	public void setWeather(String weather) {
		this.weather = weather;
	}
	
	public void setLightness(String lightness) {
		this.lightness = lightness;
	}
	
	
//------------------------- getter -------------------------//
	
	public long getId() {
		return this.id;
	}
	
	public int getItemId() {
		return this.item_id;
	}
	
	public String getTemperature() {
		return this.temperature;
	}
	
	public String getWeather() {
		return this.weather;
	}
	
	public String getLightness() {
		return this.lightness;
	}

}























