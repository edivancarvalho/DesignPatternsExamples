package simpleFactorySolution;

public interface PizzaIngredientesFactory {
    public Massa criarMassa();
    
    public Queijo criarQueijo();

    public Molho criarMolho();

    public Salsa criarSalsa();
}