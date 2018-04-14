package design.pattern.comportamental.observer.e1;

import java.util.ArrayList;
import java.util.List;

public class SubjectExample {
	
   private List<ObserverExample> observers = new ArrayList<ObserverExample>();
   private int state;

   public int getState() {
      return state;
   }

   public void setState(int state) {
      this.state = state;
      notifyAllObservers();
   }

   public void attach(ObserverExample observer){
      observers.add(observer);		
   }

   public void notifyAllObservers(){
      for (ObserverExample observer : observers) {
         observer.update();
      }
   } 	
}