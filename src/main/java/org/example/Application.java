package org.example;

import mauriziocrispino.dao.eventsDAO;
import mauriziocrispino.entities.Evento;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Application {
    private static final EntityManagerFactory emf = Persistence.createEntityManagerFactory("gestioneeventi");

    public static void main(String[] args) {
        EntityManager em = emf.createEntityManager();
        eventsDAO sd = new eventsDAO(em);
        System.out.println("Ciao");
        Evento newevent = new Evento("Concerto","21/12/2023", "Evento invernale", "Pubblico", 5000);
        System.out.println("Nuovo evento: "+ newevent);
    }
}
