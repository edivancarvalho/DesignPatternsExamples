package simpleFactoryProblem;

public class PizzaQuatroQueijos extends Pizza {
    private String cidade;
    private Massa massa;
    private Queijo queijo;
    private Molho molho;
    private Salsa salsa;

    public PizzaQuatroQueijos( String cidade ){
        this.cidade = cidade;
    }

    public void prepara(){
        
        if( cidade.equals("sao-paulo") ){
            massa = new MassaGrossa();
            queijo = new QueijoMinas();
            molho = new MolhoMarroquino();
            salsa = new SalsaNobre();
        }
        else{
            massa = new MassaFina();
            queijo = new QueijoParmesao();
            molho = new MolhoDaRoca();
            salsa = new SalsaNobreApimentada();
        }
    }
   
}