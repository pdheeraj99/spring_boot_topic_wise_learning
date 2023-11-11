package com.springboot.topic_wise_learning.customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {

   @Autowired
   private CustomerRepo customerRepo;

   List<Customer> getCustomer() {
      return customerRepo.getCustomers();
   }
}