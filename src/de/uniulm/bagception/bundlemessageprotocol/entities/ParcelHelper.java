package de.uniulm.bagception.bundlemessageprotocol.entities;

import android.os.Parcel;
import android.os.Parcelable;

public class ParcelHelper implements Parcelable.Creator<ItemParcelable>{
	
	

	@Override
	public ItemParcelable createFromParcel(Parcel source) {
		return new ItemParcelable(source);
	}

	@Override
	public ItemParcelable[] newArray(int size) {
		// TODO Auto-generated method stub
		return new ItemParcelable[size];
	}

}
