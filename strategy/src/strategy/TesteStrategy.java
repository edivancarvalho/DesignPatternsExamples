package strategy;
import strategy.CalculadorDeImpostos;
import strategy.ICMS;
import strategy.ISS;
import strategy.Imposto;
import strategy.OrcamentoStrategy;

//atalho
// digitar main + control + space - cria o m�todo main


public class TesteStrategy {


	public static void main(String[] args) {
		Imposto iss = new ISS();
		Imposto icms = new ICMS();
		
		OrcamentoStrategy orcamento = new OrcamentoStrategy(500.0);
		
		CalculadorDeImpostos calculador = new CalculadorDeImpostos();
		
		
				
		
		calculador.realizaCalculo (orcamento, iss);
		calculador.realizaCalculo (orcamento, icms);
		
		
		
		
		
	}

	
	

}
