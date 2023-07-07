package br.atitus.turmaB.APIProdutos.APIProdutos.Services;

import java.util.Optional;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import br.atitus.turmaB.APIProdutos.APIProdutos.Entities.GenericEntity;
import br.atitus.turmaB.APIProdutos.APIProdutos.Repositories.GenericRepository;

public interface GenericService<TEntidade extends GenericEntity> {
	GenericRepository<TEntidade> getRepository();
	
	default void validarSave(TEntidade objeto) throws Exception {
		if (objeto.getNome() == null || objeto.getNome().isEmpty())
			throw new Exception ("É necessário informar um nome para salvar no sistema!!!");
	}
	
	default TEntidade save(TEntidade objeto) throws Exception {
		validarSave(objeto);
		return getRepository().save(objeto);
	}
	
	default Optional<TEntidade> findById(Long id) throws Exception {
		if (!getRepository().existsById(id))
			throw new Exception ("Não existe nenhum registro no sistema com o seguinte ID: " + id);
		return getRepository().findById(id);
	}
	
	default void deleteById(long id) {
		getRepository().deleteById(id);
	}
	
	default Page<TEntidade> findByNome(Pageable pageable, String nome) {
		return getRepository().findByNomeContainingIgnoreCase(pageable, nome);
	}
}