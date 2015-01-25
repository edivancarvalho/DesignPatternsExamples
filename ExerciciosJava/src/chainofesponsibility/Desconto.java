package chainofesponsibility;

import strategy.Orcamento;

public interface Desconto {
	
	public double desconta(Orcamento orcamento);
	
	void setProximoDesconto(Desconto proximo);
	

}
