package com.souramandala.service;



import java.util.Set;

import com.souramandala.entity.Customer;
import com.souramandala.entity.OrderEntity;
import com.souramandala.exception.CustomerException;

public interface CustomerService {
	
	public abstract String createUser(Customer customer) throws CustomerException;
	
	public abstract Customer getCustomerById(int custId) throws CustomerException;
	
	public abstract Customer getCustomerByUsernameAndPassword(String userName, String password) throws CustomerException;
	
	public abstract Customer updateCustomerDetails(Customer customer) throws CustomerException;
	
	public abstract String deleteCustomerById(int custId) throws CustomerException;
	
	//public abstract Set<OrderEntity> getOrdersOfCustByCustId(int custId) throws CustomerException;
	
	//public abstract String validateTheOrdersOfCustomer(int custId) throws CustomerException;

}
