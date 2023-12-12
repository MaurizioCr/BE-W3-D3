package mauriziocrispino.entities;

import javax.persistence.*;
@Entity
public class Evento {


    @Id // <-- Indica che sarà chiave primaria (obbligatorio)
    @GeneratedValue // Si usa se si vuol fare gestire gli id al database
    int id;
    @Column (name = "Titolo")
    String titolo;

    @Column (name = "dataEvento")
    String dataEvento;

    @Column (name = "Descrizione")
    String descrizione;

    @Column(name = "Accesso")
    @Enumerated(EnumType.STRING)
    public AccessType accessType;

    @Column (name = "Limitedipartecipanti")
    int maxPartecipanti;

    public Evento(String titolo, String dataEvento, String descrizione, AccessType accessType, int maxPartecipanti) {
        this.titolo = titolo;
        this.dataEvento = dataEvento;
        this.descrizione = descrizione;
        this.accessType = accessType;
        this.maxPartecipanti = maxPartecipanti;
    }

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

    @Override
    public String toString() {
        return "Evento{" +
                "id=" + id +
                ", titolo='" + titolo + '\'' +
                ", dataEvento='" + dataEvento + '\'' +
                ", descrizione='" + descrizione + '\'' +
                ", accessType='" + accessType + '\'' +
                ", maxPartecipanti=" + maxPartecipanti +
                '}';
    }

    public AccessType getAccesType() {
        return accessType;
    }

    public void setStudentType(AccessType accessType) {
        this.accessType = accessType;
    }
}
