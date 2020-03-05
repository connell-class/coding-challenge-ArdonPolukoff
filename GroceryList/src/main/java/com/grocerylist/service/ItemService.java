package com.grocerylist.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.grocerylist.dao.ItemDaoContract;
import com.grocerylist.model.Item;


@Service
public class ItemService {
	
	@Autowired
	private ItemDaoContract itemDaoContract;
	
	public List<Item> getAllItems(){
		List<Item> items = new ArrayList<>();
		itemDaoContract.findAll().forEach(items::add);
		return items;
	}
	
	public Optional<Item> getItem(Integer serialNumber) {
		return itemDaoContract.findById(serialNumber);
	}
	
	public void addItem(Item item) {
		itemDaoContract.save(item);
	}
	
	public void updateItem(Integer serialNumber, Item item) {
		itemDaoContract.save(item);
	}
	
	
	public void delete(Integer serialNumber) {
		itemDaoContract.deleteById(serialNumber);
	}

}
