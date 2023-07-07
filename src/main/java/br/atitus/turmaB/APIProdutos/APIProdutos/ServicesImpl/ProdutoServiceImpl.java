package br.atitus.turmaB.APIProdutos.APIProdutos.ServicesImpl;

import org.springframework.stereotype.Service;

import br.atitus.turmaB.APIProdutos.APIProdutos.Entities.Produto;
import br.atitus.turmaB.APIProdutos.APIProdutos.Repositories.GenericRepository;
import br.atitus.turmaB.APIProdutos.APIProdutos.Repositories.ProdutoRepository;
import br.atitus.turmaB.APIProdutos.APIProdutos.Services.ProdutoService;

@Service
public class ProdutoServiceImpl implements ProdutoService{

	final ProdutoRepository produtoRepository;
	public ProdutoServiceImpl(ProdutoRepository produtoRepository) {
		super();
		this.produtoRepository = produtoRepository;
	}

	@Override
	public GenericRepository<Produto> getRepository() {
		return produtoRepository;
	}
}