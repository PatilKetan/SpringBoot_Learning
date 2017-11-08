
package org.ketan.model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Item {
	
	private int itemId;
	private String itemName;
	private Date manufacturedDate;
	private Date expiryDate;
	

	
	public Item() {
	}
	public Item(int itemId, String itemName, Date manufacturedDate, Date expiryDate) {
		this.itemId = itemId;
		this.itemName = itemName;
		this.manufacturedDate = manufacturedDate;
		this.expiryDate = expiryDate;
	}
	
	
	public int getItemId() {
		return itemId;
	}
	public void setItemId(int itemId) {
		this.itemId = itemId;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public Date getManufacturedDate() {
		return manufacturedDate;
	}
	public void setManufacturedDate(Date manufacturedDate) {
		this.manufacturedDate = manufacturedDate;
	}
	public Date getExpiryDate() {
		return expiryDate;
	}
	public void setExpiryDate(Date expiryDate) {
		this.expiryDate = expiryDate;
	}

	
	@Override
	public String toString() {
		return "Item [itemId=" + itemId + ", itemName=" + itemName + ", manufacturedDate=" + manufacturedDate
				+ ", expiryDate=" + expiryDate + "]";
	}
	
	
	//Dummy DUMB static object factories
	public static Item getJuiceItem(){
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		try {
			return new Item(1,"juice",
							sdf.parse("2014-09-11"),
							sdf.parse("2015-09-11"));
		} catch (ParseException e) {
			e.printStackTrace();
			return null;
		}
	}
	public static Item getCornflakesItem(){
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		try {
			return new Item(2,"Corn Flakes",
							sdf.parse("2014-12-21"), 
							sdf.parse("2015-09-11"));
		} catch (ParseException e) {
			e.printStackTrace();
			return null;
		}
	}
	public static Item getLaysItem(){
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		try {
			return new Item(3,"Lays",
							sdf.parse("2014-12-21"), 
							sdf.parse("2015-09-11"));
		} catch (ParseException e) {
			e.printStackTrace();
			return null;
		}
	}
	
}
