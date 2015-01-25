package testestrategy;
import strategy.CalculadorDeImpostos;
import strategy.ICMS;
import strategy.ISS;
import strategy.Imposto;
import strategy.Orcamento;

//atalho
// digitar main + control + space - cria o método main


public class TesteDeImposto {


	public static void main(String[] args) {
		Imposto iss = new ISS();
		Imposto icms = new ICMS();
		
		Orcamento orcamento = new Orcamento(500.0);
		
		CalculadorDeImpostos calculador = new CalculadorDeImpostos();
		
		
				
		
		calculador.realizaCalculo (orcamento, iss);
		calculador.realizaCalculo (orcamento, icms);
		
		
		
		
		
	}

	
	

}
