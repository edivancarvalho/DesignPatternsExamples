package simpleFactorySolution;

import simpleFactorySolution.Pizza;
import simpleFactorySolution.SPPizzaCalabresa;
import simpleFactorySolution.SPPizzaPortuguesa;
import simpleFactorySolution.SPPizzaQuatroQueijos;

public class PizzariaFactorySaoPaulo extends SPPizzaIngredientesFactory {
    private Pizza pizza;
    
    
	
	public void criarPizza(String tipo) {
		
		
		
		if (tipo.equals("queijo"))
		{
		     pizza = new SPPizzaQuatroQueijos();
		                
		}
		else if( tipo.equals("portuguesa") ){
			pizza = new SPPizzaPortuguesa();
		}
		else if( tipo.equals("calabresa") ){
			pizza = new SPPizzaCalabresa();
		}
		
		pizza.prepara();
		
		
		
	}
	


    


}
