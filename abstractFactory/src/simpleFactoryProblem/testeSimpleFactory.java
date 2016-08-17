package simpleFactoryProblem;
// http://www.thiengo.com.br/padrao-de-projeto-abstract-factory
public class testeSimpleFactory {
   
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PizzaQuatroQueijos p = new PizzaQuatroQueijos("sao-paulo");
		
		p.prepara();
		
		p = new PizzaQuatroQueijos("fortaleza");
		
		p.prepara();
		
        //pizza.assa();
        //pizza.empacota();
		
		//Resumo do código acima: o modo de preparo da pizza de quatro queijos de São Paulo 
		//e o modo de preparo dapizza de quatro queijos do Rio de Janeiro são exatamente os 
		//mesmos, somente os ingredientes é que mudam. Isso é válido para todos os outros sabores
		
		
	}

}
