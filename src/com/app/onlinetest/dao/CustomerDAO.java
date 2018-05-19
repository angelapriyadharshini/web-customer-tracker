package com.app.onlinetest.dao;

import java.util.List;

import com.app.onlinetest.entity.Customer;

public interface CustomerDAO {
	public List<Customer> getCustomers();

	public void saveCustomer(Customer theCustomer);

	public Customer getCustomer(int theId);
}
