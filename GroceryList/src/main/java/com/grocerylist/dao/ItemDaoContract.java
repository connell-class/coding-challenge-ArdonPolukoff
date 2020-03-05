package com.grocerylist.dao;

import org.springframework.data.repository.CrudRepository;

import com.grocerylist.model.Item;

public interface ItemDaoContract extends CrudRepository<Item, Integer>{

}
