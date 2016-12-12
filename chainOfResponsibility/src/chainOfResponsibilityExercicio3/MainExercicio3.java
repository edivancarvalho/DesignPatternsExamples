package chainOfResponsibilityExercicio3;



public class MainExercicio3 {

	
	public static void main(String[] args) throws Exception {
		Produto p = new Produto();
		p.NomeProduto = "talhadeira";
		
		
		CallerChain qualEmpresaAtende = new Empresa1();
		
		qualEmpresaAtende.setNext(new Empresa2());
		
	//	c.setNext();
		qualEmpresaAtende.efetuarEntrega(1, p);
		qualEmpresaAtende.efetuarEntrega(2, p);
	}
	

	
}
