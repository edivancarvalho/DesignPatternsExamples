package command.problem_2;

public class Loja {
	
	public enum FormaDePagamento {
		CartaoDeCredito, CartaoDeDebito, Boleto
	}

	
    protected String nomeDaLoja;
 
    public Loja(String nome) {
        nomeDaLoja = nome;
    }
 
    public void executarCompra(double valor, FormaDePagamento formaDePagamento) {
        Compra compra = new Compra(nomeDaLoja);
        compra.setValor(valor);
        if(formaDePagamento == FormaDePagamento.CartaoDeCredito){
            new PagamentoCartaoCredito().processarCompra(compra);
        } else if(formaDePagamento == FormaDePagamento.CartaoDeDebito){
            new PagamentoCartaoDebito().processarCompra(compra);
        } else if(formaDePagamento == FormaDePagamento.Boleto){
            new PagamentoBoleto().processarCompra(compra);
        }
    }

}

