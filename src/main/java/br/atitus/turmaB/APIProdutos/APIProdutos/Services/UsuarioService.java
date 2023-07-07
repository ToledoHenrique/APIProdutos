package br.atitus.turmaB.APIProdutos.APIProdutos.Services;

import org.springframework.security.core.userdetails.UserDetailsService;
import br.atitus.turmaB.APIProdutos.APIProdutos.Entities.Usuario;

public interface UsuarioService extends GenericService<Usuario>, UserDetailsService {

}