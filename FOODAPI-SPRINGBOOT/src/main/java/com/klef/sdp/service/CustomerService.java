package com.klef.sdp.service;

import java.util.List;

import com.klef.sdp.model.BookItem;
import com.klef.sdp.model.Customer;
import com.klef.sdp.model.Item;

public interface CustomerService 
{
  public String customerregistration(Customer customer);
  public Customer checkcustomerlogin(String username,String password);
  
  public String customerupdateprofile(Customer customer);
  
  public List<Item> viewallevents();
  
  public Customer getCustomerById(int cid);
  public Item getEventById(int eid);
  
  public String bookevent(BookItem bookEvent);
  public List<BookItem> getbookedeventsByCustomer(int cid);
  
}