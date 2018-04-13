package factoryAluraSolution;

public class Main {
	public static void main(String[] args) {
		
		// https://www.devmedia.com.br/padrao-de-projeto-factory-method-em-java/26348
		
		FactoryPessoa factory = new FactoryPessoa();
		String nome = "Carlos";
		String sexo = "M";
		factory.getPessoa(nome, sexo);

	}
}
