package com.bankdemo.bankdemo.Controller;

import com.bankdemo.bankdemo.Entity.Customer;
import com.bankdemo.bankdemo.Service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class CustomerController {

    @Autowired
    private CustomerService customerService;


    //create customer
    public ResponseEntity<Customer> saveCustomer(@RequestBody Customer customer){

    return new ResponseEntity<Customer>(customerService.saveCustomer(customer), HttpStatus.CREATED);
    }

// get all customers

    public List<Customer> getAllCustomer() {
        return customerService.getAllCustomer();
    }

    //update customers by id

//    public ResponseEntity<Customer> updateCustomer(@PathVariable("CustomerId") int CustomerId,@RequestBody Customer customer)
//    {
//
//        return new ResponseEntity<Customer>(customerService.updateCustomer( customer, CustomerId),HttpStatus.OK);
//    }


    //delete customer by id
    @DeleteMapping("{CustomerId}")
    public ResponseEntity<String> deleteCustomer(@PathVariable("CustomerId") Integer CustomerId) {

        // delete employee from DB
        System.out.println("deleted ++++++++++");
        customerService.deleteCustomer(CustomerId);

        return new ResponseEntity<String>("Customer is deleted successfully!.", HttpStatus.OK);

    }}


