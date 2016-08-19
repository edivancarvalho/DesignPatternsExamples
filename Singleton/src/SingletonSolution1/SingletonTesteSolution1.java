package SingletonSolution1;

public class SingletonTesteSolution1 {

	//http://www.devmedia.com.br/padrao-de-projeto-singleton-em-java/26392

	public static void main(String[] args) {
		
		
		
		Singleton s = Singleton.getInstance();
		
		s.setTeste("valor1");
		
		System.out.println(s.getTeste());

		s = Singleton.getInstance();
		
		System.out.println(s.getTeste());

		
		
		
	}
	
	
}
