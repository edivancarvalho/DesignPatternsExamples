// Ricardo Lopes Correa

package factoryMethodProblem;

public class TesteFactoryMethodProblem {

	
	public static void main(String[] args) {
		
       
		
		Pizzaria pizzaria = new Pizzaria();
		
		pizzaria.criarPizza("sao-paulo", "queijo");
		pizzaria.delivery();
		
		pizzaria.criarPizza("rio-de-janeiro", "portuguesa");
		pizzaria.delivery();
		
	}
		
		
}
