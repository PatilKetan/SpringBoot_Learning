package org.ketan.controllers;

import java.util.List;

import org.ketan.model.Item;
import org.ketan.services.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ItemController {
	
	@Autowired
	private ItemService itemService;

	@RequestMapping("/items")
	public List<Item> getAllItems()  {
		return itemService.getAllItems();
	}
	
	@RequestMapping("/item/{id}")
	public Item getItem(@PathVariable int id){
		return itemService.getItem(id);
	}
	
	@RequestMapping(method = RequestMethod.POST, value = "/items")
	public void addItem(@RequestBody Item item) {
		itemService.addItem(item);
	}
	
	@RequestMapping(method = RequestMethod.PUT, value = "/item/{id}")
	public void updateItem(@RequestBody Item item, @PathVariable int id) {
		itemService.updateItem(item, id);
	}
	
	@RequestMapping(method = RequestMethod.DELETE, value = "/item/{id}")
	public void deleteItem(@PathVariable int id) {
		itemService.deleteItem(id);
	}
}
