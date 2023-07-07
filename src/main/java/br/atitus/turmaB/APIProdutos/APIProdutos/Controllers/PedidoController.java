package br.atitus.turmaB.APIProdutos.APIProdutos.Controllers;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import br.atitus.turmaB.APIProdutos.APIProdutos.Entities.Pedido;
import br.atitus.turmaB.APIProdutos.APIProdutos.Services.GenericService;
import br.atitus.turmaB.APIProdutos.APIProdutos.Services.PedidoService;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/pedidos")
public class PedidoController extends GenericController<Pedido> {
	
	final PedidoService pedidoService;
	public PedidoController(PedidoService pedidoService) {
		super();
		this.pedidoService = pedidoService;
	}
	
	@Override
	GenericService<Pedido> getService() {
		return pedidoService;
	}
}