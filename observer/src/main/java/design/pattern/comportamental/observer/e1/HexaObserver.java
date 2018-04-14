package design.pattern.comportamental.observer.e1;

public class HexaObserver extends ObserverExample {

	   public HexaObserver(SubjectExample subject){
	      this.subject = subject;
	      this.subject.attach(this);
	   }

	   @Override
	   public void update() {
	      System.out.println( "Hex String: " + Integer.toHexString( subject.getState() ).toUpperCase() ); 
	   }

}
