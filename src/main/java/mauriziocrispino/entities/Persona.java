package mauriziocrispino.entities;

import javax.persistence.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Entity
public class Persona {
    @Id
    @GeneratedValue
    private long id;

    private String nome;
    private String cognome;
    private String email;

    @Column(name = "data_di_nascita")
    private Date dataDiNascita;

    @Column(name = "Sesso")
    @Enumerated(EnumType.STRING)
    private GenerePersona generePersona;

    @OneToMany
    @JoinTable(name = "Persona",
            joinColumns = @JoinColumn(name = "persona_id"),
            inverseJoinColumns = @JoinColumn(name = "evento_id"))
    public List<Evento> ListaEventi;

    public Persona(String nome, String cognome, String email, String dataDiNascita, GenerePersona generePersona, List<Evento> listaEventi) {
        this.nome = nome;
        this.cognome = cognome;
        this.email = email;
        this.generePersona = generePersona;
        ListaEventi = listaEventi;

        // Converto la stringa della data in un oggetto Date
        try {
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
            this.dataDiNascita = dateFormat.parse(dataDiNascita);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }


    public List<Evento> getListaEventi() {
        return ListaEventi;
    }

    public void setListaEventi(List<Evento> listaEventi) {
        ListaEventi = listaEventi;
    }

    public long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getDataDiNascita() {
        return dataDiNascita;
    }

    public void setDataDiNascita(Date dataDiNascita) {
        this.dataDiNascita = dataDiNascita;
    }

    public GenerePersona generePersona() {
        return generePersona;
    }

    public void setGenerePersona(GenerePersona generePersona) {
        this.generePersona = generePersona;
    }
}
