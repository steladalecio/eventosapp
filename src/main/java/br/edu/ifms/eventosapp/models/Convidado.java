package br.edu.ifms.eventosapp.models;

import javax.persistence.ManyToOne;

public class Convidado {
    @Id
    @NotEmpty
    private String cpf;
    @NotEmpty

    private String nomeConvidado;
    @ManyToOne
    private Evento evento;

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNomeConvidado() {
        return nomeConvidado;
    }

    public void setNomeConvidado(String nomeConvidado) {
        this.nomeConvidado = nomeConvidado;
    }
    public Evento getEvento() {
        return evento;
    }
    public void setEvento(Evento evento) {
        this.evento = evento;
    }
}

