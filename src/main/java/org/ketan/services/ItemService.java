package org.ketan.services;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.ketan.model.Item;
import org.springframework.stereotype.Service;

@Service
public class ItemService {

	private List<Item> items = new ArrayList(Arrays.asList(Item.getJuiceItem(),
										Item.getCornflakesItem(),
										Item.getLaysItem()));
	public List<Item> getAllItems() {
		return items;
	}
	
	public Item getItem(int id) {
		for (Item item : items) {
			if(item.getItemId() == id) {
				return item;
			}
		}
		return null;
	}
	
	public void addItem(Item item) {
		System.out.println("Adding Item : " + item);
		items.add(item);
	}
	
	
	public void updateItem(Item item, int id) {
		for(int i = 0 ; i < items.size() ; i++) {
			Item tempItem = items.get(i);
				if(tempItem.getItemId() == id) {
					items.set(i, item);
				}
		}
	}

	public void deleteItem(int id) {
		for(int i = 0 ; i < items.size() ; i++) {
			Item tempItem = items.get(i);
				if(tempItem.getItemId() == id) {
					items.remove(i);
				}
		}
	}
	
}
