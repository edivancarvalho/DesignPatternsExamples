package testchainofresponsability;

import strategy.Orcamento;
import chainofesponsibility.CalculadorDeDesconto;
import chainofesponsibility.Item;

public class TesteDeDesconto {
	public static void main(String[] args) {  // Ctrl + Space
	
		 CalculadorDeDesconto descontos = new CalculadorDeDesconto();
		 
		 
		 Orcamento orcamento = new Orcamento(400.00);
		 
		 orcamento.adicionaItem(new Item("CANETA",250.0) );
		 
		 orcamento.adicionaItem(new Item("LAPIS",250.0) );

		 orcamento.adicionaItem(new Item("Broca",250.0) );		 

		 orcamento.adicionaItem(new Item("Talhadeira",250.0) );
		 
		 orcamento.adicionaItem(new Item("Britadeira",250.0) );		 
		 
		 //orcamento.adicionaItem(new Item("Papel",350.0) );		 
		 
		 double descontoFinal = descontos.calcula(orcamento);
		 
		 System.out.println(descontoFinal);
		
	}

}
