package builderSolution1;

import java.util.List;

public class NotaFiscal {

	private String RazaoSocial;
	private String cnpj;
	private double valor;
	private double impostos;
	private List<ItemDaNota> itens;
	
	public String obs;

	
	// atalho : ctrl+3  : gcuf, criar construtor recebendo todos os parametros
	public NotaFiscal(String razaoSocial, String cnpj, double valor, double impostos, List<ItemDaNota> itens,
			String obs) {
		super();
		RazaoSocial = razaoSocial;
		this.cnpj = cnpj;
		this.valor = valor;
		this.impostos = impostos;
		this.itens = itens;
		this.obs = obs;
	}

	// atalho: ctrl+3  : ggas, cria getters and setters
	
	public String getRazaoSocial() {
		return RazaoSocial;
	}


	public String getCnpj() {
		return cnpj;
	}


	public double getValor() {
		return valor;
	}


	public double getImpostos() {
		return impostos;
	}


	public List<ItemDaNota> getItens() {
		return itens;
	}


	public String getObs() {
		return obs;
	}

	
	


	

	
	
	
	
	
}
