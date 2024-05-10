package com.excel.hibernate_rashmi.manytomany.services;

import java.util.ArrayList;
import java.util.List;
import com.excel.hibernate_rashmi.manytomany.entity.Book;
import com.excel.hibernate_rashmi.manytomany.entity.Student3;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class MainRunner {

	public static void main(String[] args) {

		EntityManagerFactory factory = Persistence.createEntityManagerFactory("student");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		
		List<Book> books = new ArrayList<Book>();
		List<Student3> students = new ArrayList<Student3>();
		
		Book b1 = new Book();
		Book b2 = new Book();
		Book b3 = new Book();
		
		Student3 student1 = new Student3();
		Student3 student2 = new Student3();
		Student3 student3 = new Student3();
		
		b1.setTitle("Wings of fire");
		b1.setStudents(students);
		
		b2.setTitle("Chetan Bhagat");
		b2.setStudents(students);
		
		b3.setTitle("malgudi days");
		b3.setStudents(students);
		
		books.add(b1);
		books.add(b2);
		books.add(b3);

		 student1.setName("John");
	     student1.setBooks(books);
		
		 student2.setName("Oliver");
	     student2.setBooks(books);
		
		 student3.setName("Rohan");
		 student3.setBooks(books);
		
		students.add(student1);
		students.add(student2);
		students.add(student3);
		
		
		transaction.begin();
		manager.persist(students);
		manager.persist(books);
		transaction.commit();
		
		manager.close();
	}
}
	
		

		
