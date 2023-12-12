package mauriziocrispino.dao;

import mauriziocrispino.entities.Evento;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

public class eventsDAO {

    private final EntityManager em;

    public eventsDAO(EntityManager em) {
        this.em = em;
    }
    public void save(Evento evento) {
        // 0. Ho bisogno di una transazione (mi viene fornita dall'EntityManager
        EntityTransaction transaction = em.getTransaction();

        // 1. Inizio la transazione
        transaction.begin();

        // 2. Aggiungo lo studente al Persistence Context (ma non è ancora salvato a DB in questo momento)
        em.persist(evento);

        // 3. Concludo la transazione col salvataggio effettivo di una nuova riga nella tabella students
        transaction.commit();

        System.out.println("Evento " + evento.getTitolo() + " aggiunto correttamente!");
    }

    public Evento findById(long id) {
        // SELECT * FROM students WHERE id = 1
        return em.find(Evento.class, id); // Primo parametro è l'Entity, secondo l'id da ricercare
    }


    public void findByIdAndDelete(long id) {
        // 1. Cerco lo studente in db
        Evento found = this.findById(id);

        if (found != null) {
            // 2. Se lo studente c'è lo elimino

            // 2.0 Ho bisogno di una transazione (mi viene fornita dall'EntityManager
            EntityTransaction transaction = em.getTransaction();

            // 2.1 Inizio la transazione
            transaction.begin();

            // 2.2 Rimuovo l'oggetto dal Persistence Context (in questo momento non sarà ancora rimosso da DB)
            em.remove(found);

            // 2.3. Concludo la transazione con la rimozione effettiva di una riga dalla tabella students
            transaction.commit();

            System.out.println("Evento " + found.getTitolo() + " eliminato correttamente!");

        } else {
            // 3. Se non c'è --> "Non trovato"
            System.out.println("L'evento " + id + " non è stato trovato");
        }


    }
}
