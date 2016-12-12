package chainOfResponsibilityExercicio3;

public class Empresa2 extends CallerChain{

	

	
	public Empresa2() {
		super(2);
		// TODO Auto-generated constructor stub
	}
	
	@Override
    protected void atenderPedido(int idEmpresa, Produto p) {
    	
    	if (p.NomeProduto.equals("talhadeira"))
            System.out.println("Empresa 2 vende");
     	else
     		System.out.println("Empresa 2 nao vende");
    }
	

}
