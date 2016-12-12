package chainofresponsibilityExercicio2;



public class MainExercicio2 {

	public static void main(String[] args) {
		BancoChain bancos = new BancoA();
		bancos.setNext(new BancoB());
		bancos.setNext(new BancoD());
		//bancos.setNext(new BancoC());
		
		try {

			bancos.efetuarPagamento(IDBancos.bancoA);
			bancos.efetuarPagamento(IDBancos.bancoB);
			bancos.efetuarPagamento(IDBancos.bancoC);	
			bancos.efetuarPagamento(IDBancos.bancoD);			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	

	}
}
