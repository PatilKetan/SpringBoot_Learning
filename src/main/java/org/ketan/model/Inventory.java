package org.ketan.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Inventory {
	//itemId and SupplierId will be the combined primary key
	//this wont be a list
	private int id;
	private List<Supplier> suppliers = new ArrayList<Supplier>();
	private List<Item> items = new ArrayList<Item>();
	
	private Date entryDate;

}
