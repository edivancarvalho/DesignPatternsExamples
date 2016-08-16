package command.solution_2;

import command.problem_2.Compra;

public class PagamentoBoletoSolution implements PagamentoCommand {
	 
    @Override
    public void processarCompra(Compra compra) {
        System.out.println("Boleto criado!\n" + compra.getInfoNota());
    }
 
}