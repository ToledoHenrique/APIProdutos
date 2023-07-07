package br.atitus.turmaB.APIProdutos.APIProdutos.Controllers;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.atitus.turmaB.APIProdutos.APIProdutos.Entities.Produto;
import br.atitus.turmaB.APIProdutos.APIProdutos.Services.GenericService;
import br.atitus.turmaB.APIProdutos.APIProdutos.Services.ProdutoService;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/produtos")
public class ProdutoController extends GenericController<Produto> {
	
	final ProdutoService produtoService;
	public ProdutoController(ProdutoService produtoService) {
		super();
		this.produtoService = produtoService;
	}
	
	@Override
	GenericService<Produto> getService() {
		return produtoService;
	}
}