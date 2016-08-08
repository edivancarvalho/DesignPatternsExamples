package chainofesponsibilityEexercicio1;



public interface Desconto {
	
	public double desconta(OrcamentoExercicio1 orcamento);
	
	void setProximoDesconto(Desconto proximo);
	

}
