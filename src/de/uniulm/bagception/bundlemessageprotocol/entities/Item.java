package de.uniulm.bagception.bundlemessageprotocol.entities;

import java.util.ArrayList;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class Item{

	private String name;
	private String category;
	private String tagid;
	private String activityIndependent;
	private String visibility;
	
	
	private String description;
	private ArrayList<String> tagIDs;
	
	
	public Item(String name, String category, String tagid, String activityIndependent, String visibility) {
		this.name = name;
		this.category = category;
		this.tagid = tagid;
		this.activityIndependent = activityIndependent;
		this.visibility = visibility;
	}
	
	public Item(String name,String description,ArrayList<String> tagIDs){
		this.name=name;
		this.description=description;
		this.tagIDs=tagIDs;
	}
	public Item(String name){
		this(name,"");
	}
	public Item(String name,String description){
		this(name,description,new ArrayList<String>());
	}
	
	
	public String getName() {
		return name;
	}
	public String getCategory() {
		return category;
	}
	public String getTagId() {
		return tagid;
	}
	public String getActivityIndependent() {
		return activityIndependent;
	}
	public String getVisibility() {
		return visibility;
	}
	
	
	
	
	public String getDescription() {
		return description;
	}
	public List<String> getIds(){
		return tagIDs;
	}
	

	
	@Override
	/**
	 * converts the object to json
	 */
	public String toString() {
		JSONObject obj = new JSONObject();
		try {
			obj.put("name", name);
			obj.put("description", description);
			
//			obj.put("category", category);
//			obj.put("tagid", tagid);
//			obj.put("activityIndependent", activityIndependent);
//			obj.put("visibility", visibility);
			
			JSONArray ar = new JSONArray();
			for (String id:tagIDs){
				ar.put(id);
			}
			obj.put("tagIDs", ar);
			return obj.toString();
		} catch (JSONException e) {
			e.printStackTrace();
		}
		
		return null;
	}
	
	
	public static Item fromJSON(JSONObject obj) throws JSONException{
		String name = (String) obj.getString("name");
		String description = (String) obj.getString("description");
		
//		String category = (String) obj.getString("category");
//		String tagid = (String) obj.getString("tagid");
//		String activityIndependent = (String) obj.getString("activityIndependent");
//		String visibility = (String) obj.getString("visibility");
		
		JSONArray ar = obj.getJSONArray("tagIDs");
		ArrayList<String> tagIDs = new ArrayList<String>();
		for (int i=0;i<ar.length();i++){
			tagIDs.add(ar.getString(i));
		}
		return new Item(name,description,tagIDs);
		
//		return new Item(name, category, tagid, activityIndependent, visibility);
		
	}
	
	
	
}
