package AdapterSolution2;

public class testeAplicacao {
	//https://brizeno.wordpress.com/category/padroes-de-projeto/adapter/
	// https://www.youtube.com/watch?v=ipD5pWZ4yk8
	
	public static void main(String[] args) {
	
		System.out.println("== Reiniciando Notebook ==");
		
		Dispositivo d = new Notebook();
		
		d.reiniciar();
		
		
		System.out.println("== Reiniciando Celular ==");
		
		d = new CelularAdapter();
		
		d.reiniciar();
		
		
		
	}
	
}
