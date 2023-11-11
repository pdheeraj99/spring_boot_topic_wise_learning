package com.springboot.topic_wise_learning.customer;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CustomerConfig {

   @Value("${app.useFakeCustomerRepo:false}")
   private Boolean useFakeCustomerRepo;

   @Bean
   CommandLineRunner commandLineRunner() {
      return args -> {
         System.out.println("Command line runner hooray");
      };
   }

   @Bean
   public CustomerRepo customerRepo() {
      System.out.println("useFakeCustomerRepo = " + useFakeCustomerRepo);
      return useFakeCustomerRepo ? new CustomerFakeRepository() : new CustomerRepository();
   }
}