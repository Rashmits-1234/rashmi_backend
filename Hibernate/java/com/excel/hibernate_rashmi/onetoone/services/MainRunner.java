package com.excel.hibernate_rashmi.onetoone.services;
import com.excel.hibernate_rashmi.onetoone.entity.Markscard;
import com.excel.hibernate_rashmi.onetoone.entity.Student1;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class MainRunner {

	private static EntityManagerFactory factory;
	private static EntityManager manager;
	private static EntityTransaction transaction;

	public static void main(String[] args) {

		factory = Persistence.createEntityManagerFactory("student1");
		manager = factory.createEntityManager();
		transaction = manager.getTransaction();

		Student1 st = new Student1();
		st.setName("john");
		st.setAge(23);
		
		Markscard mc = new Markscard();
		mc.setMarks(95);
		mc.setGrade("A+");
		mc.setStudent(st);

		transaction.begin();
		manager.persist(st);
		manager.persist(mc);
		transaction.commit();

		manager.close();

	}

}
