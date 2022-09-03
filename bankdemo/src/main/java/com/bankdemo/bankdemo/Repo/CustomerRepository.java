package com.bankdemo.bankdemo.Repo;

import com.bankdemo.bankdemo.Entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends  JpaRepository <Customer, Integer>{
}
