package command.solution_2;

public class commandTesteSolution2 {

	public static void main(String[] args) {
	    LojaSolution2 lojasAfricanas = new LojaSolution2("Afriacanas");
	    lojasAfricanas.executarCompra(999.00, new PagamentoBoletoSolution());
	    lojasAfricanas.executarCompra(100.00, new PagamentoBoletoSolution());

	 
	    LojaSolution2 exorbitante = new LojaSolution2("Exorbitante");
	    exorbitante.executarCompra(19.00, new PagamentoBoletoSolution());
	}
}
