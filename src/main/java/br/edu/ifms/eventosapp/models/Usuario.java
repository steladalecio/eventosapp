package br.edu.ifms.eventosapp.models;

import javax.persistence.*;

@Entity
public class Usuario<NewEntity> {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    private String cpf;
    private String nomeConvidado;

    @ManyToOne
    @JoinColumn(name = "new_entity_id")
    private NewEntity newEntity;

    private Evento evento;

    public String getId() {
        return String.valueOf(id);
    }

    public void setId(Long id) {
        this.id = id;
    }

    public NewEntity getNewEntity() {
        return newEntity;
    }

    public void setNewEntity(NewEntity newEntity) {
        this.newEntity = newEntity;
    }

    public String getCpf () {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public String getNomeConvidado() {
        String nomeConvidado = "";
        return nomeConvidado;
    }
    public void setNomeConvidado(String nomeConvidado) {
    }
    public br.edu.ifms.eventosapp.models.  Evento getEvento() {
        br.edu.ifms.eventosapp.models.Evento evento = null;
        return evento;
    }
    public void setEvento(Evento evento) {
        this.evento = evento;
    }


}


