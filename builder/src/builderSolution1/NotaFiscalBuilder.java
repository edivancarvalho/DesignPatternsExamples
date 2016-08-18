package builderSolution1;

import java.util.ArrayList;
import java.util.List;

public class NotaFiscalBuilder {
	
	private String razaosocial;
	private String cnpj;
	private List<ItemDaNota> todositens = new ArrayList<ItemDaNota>();
	private double valorTotal;
	private double impostos;
	private String obs;

	public NotaFiscalBuilder razaosocial (String razaosocial){
		this.razaosocial = razaosocial;
		return this;
		
		
	}
	
	public NotaFiscalBuilder cnpj (String cnpj) {
		this.cnpj = cnpj;
		return this;
		
	}
	
	public NotaFiscalBuilder item (ItemDaNota item) {
		todositens.add(item);
		valorTotal += item.getValor();
		impostos += item.getValor() * 0.05;
		
		return this;
		
		
	}
	
	public NotaFiscalBuilder observacoes (String obs) {
		this.obs = obs;
		return this;
	}

	public NotaFiscal constroi() {
		return new NotaFiscal
				  (this.razaosocial, 
				   this.cnpj, 
				   this.valorTotal, 
				   this.impostos, 
				   this.todositens, 
				   this.cnpj);
	}
	//public NotaFiscal(String razaoSocial, 
	//String cnpj, double valor, double impostos, List<ItemDaNota> itens,
	//String obs) {
	
	
}
