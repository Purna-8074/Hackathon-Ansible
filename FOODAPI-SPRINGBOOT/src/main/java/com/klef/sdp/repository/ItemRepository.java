package com.klef.sdp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.klef.sdp.model.Item;
import com.klef.sdp.model.RestaurantManager;

@Repository
public interface ItemRepository extends JpaRepository<Item,Integer>
{
	public List<Item> findByManager(RestaurantManager manager);
	
	 @Query("select count(e) from Item e")
	 public long itemcount();
}