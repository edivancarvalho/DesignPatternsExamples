package chainofesponsibility;

import strategy.Orcamento;

public class DescontoPorVendaCasada implements Desconto {
	
	private Desconto proximo;

    private boolean existe(String nomeDoItem, Orcamento orcamento) {
        for (Item item : orcamento.getItens()) {
            if(item.getNome().equals(nomeDoItem)) return true;
        }
        return false;
    }


	public double desconta(Orcamento orcamento) {
		// TODO Auto-generated method stub
		
		if (existe("LAPIS", orcamento) && existe("CANETA", orcamento))
		{
			return orcamento.getValor() * 0.05;
		}
		else 
		{
			return proximo.desconta(orcamento);
		}
	}

	@Override
	public void setProximoDesconto(Desconto proximo) {
		// TODO Auto-generated method stub
		
		this.proximo = proximo;
		
		
	}
	
	
}
