package decoratorSolution1;

public class MainDecoratorSolution2 {

	
	public static void main(String args[]) {
		//http://www.devmedia.com.br/padrao-de-projeto-decorator-em-java/26238
		Janela janelaDecorada = new DecoradorBarraVertical(new JanelaSimples());
		janelaDecorada.draw();
	}
	
	
}
