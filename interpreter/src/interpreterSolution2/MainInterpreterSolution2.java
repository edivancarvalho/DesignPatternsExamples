package interpreterSolution2;



import java.util.ArrayList;

public class MainInterpreterSolution2 {
	//https://github.com/MarcosX/Padr-es-de-Projeto/tree/master/src/br/padroes/interpreter
	public static void main(String[] args) {
		ArrayList<NumeroRomanoInterpreter> interpretadores = new ArrayList<NumeroRomanoInterpreter>();
		interpretadores.add(new QuatroDigitosRomano());
		interpretadores.add(new TresDigitosRomano());
		interpretadores.add(new DoisDigitosRomano());
		interpretadores.add(new UmDigitoRomano());

		//String numeroRomano = "CXCIV";
		String numeroRomano = "IV";
		
		
		
		Contexto contexto = new Contexto(numeroRomano);
		for (NumeroRomanoInterpreter numeroRomanoInterpreter : interpretadores) {
			numeroRomanoInterpreter.interpretar(contexto);
		}

		System.out.println(numeroRomano + " = "
				+ Integer.toString(contexto.getOutput()));
	}
}