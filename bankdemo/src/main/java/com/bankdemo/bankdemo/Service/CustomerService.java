package com.bankdemo.bankdemo.Service;
import java.util.List;

import com.bankdemo.bankdemo.Entity.Customer;

public interface CustomerService {
    public Customer saveCustomer(Customer customer);
    public List<Customer>  getAllCustomer();
    public Customer updateCustomer(Customer customer, int CustomerId);
    public void deleteCustomer(int CustomerId);

}
