package br.edu.ifms.eventosapp.repository;
import org.springframework.data.repository.CrudRepository;

import br.edu.ifms.eventosapp.models.Evento;

    public interface EventoRepository extends CrudRepository<Evento, String> {
        Evento findByCodigo(long codigo);
    }