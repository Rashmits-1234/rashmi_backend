package com.excel.hibernate_rashmi.services;

/*import com.excel.hibernate_rashmi.entity.Mechanic;
import com.excel.hibernate_rashmi.entity.Notification;
import com.excel.hibernate_rashmi.entity.Role;
import com.excel.hibernate_rashmi.entity.ServiceBooking;
import com.excel.hibernate_rashmi.entity.ServiceCenter;
import com.excel.hibernate_rashmi.entity.ServiceHistory;
import com.excel.hibernate_rashmi.entity.Task;
import com.excel.hibernate_rashmi.entity.User;
import com.excel.hibernate_rashmi.entity.UserRoles;
import com.excel.hibernate_rashmi.entity.Vehicle;*/

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class MainRunner {

    public static void main(String[] args) {
       
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vbs");

        EntityManager entityManager = entityManagerFactory.createEntityManager();

        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();

        try {
           

            
            transaction.commit();
        } catch (Exception ex) {
            if (transaction != null && transaction.isActive()) {
                transaction.rollback();
            }
            ex.printStackTrace();
        } finally {
            
            if (entityManager != null) {
                entityManager.close();
            }
            if (entityManagerFactory != null) {
                entityManagerFactory.close();
            }
        }
    }
}