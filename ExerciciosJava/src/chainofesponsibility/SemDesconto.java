package chainofesponsibility;

import strategy.Orcamento;

public class SemDesconto implements Desconto{

	@Override
	public double desconta(Orcamento orcamento) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setProximoDesconto(Desconto proximo) {
		// TODO Auto-generated method stub
		
	}

}
