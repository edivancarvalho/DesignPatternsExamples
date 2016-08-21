package bridgeSolution1;

public class testeBridgeSolution1 {

	public static void main(String[] args) {
		// https://brizeno.wordpress.com/category/padroes-de-projeto/bridge/
		// https://brizeno.files.wordpress.com/2011/10/classdiagram.png
		
	    JanelaAbstrata janela = new JanelaDialogo(new JanelaLinux());
	    janela.desenhar();
	    janela = new JanelaAviso(new JanelaLinux());
	    janela.desenhar();
	 
	    janela = new JanelaDialogo(new JanelaWindows());
	    janela.desenhar();
	}

}
