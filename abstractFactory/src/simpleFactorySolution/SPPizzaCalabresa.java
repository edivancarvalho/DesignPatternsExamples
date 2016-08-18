package simpleFactorySolution;

public class SPPizzaCalabresa extends Pizza {

    private PizzaIngredientesFactory ingredientes;
    private Massa massa = null;
    private Queijo queijo = null;
    private Molho molho = null;
    private Salsa salsa = null;

    public SPPizzaCalabresa(){
    	System.out.println("sabor: calabresa");
        this.ingredientes = new SPPizzaIngredientesFactory();
    }
	
	
    public void prepara(){
        massa = ingredientes.criarMassa();
        queijo = ingredientes.criarQueijo();
        molho = ingredientes.criarMolho();
        salsa = ingredientes.criarSalsa();
    }
}
