package command_solution_1;

public class ControleRemotoInvoker {

	Command command;
	
	public ControleRemotoInvoker() {
		
	}
	
	public void setCommandInvoker(Command c) {
		command = c;
	}
	
	public void botaoPressionado() {
		command.execute();
	}
	
	
}
