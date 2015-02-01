package chainofesponsibility;

import strategy.Orcamento;

public class CalculadorDeDesconto {
	
	/*
	public double calcula(Orcamento orcamento) {
		
		if (orcamento.getItens().size() > 5) {
			return orcamento.getValor() * 0.1;
		}
		

		if (orcamento.getValor() > 500) {
			return orcamento.getValor() * 0.07;
		}
		
		
		return 0;
		
	}
	*/
	
	
	public double calcula(Orcamento orcamento) {
		
		Desconto d1 = new DescontoPorCincoItens();
		Desconto d2 = new DescontoPorMaisDeQuinhentosReais();
		Desconto d3 = new DescontoPorVendaCasada();
		Desconto d4 = new SemDesconto();
		
		d1.setProximoDesconto(d2);
		d2.setProximoDesconto(d3);
		d3.setProximoDesconto(d4);
		
		
		return d1.desconta(orcamento);
		
	}
	

}
