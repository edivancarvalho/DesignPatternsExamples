// Ricardo Lopes Correa 
package simpleFactorySolution;

public class SPPizzaQuatroQueijos extends Pizza {

    private PizzaIngredientesFactory ingredientes;
    private Massa massa = null;
    private Queijo queijo = null;
    private Molho molho = null;
    private Salsa salsa = null;

    public SPPizzaQuatroQueijos(){
    	System.out.println("sabor: quatro queijos");
        this.ingredientes = new SPPizzaIngredientesFactory();
    }
	
	
    public void prepara(){
        massa = ingredientes.criarMassa();
        queijo = ingredientes.criarQueijo();
        molho = ingredientes.criarMolho();
        salsa = ingredientes.criarSalsa();
    }
}
