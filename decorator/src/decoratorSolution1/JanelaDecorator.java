package decoratorSolution1;

abstract class JanelaDecorator extends Janela {
	
	protected Janela janelaDecorada;

	public JanelaDecorator(Janela janelaDecorada) {
		this.janelaDecorada = janelaDecorada;
	}

}