package bo;

public class RealizadorDeInvestimentos {
	
	public void realizaCalculo(Investimento investimento, TipoInvestimento tipo) {
		
		double retorno = tipo.calcula(investimento);
		
		System.out.println(retorno);
		
		
	}

}
