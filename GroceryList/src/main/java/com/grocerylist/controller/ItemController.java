package com.grocerylist.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.grocerylist.model.Item;
import com.grocerylist.service.ItemService;

@RestController
@RequestMapping("/food")
public class ItemController {
	
	@Autowired
	private ItemService itemService;
	
	@GetMapping("/hello")
	public String sayHi() {
		return "Hi";
	}
	
	@GetMapping("/items")
	public List<Item> getAllItems(){
		return itemService.getAllItems();
	}
	
	@GetMapping("/items/{serialNumber}")
	public Optional<Item> getItem(@PathVariable Integer serialNumber) {
		return itemService.getItem(serialNumber);
	}
	
	@PostMapping("/items")
	public void addItem(@RequestBody Item item) {
		itemService.addItem(item);
		
	}
	
	@PutMapping("/update")
	public void updateItem(Integer serialNumber, Item item) {
		itemService.updateItem(serialNumber,item);
	}
	
	@DeleteMapping("/delete")
	public void delete(Integer serialNumber) {
		itemService.delete(serialNumber);
	}

	

}
