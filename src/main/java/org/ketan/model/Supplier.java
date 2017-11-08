
package org.ketan.model;

import org.ketan.helper.Address;

public class Supplier {
	
	private int id;
	private String name;
	private Address address;
	
	
	public Supplier() {
	}
	public Supplier(int id, String name, Address address) {
		this.id = id;
		this.name = name;
		this.address = address;
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
	
	
	//Dummy DUMB static object factories
	public static Supplier getJackSupplier() {
		return new Supplier(1, "JD", new Address("Pune","411044"));
	}
	public static Supplier getJimSupplier() {
		return new Supplier(2, "JB", new Address("Chennai","531052"));
	}
	public static Supplier getJonnySupplier() {
		return new Supplier(3, "JW", new Address("Delhi","310134"));
	}
}
