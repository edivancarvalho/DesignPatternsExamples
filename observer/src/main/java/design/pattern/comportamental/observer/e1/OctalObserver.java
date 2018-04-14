package design.pattern.comportamental.observer.e1;

public class OctalObserver extends ObserverExample {
	
	   public OctalObserver(SubjectExample subject){
		      this.subject = subject;
		      this.subject.attach(this);
		   }

		   @Override
		   public void update() {
		     System.out.println( "Octal String: " + Integer.toOctalString( subject.getState() ) ); 
		   }
		   
}
