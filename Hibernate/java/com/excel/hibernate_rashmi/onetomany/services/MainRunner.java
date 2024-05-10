package com.excel.hibernate_rashmi.onetomany.services;

import com.excel.hibernate_rashmi.onetomany.entity.Student2;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class MainRunner {

	private static EntityManagerFactory factory;
	private static EntityManager manager;
	private static EntityTransaction transaction;

	public static void main(String[] args) {

		factory = Persistence.createEntityManagerFactory("student");
		manager = factory.createEntityManager();
		transaction = manager.getTransaction();

		Student2 st = new Student2();
		st.setName("john");
		st.setAge(23);

		transaction.begin();
		manager.persist(st);
		transaction.commit();

		manager.close();

	}

}
