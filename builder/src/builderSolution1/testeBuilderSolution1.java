package builderSolution1;
//https://www.youtube.com/watch?v=elBrc8Aqors
 


public class testeBuilderSolution1 {
	
	public static void main(String[] args) {
		
		NotaFiscalBuilder builder = new NotaFiscalBuilder();
		
		builder.razaosocial("empresa")
		.cnpj("empresa")
		.observacoes("obs")
		.item(new ItemDaNota("Item 1", 200.0))
		.item(new ItemDaNota("Item 2", 300.0))    // interfaces fluentes
		.item(new ItemDaNota("Item 3", 50.0));
		
		NotaFiscal nf = builder.constroi();
		
		System.out.println(nf.getValor());
		
		
		

		
	}
	
}
