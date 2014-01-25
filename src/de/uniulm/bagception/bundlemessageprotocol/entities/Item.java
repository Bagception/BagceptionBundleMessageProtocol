package de.uniulm.bagception.bundlemessageprotocol.entities;

import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class Item{

	int id;
	String name;
	int category;
	
//------------------------- constructors -------------------------// 	
	
	public Item() {
		
	}
	
	public Item(String name) {
		this.name = name;
	}
	
	public Item(String name, int category) {
		this.name = name;
		this.category = category;
	}
	
	public Item(int id, String name, int category){
		this.id = id;
		this.name = name;
		this.category = category;
	}
	

	
//------------------------- getter -------------------------//
	
	
	public long getId() {
		return this.id;
	}
	public String getName() {
		return this.name;
	}
	public int getCategory() {
		return this.category;
	}
	

	
//------------------------- setter -------------------------//	
	
	
	public void setId (int id) {
		this.id = id;
	}
	
	public void setItemName (String name) {
		this.name = name;
	}
	
	public void setCategory (int category) {
		this.category = category;
	}

	
	
	
	
	@Override
	/**
	 * converts the object to json
	 */
	public String toString() {
		JSONObject obj = new JSONObject();
		try {
			obj.put("name", name);
			obj.put("category", category);
			
//			JSONArray ar = new JSONArray();
//			for (String id:tagIDs){
//				ar.put(id);
//			}
//			obj.put("tagIDs", ar);
			
			return obj.toString();
		} catch (JSONException e) {
			e.printStackTrace();
		}
		
		return null;
	}
	
	
	public static Item fromJSON(JSONObject obj) throws JSONException{
		String name = (String) obj.getString("name");
		int category = (int) obj.getInt("category");

		
		JSONArray ar = obj.getJSONArray("tagIDs");
		ArrayList<String> tagIDs = new ArrayList<String>();
		for (int i=0;i<ar.length();i++){
			tagIDs.add(ar.getString(i));
		}

		return new Item(name, category);
//		return new Item(name, category, tagid, activityIndependent, visibility);
		
	}
	
	
	
}
