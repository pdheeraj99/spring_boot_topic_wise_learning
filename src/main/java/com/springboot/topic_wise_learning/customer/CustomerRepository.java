package com.springboot.topic_wise_learning.customer;

import org.springframework.context.annotation.Primary;

import java.util.Collections;
import java.util.List;

@Primary
public class CustomerRepository implements CustomerRepo {
   @Override
   public List<Customer> getCustomers() {
      return Collections.singletonList(
            new Customer(1L, "TODO. Implement real db"));

   }
}