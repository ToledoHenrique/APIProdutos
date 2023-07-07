package br.atitus.turmaB.APIProdutos.APIProdutos.Repositories;

import java.util.Optional;

import org.springframework.stereotype.Repository;

import br.atitus.turmaB.APIProdutos.APIProdutos.Entities.Usuario;

@Repository
public interface UsuarioRepository extends GenericRepository<Usuario>{
	
	Optional<Usuario> findByEmail(String email);
}