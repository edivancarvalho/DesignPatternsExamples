package simpleFactorySolution;
import factoryMethodSolution.Pizza;
// http://www.thiengo.com.br/padrao-de-projeto-abstract-factory
import simpleFactorySolution.SPPizzaIngredientesFactory;

public class testeSimpleFactory {  // Pizzaria
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		    
	    PizzariaFactorySaoPaulo pizzaSP = new PizzariaFactorySaoPaulo();
	    pizzaSP.criarPizza("queijo");
	    
	    pizzaSP.criarPizza("portuguesa");
		
	    pizzaSP.criarPizza("calabresa");
		
		
	}
}
