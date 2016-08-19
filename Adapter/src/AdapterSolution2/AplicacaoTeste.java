package AdapterSolution2;

public class AplicacaoTeste {

	
	public static void main(String[] args) {
	
		System.out.println("== Reiniciando Notebook ==");
		
		Dispositivo d = new Notebook();
		
		d.reiniciar();
		
		
		System.out.println("== Reiniciando Celular ==");
		
		d = new CelularAdapter();
		
		d.reiniciar();
		
		
		
	}
	
}
