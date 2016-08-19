package SingletonSolution1;

public class Singleton {
   
	// Forma 2 - quando é sempre instanciado, quando nao pegar o exemplo sincronized
	
	private static Singleton uniqueInstance = new Singleton();
	private String teste;

	public String getTeste() {
		return teste;
	}

	public void setTeste(String teste) {
		this.teste = teste;
	}

	private Singleton() {
	}

	public static Singleton getInstance() {
		return uniqueInstance;
	}
}