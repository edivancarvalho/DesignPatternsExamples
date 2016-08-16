package chainofesponsibilityEexercicio1;

import chainofesponsibilityEexercicio1.CalculadorDeDesconto;
import chainofesponsibilityEexercicio1.ItemExercicio1;

public class TesteDeDesconto {
	public static void main(String[] args) {  // Ctrl + Space
	
		 CalculadorDeDesconto descontos = new CalculadorDeDesconto();
		 
		 
		 OrcamentoExercicio1 orcamento = new OrcamentoExercicio1(400.00);
		 
		 orcamento.adicionaItem(new ItemExercicio1("CANETA",250.0) );
		 
		 orcamento.adicionaItem(new ItemExercicio1("LAPIS",250.0) );

		 orcamento.adicionaItem(new ItemExercicio1("Broca",250.0) );		 

		 orcamento.adicionaItem(new ItemExercicio1("Talhadeira",250.0) );
		 
		 orcamento.adicionaItem(new ItemExercicio1("Britadeira",250.0) );		 
		 
		 //orcamento.adicionaItem(new Item("Papel",350.0) );		 
		 
		 double descontoFinal = descontos.calcula(orcamento);
		 
		 System.out.println(descontoFinal);//s
		
	}

}
