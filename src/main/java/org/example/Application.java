package org.example;

import mauriziocrispino.dao.LuogoDAO;
import mauriziocrispino.dao.PersonaDAO;
import mauriziocrispino.dao.eventsDAO;
import mauriziocrispino.entities.AccessType;
import mauriziocrispino.entities.Evento;
import mauriziocrispino.entities.GenerePersona;
import mauriziocrispino.entities.Persona;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;

public class Application {
    private static final EntityManagerFactory emf = Persistence.createEntityManagerFactory("gestioneeventi");

    public static void main(String[] args) {
        EntityManager em = emf.createEntityManager();
        eventsDAO sd = new eventsDAO(em);
        System.out.println("Ciao");
        Evento evento = new Evento("Concerto", "21/12/2023", "Evento invernale", AccessType.PRIVATO,5000);
        //sd.save(evento);
        //System.out.println("Nuovo evento: "+evento);

        //PersonaDAO pd = new PersonaDAO(em);
        //Persona nuovaPersona = new Persona("Maurizio", "Crispino", "email@example.com", "2004/07/02", GenerePersona.M, (List<Evento>) evento);
    }
}
