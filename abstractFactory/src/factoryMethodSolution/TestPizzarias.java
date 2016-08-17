package factoryMethodSolution;

public class TestPizzarias {

    public static void main( String[] args ){
        /* SÃO PAULO */
        PizzaFactory pizzariaSaoPaulo = new PizzaFactorySaoPaulo();
        pizzariaSaoPaulo.criarPizza("queijo");
        Pizza pizza = pizzariaSaoPaulo.delivery();

        /* RIO DE JANEIRO */
        PizzaFactory pizzariaRioDeJaneiro = new PizzaFactoryRioDeJaneiro();
        pizzariaRioDeJaneiro.criarPizza("calabresa");
        pizza = pizzariaRioDeJaneiro.delivery();
    }
}