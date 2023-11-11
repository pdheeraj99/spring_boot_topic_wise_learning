package com.springboot.topic_wise_learning.customer;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class Customer {
   private final Long id;
   private final String name;

   Customer(Long id, String name) {
      this.id = id;
      this.name = name;
   }

   // Jakson library is returning JSON format based on this getters only

   @JsonIgnore
   public Long getId() {
      return id;
   }

   public String getName() {
      return name;
   }

   @Override
   public String toString() {
      return "Customer{" +
            "id=" + id +
            ", name='" + name + '\'' +
            '}';
   }
}