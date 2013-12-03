package de.uniulm.bagception.bundlemessageprotocol.entities;

import android.os.Parcel;
import android.os.Parcelable;

public class ParcelHelper implements Parcelable.Creator<Item>{
	
	

	@Override
	public Item createFromParcel(Parcel source) {
		return new Item(source);
	}

	@Override
	public Item[] newArray(int size) {
		// TODO Auto-generated method stub
		return new Item[size];
	}

}
