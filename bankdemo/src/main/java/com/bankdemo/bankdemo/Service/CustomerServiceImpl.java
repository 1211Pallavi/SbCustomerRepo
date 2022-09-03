
package com.bankdemo.bankdemo.Service;


import com.bankdemo.bankdemo.Entity.Customer;
import com.bankdemo.bankdemo.Exception.ResourceNotFoundException;
import com.bankdemo.bankdemo.Repo.CustomerRepository;

import java.util.*;

public class CustomerServiceImpl implements CustomerService {

    private CustomerRepository customerRepository;

    //save one customer (create)
    @Override
    public Customer saveCustomer(Customer customer) {
        return customerRepository.save(customer);
    }
    // get all customers (read)
    @Override
    public List<Customer> getAllCustomer() {
        return customerRepository.findAll();
    }

    //update customer with help of id(update)
    @Override
    public Customer updateCustomer(Customer customer, int CustomerId) {
        return null;
    }

    //delete the customer with the help of id (delete)

    @Override
    public void deleteCustomer(int CustomerId) {
        customerRepository.findById(CustomerId).orElseThrow(() ->
                new ResourceNotFoundException("Customer", "Id", CustomerId));
        customerRepository.deleteById(CustomerId);
    }
}
