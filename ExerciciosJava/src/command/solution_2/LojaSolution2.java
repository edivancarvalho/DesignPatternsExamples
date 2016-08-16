package command.solution_2;

import command.problem_2.Compra;

public class LojaSolution2 {

	
    protected String nomeDaLoja;
 
    public LojaSolution2(String nome) {
        nomeDaLoja = nome;
    }
	
	public void executarCompra(double valor, PagamentoCommand formaDePagamento) {
	    Compra compra = new Compra(nomeDaLoja);
	    compra.setValor(valor);
	    formaDePagamento.processarCompra(compra);
	}
	
}
