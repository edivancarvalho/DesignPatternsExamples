package bo;

public class InvestimentoConservador implements TipoInvestimento {

	@Override
	public double calcula(Investimento investimento) {
		// TODO Auto-generated method stub
		return investimento.getValor() * 0.8;
	}
	

}
