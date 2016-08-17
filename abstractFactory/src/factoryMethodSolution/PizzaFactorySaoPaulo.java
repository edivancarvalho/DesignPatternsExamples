package factoryMethodSolution;

public class PizzaFactorySaoPaulo extends PizzaFactory {

    @Override
    public void criarPizza(String tipo) {

        if( tipo.equals("queijo") ){
            pizza = new SPPizzaQuatroQueijos();
        }
        else if( tipo.equals("portuguesa") ){
            pizza = new SPPizzaPortuguesa();
        }
        else if( tipo.equals("calabresa") ){
            pizza = new SPPizzaCalabresa();
        }
    }
}