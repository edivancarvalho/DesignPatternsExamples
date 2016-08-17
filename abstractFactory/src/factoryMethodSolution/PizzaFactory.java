package factoryMethodSolution;

public abstract class PizzaFactory {
    protected Pizza pizza;
    
    public abstract void criarPizza( String tipo );

    public Pizza delivery(){
    	System.out.println("delivering");
        return pizza;
    }
}