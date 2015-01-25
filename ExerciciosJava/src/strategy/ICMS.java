package strategy;

public class ICMS implements Imposto{

	@Override
	public double calcula(Orcamento orcamento) {
		// TODO Auto-generated method stub
		return orcamento.getValor() * 0.1;
	}

	    /*
		public double CalculaICMS (Orcamento orcamento) {
			return orcamento.getValor() * 0.1;
		}
		*/
	
	
	
	
}
