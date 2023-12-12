package mauriziocrispino;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

public class evento {
    @Id // <-- Indica che sarà chiave primaria (obbligatorio)
    @GeneratedValue // Si usa se si vuol fare gestire gli id al database
    int id;
    @Column (name = "Titolo")
    String titolo;

    @Column (name = "data Evento")
    String dataEvento;

    @Column (name = "Descrizione")
    String descrizione;

    @Column (name = "Accesso")
    AccessType accessType;

    @Column (name = "Limite di partecipanti")
    int maxPartecipanti;

    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public int getMaxPartecipanti() {
        return maxPartecipanti;
    }

    public void setMaxPartecipanti(int maxPartecipanti) {
        this.maxPartecipanti = maxPartecipanti;
    }

    public String getDataEvento() {
        return dataEvento;
    }

    public void setDataEvento(String dataEvento) {
        this.dataEvento = dataEvento;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    public AccessType getAccessType() {
        return accessType;
    }

    public void setAccessType(AccessType accessType) {
        this.accessType = accessType;
    }
}
