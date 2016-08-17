package factoryMethodProblem;


// No código acima estamos violando alguns princípios de orientação a objetos, 
// como exemplo: o código está fortemente acoplado, violando ao menos o princípio 
// "Prefira ligações leves entre objetos que se relacionam".

// Qualquer outro trecho de código do projeto que precisasse de uma instância 
// específica de Pizza teria de recorrer a uma instância de Pizzaria, podendo quebrar 
// o entendimento do código ou até mesmo tendo de repetir o script de criação acima. Provavelmente há outros "n" problemas.

public class Pizzaria {
    private Pizza pizza;

    public void criarPizza( String cidade, String tipo ){

        if( cidade.equals("sao-paulo") ){

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
        else if( cidade.equals("rio-de-janeiro") ){

            if( tipo.equals("queijo") ){
                pizza = new RJPizzaQuatroQueijos();
            }
            else if( tipo.equals("portuguesa") ){
                pizza = new RJPizzaPortuguesa();
            }
            else if( tipo.equals("calabresa") ){
                pizza = new RJPizzaCalabresa();
            }
        }
    }

    public Pizza delivery(){
    	System.out.println("delivering");
        return pizza;
    }
    
}



