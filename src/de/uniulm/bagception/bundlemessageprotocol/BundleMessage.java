package de.uniulm.bagception.bundlemessageprotocol;

import java.util.ArrayList;
import java.util.HashMap;

import android.os.Bundle;
import android.os.Parcelable;
import de.uniulm.bagception.bundlemessageprotocol.entities.Item;

public class BundleMessage {

	private final String MESSAGE_TYPE_EXTRA="de.uniulm.bagception.bundle.messageprotocol.message_type";
	private final String PAYLOAD_EXTRA="payload";
	
	
	//singleton
	private static final BundleMessage instance = new BundleMessage();
	private BundleMessage(){}
	
	public BundleMessage getInstance(){
		return instance;
	}
	
	public enum BUNDLE_MESSAGE{
		NOT_A_BUNDLE_MESSAGE,ITEM_FOUND;
	}
	
	//Item
	public Bundle toItemFoundBundle(Item item){
		
		return createBundle(BUNDLE_MESSAGE.ITEM_FOUND, item);
	}
	
	public Item toItemFound(Bundle b){
		return toObject(b);
	}
	
	
	//toBundle generic
	private Bundle createBundle(BUNDLE_MESSAGE msg,HashMap<String,Parcelable> map){
		Bundle ret = new Bundle();
		for (String key:map.keySet()){
			ret.putParcelable(key, map.get(key));
		}
		ret.putInt(MESSAGE_TYPE_EXTRA, msg.ordinal());
		return ret;
	}
	
	private Bundle createBundle(BUNDLE_MESSAGE msg,Parcelable payload){
		Bundle ret = new Bundle();
		
		ret.putInt(MESSAGE_TYPE_EXTRA, msg.ordinal());
		ret.putParcelable(PAYLOAD_EXTRA, payload);
		return ret;
	}
	
	private <E extends Parcelable> E toObject(Bundle b){
		return b.getParcelable(PAYLOAD_EXTRA);
	}

	
	
	private Bundle createBundle(BUNDLE_MESSAGE msg,ArrayList<Parcelable> payload){
		Bundle ret = new Bundle();
		
		ret.putInt(MESSAGE_TYPE_EXTRA, msg.ordinal());
		ret.putParcelableArrayList(PAYLOAD_EXTRA, payload);
		return ret;
	}
	
	/**
	 * reads out the type-code and returns the appropriate {@link BUNDLE_MESSAGE} 
	 * @param b Bundle recv via Bluetooth
	 * @return the {@link BUNDLE_MESSAGE}, {@link BUNDLE_MESSAGE.NOT_A_BUNDLE_MESSAGE} if it's not a BundleMessage
	 */
	public BUNDLE_MESSAGE getBundleMessageType(Bundle b){
		int i=b.getInt(MESSAGE_TYPE_EXTRA,0);
		return BUNDLE_MESSAGE.values()[i];
	}
	
	
	
}
