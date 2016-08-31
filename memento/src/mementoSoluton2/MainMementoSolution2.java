package mementoSoluton2;

public class MainMementoSolution2 {

	public static void main(String[] args) {
		//https://brizeno.wordpress.com/category/padroes-de-projeto/memento/
		
		Texto texto = new Texto();
		texto.escreverTexto("Primeira linha do texto\n");
		texto.escreverTexto("Segunda linha do texto\n");
		texto.escreverTexto("Terceira linha do texto\n");
		texto.mostrarTexto();
		texto.desfazerEscrita();
		texto.mostrarTexto();
		texto.desfazerEscrita();
		texto.mostrarTexto();
		texto.desfazerEscrita();
		texto.mostrarTexto();
		texto.desfazerEscrita();
		texto.mostrarTexto();
	}
	
}
