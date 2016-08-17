package simpleFactorySolution;

public class SPPizzaIngredientesFactory implements PizzaIngredientesFactory {
    @Override
    public Massa criarMassa() {
        return new MassaGrossa();
    }

    @Override
    public Queijo criarQueijo() {
        return new QueijoMinas();
    }

    @Override
    public Molho criarMolho() {
        return new MolhoMarroquino();
    }

    @Override
    public Salsa criarSalsa() {
        return new SalsaNobre();
    }
}