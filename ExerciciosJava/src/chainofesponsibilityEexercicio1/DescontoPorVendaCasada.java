package chainofesponsibilityEexercicio1;


public class DescontoPorVendaCasada implements Desconto {
	
	private Desconto proximo;

    private boolean existe(String nomeDoItem, OrcamentoExercicio1 orcamento) {
        for (ItemExercicio1 item : orcamento.getItens()) {
            if(item.getNome().equals(nomeDoItem)) return true;
        }
        return false;
    }


	public double desconta(OrcamentoExercicio1 orcamento) {
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
