package decoratorSolution1;

public class MainDecoratorSolution2 {

	
	public static void main(String args[]) {
		Janela janelaDecorada = new DecoradorBarraVertical(new JanelaSimples());
		janelaDecorada.draw();
	}
	
	
}
