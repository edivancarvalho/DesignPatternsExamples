package command_solution_1;

public class TesteCommand {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Light light = new Light();
		
		ControleRemotoInvoker controle = new ControleRemotoInvoker();
		
		controle.setCommandInvoker(new LightOffCommand(light));

		controle.botaoPressionado();  

		controle.setCommandInvoker(new LightOnCommand(light));		
		
		controle.botaoPressionado();  

		controle.setCommandInvoker(new LightOffCommand(light));

		controle.botaoPressionado();  

		controle.setCommandInvoker(new LightOffCommand(light));

		controle.botaoPressionado();  

		
		
		
	}

}
