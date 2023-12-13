package mauriziocrispino.entities;

import javax.persistence.*;

@Entity
public class Luogo {
    @Id
    @GeneratedValue
    private long id;

    public String Nome;

    public String città;

    @OneToOne
    @JoinColumn(name = "evento_id", nullable = false, unique = true)
    public Evento evento;

    public Luogo(String nome, String città, Evento evento) {
        Nome = nome;
        this.città = città;
        this.evento = evento;
    }

    public long getId() {
        return id;
    }

    public Evento getEvento() {
        return evento;
    }

    public void setEvento(Evento evento) {
        this.evento = evento;
    }

    public Luogo(String nome, String città) {
        Nome = nome;
        this.città = città;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public String getCittà() {
        return città;
    }

    public void setCittà(String città) {
        this.città = città;
    }

    @Override
    public String toString() {
        return "Luogo{" +
                "id=" + id +
                ", Nome='" + Nome + '\'' +
                ", città='" + città + '\'' +
                ", evento=" + evento +
                '}';
    }
}
