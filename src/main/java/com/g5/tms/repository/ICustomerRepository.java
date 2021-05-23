package com.g5.tms.repository;

import java.util.List;

import com.g5.tms.entities.Customer;
import com.g5.tms.exceptions.CustomerNotFoundException;
import com.g5.tms.exceptions.PackageNotFoundException;
import com.g5.tms.exceptions.RouteNotFoundException;

public interface ICustomerRepository {

	public Customer addCustomer(Customer customer);
	public Customer updateCustomer(Customer customer) throws CustomerNotFoundException;
	public Customer deleteCustomer(Customer customer) throws CustomerNotFoundException;
	public Customer viewCustomer(int custid) throws CustomerNotFoundException;
	public List<Customer> viewAllCustomers(int packageId)throws PackageNotFoundException;
	public List<Customer> viewCustomerList(int routeId)throws RouteNotFoundException;

	
	
	
}
