package chainofesponsibilityEexercicio1;


public class DescontoPorCincoItens implements Desconto {

	   private Desconto proximo;

	public double desconta (OrcamentoExercicio1 orcamento) {
		   if (orcamento.getItens().size() > 5 )
			   return orcamento.getValor() *0.1 ;

		   else {
		       return proximo.desconta(orcamento);
		   }
	   }

	@Override
	public void setProximoDesconto(Desconto proximo) {
		this.proximo = proximo;
		// TODO Auto-generated method stub
		
		
	}
	    
	
}
