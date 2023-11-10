package com.springboot.topic_wise_learning;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class TopicWiseLearningApplication {

	public static void main(String[] args) {
		SpringApplication.run(TopicWiseLearningApplication.class, args);
	}

	@GetMapping
	Customer getCustomer() {
		return new Customer(1L, "Dheeraj");
	}

	public class Customer {
		private Long id;
		private String name;

		public Customer(Long id, String name) {
			this.id = id;
			this.name = name;
		}

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}
	}
}
