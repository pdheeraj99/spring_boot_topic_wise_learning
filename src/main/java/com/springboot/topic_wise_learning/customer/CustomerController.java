package com.springboot.topic_wise_learning.customer;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {
   @Autowired
   private CustomerService customerService;

   @GetMapping
   List<Customer> getCustomer() {
      return customerService.getCustomer();
   }
}
