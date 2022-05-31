package br.edu.ifms.eventosapp;

import org.springframework.data.jpa.repository.JpaRepository;

public abstract class EventoRepository implements JpaRepository<br.edu.ifms.eventosapp.models.Evento, String> {
}