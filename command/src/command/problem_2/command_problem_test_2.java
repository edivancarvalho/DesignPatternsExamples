package command.problem_2;

import command.problem_2.Loja.FormaDePagamento;

public class command_problem_test_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Loja lojasAfricanas = new Loja("Afriacanas");
		lojasAfricanas.executarCompra(100,  FormaDePagamento.CartaoDeCredito);
		lojasAfricanas.executarCompra(90,  FormaDePagamento.Boleto);
		
		
		Loja exorbitante = new Loja("Exorbitante");
		
		lojasAfricanas.executarCompra(90,  FormaDePagamento.Boleto);
		lojasAfricanas.executarCompra(90,  FormaDePagamento.Boleto);
		
		
		
		//lojasAfricanas.executarCompra(999.00, new PagamentoCartaoCredito());
	    //lojasAfricanas.executarCompra(49.00, new PagamentoBoleto());
	    //lojasAfricanas.executarCompra(99.00, new PagamentoCartaoDebito());
	 
	    //Loja exorbitante = new Loja("Exorbitante");
	    //exorbitante.executarCompra(19.00, new PagamentoCartaoCredito());

	}

}
