package mauriziocrispino.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Partecipazione {
    @Id
    @GeneratedValue
    private long id;

}
