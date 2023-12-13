package mauriziocrispino.dao;

import mauriziocrispino.entities.Evento;
import mauriziocrispino.entities.Luogo;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

public class LuogoDAO {

    private final EntityManager em;

    public LuogoDAO(EntityManager em) {
        this.em = em;
    }
    public void save(Luogo luogo) {

        EntityTransaction transaction = em.getTransaction();
        transaction.begin();

        em.persist(luogo);
        transaction.commit();

        System.out.println("Luogo " + luogo.getCittà() + " aggiunto correttamente!");
    }

    public Luogo findById(long id) {
        return em.find(Luogo.class, id);
    }


    public void findByIdAndDelete(long id) {
        Luogo found = this.findById(id);

        if (found != null) {

            EntityTransaction transaction = em.getTransaction();
            transaction.begin();

            em.remove(found);
            transaction.commit();

            System.out.println("Luogo " +id +" "+ found.getCittà() + " eliminato correttamente!");
        } else {
            System.out.println("Luogo " + id + " non è stato trovato");
        }


    }
}
