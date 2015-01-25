package testchainofresponsability;

import strategy.Orcamento;
import chainofesponsibility.CalculadorDeDesconto;
import chainofesponsibility.Item;

public class TesteDeDesconto {
	public static void main(String[] args) {  // Ctrl + Space
	
		 CalculadorDeDesconto descontos = new CalculadorDeDesconto();
		 
		 
		 Orcamento orcamento = new Orcamento(500.00);
		 
		 orcamento.adicionaItem(new Item("CANETA",250.0) );
		 
		 orcamento.adicionaItem(new Item("LAPIS",250.0) );
		 
		 double descontoFinal = descontos.calcula(orcamento);
		 
		 System.out.println(descontoFinal);
		
	}

}
