package mauriziocrispino.dao;

import javax.persistence.EntityManager;

public class eventsDAO {

    private final EntityManager em;

    public eventsDAO(EntityManager em) {
        this.em = em;
    }}