package mauriziocrispino.dao;

import mauriziocrispino.entities.Evento;
import mauriziocrispino.entities.Persona;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

public class PersonaDAO {

    private final EntityManager em;

    public PersonaDAO(EntityManager em) {
        this.em = em;
    }
    public void save(Persona persona) {

        EntityTransaction transaction = em.getTransaction();
        transaction.begin();

        em.persist(persona);
        transaction.commit();

        System.out.println("Persona " + persona.getId() +" "+ persona.getNome() +" "+persona.getCognome() + " aggiunto correttamente!");
    }

    public Persona findById(long id) {
        return em.find(Persona.class, id);
    }


    public void findByIdAndDelete(long id) {
        Persona found = this.findById(id);

        if (found != null) {

            EntityTransaction transaction = em.getTransaction();
            transaction.begin();

            em.remove(found);
            transaction.commit();

            System.out.println("La persona " + found.getId() +" "+ found.getNome() +" "+ found.getCognome() +" eliminato correttamente!");
        } else {
            System.out.println("La persona " + id + " non è stato trovato");
        }


    }
}
