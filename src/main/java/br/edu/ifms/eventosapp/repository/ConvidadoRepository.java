package br.edu.ifms.eventosapp.repository;

import br.edu.ifms.eventosapp.models.Convidado;
import br.edu.ifms.eventosapp.models.Evento;
import org.springframework.data.repository.CrudRepository;

public interface ConvidadoRepository extends CrudRepository<Convidado, String>{
    Iterable<Convidado> findByEvento(Evento evento);
    Convidado findByRg(String cpf);
}