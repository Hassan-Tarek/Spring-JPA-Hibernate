package com.jpa.hibernate;

import com.jpa.hibernate.entity.User;
import com.jpa.hibernate.persistence.CustomPersistenceUnitInfo;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import org.hibernate.jpa.HibernatePersistenceProvider;

public class Main {
    public static void main(String[] args) {

//        EntityManagerFactory emf =
//                Persistence.createEntityManagerFactory("spring-jpa-hibernate");

        CustomPersistenceUnitInfo pui = new CustomPersistenceUnitInfo();
        HibernatePersistenceProvider provider = new HibernatePersistenceProvider();
        EntityManagerFactory emf = provider.createContainerEntityManagerFactory(pui, pui.getProperties());

        EntityManager em = emf.createEntityManager(); // represents the context

        try {
            em.getTransaction().begin();
//            em.persist();   --> Adding an entity in the context.
//            em.find();      --> Finds by PK, Gets from the DB and add it to the context if it doesn't exist.
//            em.remove();    --> Marking entity for removal.
//            em.merge();     --> Merges an entity from outside the context to the context.
//            em.refresh();   --> Mirror the context from the DB.
//            em.detach();    --> Taking the entity out of the context.

            User user = new User("Alice", "Bob",
                    "alice@gmail.com", "1234");
            em.persist(user);      // add this to the context

            em.getTransaction().commit();
        } finally {
            em.close();
        }
    }
}
