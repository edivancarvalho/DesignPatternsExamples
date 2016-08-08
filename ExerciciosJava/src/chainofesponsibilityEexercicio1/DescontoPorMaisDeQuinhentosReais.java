package chainofesponsibilityEexercicio1;


public class DescontoPorMaisDeQuinhentosReais implements Desconto  {

	
    private Desconto proximo;

	public double desconta (OrcamentoExercicio1 orcamento) {
		   if (orcamento.getValor() > 500 )
			   return orcamento.getValor() * 0.07;

		   else {
		       return proximo.desconta(orcamento);
		   }
	   }

	@Override
	public void setProximoDesconto(Desconto proximo) {
		this.proximo = proximo;
		
	}
	    	
	
	
}
