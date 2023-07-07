package br.atitus.turmaB.APIProdutos.APIProdutos.ServicesImpl;

import org.springframework.stereotype.Service;
import br.atitus.turmaB.APIProdutos.APIProdutos.Repositories.PedidoRepository;
import br.atitus.turmaB.APIProdutos.APIProdutos.Services.PedidoService;

@Service
public class PedidoServiceImpl implements PedidoService{

	final PedidoRepository pedidoRepository;
	public PedidoServiceImpl(PedidoRepository pedidoRepository) {
		super();
		this.pedidoRepository = pedidoRepository;
	}
	
	@Override
	public PedidoRepository getRepository() {
		return pedidoRepository;
	}
}