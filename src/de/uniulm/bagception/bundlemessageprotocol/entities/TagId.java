package de.uniulm.bagception.bundlemessageprotocol.entities;

public class TagId {
	
	int id;
	String tag_id;
	int item_id;
	
	
//------------------------- constructors -------------------------//
	
	public TagId() {
		
	}
	
	public TagId(String tag_id, int item_id) {
		this.tag_id = tag_id;
		this.item_id = item_id;
	}
	
	public TagId(int id, String tag_id, int item_id) {
		this.id = id;
		this.tag_id = tag_id;
		this.item_id = item_id;
	}
	
	
	
//------------------------- setter -------------------------//
	
	public void setId(int id) {
		this.id = id;
	}
	
	public void setTagId(String tag_id) {
		this.tag_id = tag_id;
	}
	
	public void setItemId(int item_id) {
		this.item_id = item_id;
	}
	
	
	
//------------------------- getter -------------------------//
	
	public long getId() {
		return this.id;
	}

	public String getTagId() {
		return this.tag_id;
	}
	
	public int getItemId() {
		return this.item_id;
	}
}




















