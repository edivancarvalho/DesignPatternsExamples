// Ricardo Lopes Correa
package simpleFactorySolution;

public class SPPizzaPortuguesa extends Pizza {

    private PizzaIngredientesFactory ingredientes;
    private Massa massa = null;
    private Queijo queijo = null;
    private Molho molho = null;
    private Salsa salsa = null;

    public SPPizzaPortuguesa(){
    	System.out.println("sabor: portuguesa");
        this.ingredientes = new SPPizzaIngredientesFactory();
    }
	
	
    public void prepara(){
        massa = ingredientes.criarMassa();
        queijo = ingredientes.criarQueijo();
        molho = ingredientes.criarMolho();
        salsa = ingredientes.criarSalsa();
    }
	
}
