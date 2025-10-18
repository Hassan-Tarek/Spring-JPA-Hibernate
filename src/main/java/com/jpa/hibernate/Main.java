package com.jpa.hibernate;

import com.jpa.hibernate.entity.User;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Main {
    public static void main(String[] args) {

        EntityManagerFactory emf =
                Persistence.createEntityManagerFactory("spring-jpa-hibernate");
        EntityManager em = emf.createEntityManager(); // represents the context

        try {
            em.getTransaction().begin();

            User user = new User("Alice", "Bob",
                    "alice@gmail.com", "1234");
            em.persist(user);      // add this to the context

            em.getTransaction().commit();

            System.out.println("Inserted Users:");
            em.createQuery("select u from User u", User.class)
                    .getResultList()
                    .forEach(System.out::println);
        } finally {
            em.close();
        }
    }
}
