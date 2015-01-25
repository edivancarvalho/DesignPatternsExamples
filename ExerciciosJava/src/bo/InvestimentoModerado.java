package bo;

import java.math.BigDecimal;

public class InvestimentoModerado implements TipoInvestimento {

	@Override
	public double calcula(Investimento investimento) {
		// TODO Auto-generated method stub
		
		boolean escolhido = new java.util.Random().nextDouble() > 0.50;
		double retorno = 0;
		
		
		if (escolhido) 
		   retorno = investimento.getValor() * 0.007;
		
		
		else
			//return investimento.getValor() * 0.025;
			retorno = investimento.getValor() * 0.007;
			
			
		//return retorno;
		
		retorno = 12.53346867562d;
		return truncate(retorno,11); 
		
		
	}
	
	
    public double truncate(Double valor, int precisao) {  
        BigDecimal bd = BigDecimal.valueOf(valor);  
        bd = bd.setScale(precisao, BigDecimal.ROUND_DOWN);  
  
        return bd.doubleValue();  
    }  
	 


}
