package strategy;

public class CalculadorDeImpostos {

	
	public void realizaCalculo (OrcamentoStrategy orcamento, Imposto impostoQualquer) {
		// implementing Strategy
		
		double calculo = impostoQualquer.calcula(orcamento);
		System.out.println(calculo);
	}
	
	
	
	/*
	public void realizaCalculo(Orcamento orcamento, String imposto) {
		
		
		if (imposto.equals("ICMS"))
		{
		   double icms = orcamento.getValor() * 0.1;
		   System.out.println(icms);
	    }
		
		else if(imposto.equals("ISS")) { 
			double iss = orcamento.getValor() * 0.06;
			System.out.println(iss);
			System.out.println(iss);
		}

	}
	*/ 
	 /* problema, quanto mais impostos houver, maior este m�todo ficar� e dif�cil de dar manuten��o*/
	 /* quando classe fazem algo em comum, pode-se definir um contrato

	
	
	public void realizaCalculoICMS(Orcamento orcamento) {
		
		
		if (imposto.equals("ICMS"))
		{
		   double icms = orcamento.getValor() * 0.1;
		   System.out.println(icms);
	    }
		
		else if(imposto.equals("ISS")) { 
			double iss = orcamento.getValor() * 0.06;
			System.out.println(iss);
			System.out.println(iss);
		}

	}  /* problema, quanto mais impostos houver, maior este m�todo ficar� e dif�cil de dar manuten��o*/ 	
	
	
	
	
	
	
	
}
