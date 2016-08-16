package command_solution_1;

public class Light {

	int DESLIGADO = 0;
	int LIGADO = 1;
	int estado = 0;
	
	public void on() {
		if (estado == DESLIGADO)
		{
		    System.out.println("Luz Ligada");
		    estado = LIGADO;
		}    
		else 
			System.out.println("Luz Ja está ligada");
	}
	
	public void off() {

		if (estado == LIGADO)
		{
    		System.out.println("Luz Desligada");
    		estado = DESLIGADO;
		}
		else
			System.out.println("Luz já está desligada");
			
	}
}
