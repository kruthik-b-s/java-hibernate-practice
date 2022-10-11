package com.hibernatecontroller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.hibernatedto.Customer;

public class GetCustomer {

	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("kruthik");
		EntityManager entityManager = entityManagerFactory.createEntityManager();

		Customer customer = new Customer();
		customer = entityManager.find(customer.getClass(), 2);

		if (customer != null) {

			System.out.println(customer);

		} else {

			System.out.println("No customer with specified Id!!!");

		}
		
		entityManager.close();
		entityManagerFactory.close();

	}

}
