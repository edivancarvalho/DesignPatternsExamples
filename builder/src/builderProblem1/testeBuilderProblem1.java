package builderProblem1;

import java.util.Arrays;
import java.util.List;

public class testeBuilderProblem1 {
	
	public static void main(String[] args) {
		
		List<ItemDaNota> itens = Arrays.asList(new ItemDaNota("Item 1", 200.0), 
				new ItemDaNota("Item 2", 300)); 
		
		double ValorTotal = 0;
		
		
		for(ItemDaNota item : itens)
		{
			ValorTotal+= item.getValor();
		}
		
		double impostos = ValorTotal * 0.05;
		
		NotaFiscal nf = new NotaFiscal ("empresa", "000", ValorTotal, 0, itens, "observacoes");
		
		
		System.out.println(ValorTotal);
		System.out.println(impostos);
		
		// Problema, lógica de negócios dentro da VIEW, dentro do módulo principal
		
	}
	
}
