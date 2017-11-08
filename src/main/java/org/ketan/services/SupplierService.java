package org.ketan.services;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.ketan.model.Item;
import org.ketan.model.Supplier;
import org.springframework.stereotype.Service;

@Service
public class SupplierService {
	 
	private List<Supplier> suppliers = new ArrayList(Arrays.asList(Supplier.getJackSupplier(),
													Supplier.getJimSupplier(),
													Supplier.getJonnySupplier()));
	
	public List<Supplier> getAllSuppliers() {
		return suppliers;
	}
	
	public Supplier getSupplier(int id) {
		for (Supplier supplier : suppliers) {
			if(supplier.getId() == id) {
				return supplier;
			}
		}
		return null;
	}
	
	public void addSupplier(Supplier supplier) {
		suppliers.add(supplier);
	}
	
	public void updateSupplier(Supplier supplier, int id) {
		for(int i = 0 ; i < suppliers.size() ; i++) {
			Supplier tempSupplier = suppliers.get(i);
				if(tempSupplier.getId() == id) {
					suppliers.set(i, supplier);
				}
		}
	}
	
	public void deleteSupplier(int id) {
		for(int i = 0 ; i < suppliers.size() ; i++) {
			Supplier tempSupplier = suppliers.get(i);
				if(tempSupplier.getId() == id) {
					suppliers.remove(i);
				}
		}
	}
}
