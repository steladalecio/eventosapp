package br.edu.ifms.eventosapp.repository;


import org.springframework.data.repository.CrudRepository;

import br.edu.ifms.eventosapp.models.Usuario;

public interface UsuarioRepository extends CrudRepository<Usuario, String>{

    Usuario findByLogin (String login);
}