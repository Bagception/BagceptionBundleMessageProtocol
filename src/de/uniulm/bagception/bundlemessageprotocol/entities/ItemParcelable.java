package de.uniulm.bagception.bundlemessageprotocol.entities;

import java.util.ArrayList;

import android.os.Parcel;
import android.os.Parcelable;

public class ItemParcelable implements Parcelable{

	
	private String name;
	private String description;
	private ArrayList<String> tagIDs;
	
	
	
	public ItemParcelable(String name,String description,ArrayList<String> tagIDs){
		this.name=name;
		this.description=description;
		this.tagIDs=tagIDs;
	}
	public ItemParcelable(String name){
		this(name,"");
	}
	public ItemParcelable(String name,String description){
		this(name,description,new ArrayList<String>());
	}
	
	
	public String getName() {
		return name;
	}
	public String getDescription() {
		return description;
	}
	
	
	public ItemParcelable(Parcel in){
		readFromParcel(in); 
	}
	
	
	private void readFromParcel(Parcel in) {
		name = in.readString();
		description = in.readString();
		tagIDs = in.readArrayList(null);
	}
	
	@Override
	public int describeContents() {
		return 0;
	}

	@Override
	public void writeToParcel(Parcel out, int flags) {
		out.writeString(name);
		out.writeString(description);
		out.writeStringList(tagIDs);
	}
}
