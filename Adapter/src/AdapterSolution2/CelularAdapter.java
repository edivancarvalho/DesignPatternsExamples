package AdapterSolution2;

public class CelularAdapter implements Dispositivo {
	
	CelularAndroid celularAndroidOriginal;

	
	public CelularAdapter() {
		celularAndroidOriginal = new CelularAndroid();
	}
	
	@Override
	public void iniciar() {
		
		System.out.println("Adapter : iniciar");
		
		celularAndroidOriginal.ligarDispositivo();
		
	}

	@Override
	public void desligar() {

		System.out.println("Adapter : desligar");
		
		celularAndroidOriginal.procurarRede();
		celularAndroidOriginal.desconectarRede();
		celularAndroidOriginal.deligarRede();
		celularAndroidOriginal.desligarDispositivo();

	}

	@Override
	public void reiniciar() {

		System.out.println("Adapter : reiniciar");

		this.desligar();
		this.iniciar();
		

	}

}
