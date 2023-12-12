package org.example;

import mauriziocrispino.dao.eventsDAO;
import mauriziocrispino.entities.AccessType;
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
        Evento evento = new Evento("Concerto", "21/12/2023", "Evento invernale", AccessType.PRIVATO,5000);
        sd.save(evento);
        System.out.println("Nuovo evento: "+evento);

    }
}
