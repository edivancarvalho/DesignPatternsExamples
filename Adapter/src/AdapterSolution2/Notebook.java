package AdapterSolution2;

public class Notebook implements Dispositivo {

	@Override
	public void iniciar() {
		// TODO Auto-generated method stub
		System.out.println("NOTE: Iniciar");
		
	}

	@Override
	public void desligar() {
		// TODO Auto-generated method stub
		
		System.out.println("NOTE: Desligar");
		
	}

	@Override
	public void reiniciar() {
		// TODO Auto-generated method stub
		this.desligar();
		this.iniciar();
		
	}

}
