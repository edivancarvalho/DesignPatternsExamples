package chainOfResponsibilityExercicio3;

public class Empresa1 extends CallerChain {

	private Produto produto;
	
	public Empresa1() {
		super(1);
		// TODO Auto-generated constructor stub
	}

	
	@Override
    protected void atenderPedido(int idEmpresa, Produto p) {
    	
    	if (p.NomeProduto.equals("talhadeira b"))
           System.out.println("Empresa 1 vende");
    	else
    		System.out.println("Empresa 1 nao vende");
    }
	

}
