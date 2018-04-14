package design.pattern.comportamental.observer.e2;



public class Main {

	 public static void main(String[] args) {
   	    ObserverSuspeitos suspeito = new ObserverSuspeitos();
	
	
	    new ViaturaZonaSul(suspeito);
   	    new ViaturaZonaNorte(suspeito);
   	    
   	    suspeito.correrAtrasDe("Lalau" );
   	    suspeito.correrAtrasDe("Jonas" );
   	    suspeito.correrAtrasDe("Ricardo" );
   	    
   	   
 
	 }
	
	
	
}
