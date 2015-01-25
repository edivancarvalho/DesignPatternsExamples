package strategy;

public class ISS implements Imposto{

	/*
	public double CalculaISS (Orcamento orcamento) {
		return orcamento.getValor() * 0.06;
	}
	
	*/
	
	
	@Override
	public double calcula(Orcamento orcamento) {
		// TODO Auto-generated method stub
		return orcamento.getValor() * 0.6;
	}
	
	
	
}
