package design.pattern.comportamental.observer.e2;

import java.util.ArrayList;
import java.util.List;

public class ObserverSuspeitos {
	
   private List<ObserverE2> observers = new ArrayList<ObserverE2>();
   private String nomeDoLadrao;

   public String getNomeLadrao() {
      return nomeDoLadrao;
   }

   public void correrAtrasDe(String nomeDoLadrao) {
      this.nomeDoLadrao = nomeDoLadrao;
      notifyAllObservers();
   }

   public void attach(ObserverE2 observer){
      observers.add(observer);		
   }
   
   public void deattach(ObserverE2 observer){
	      observers.remove(observer);		
	   }

   public void notifyAllObservers(){
      for (ObserverE2 observer : observers) {
         observer.update();
      }
   } 	
}