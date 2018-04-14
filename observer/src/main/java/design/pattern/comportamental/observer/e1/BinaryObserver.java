package design.pattern.comportamental.observer.e1;

public class BinaryObserver extends ObserverExample{

	   public BinaryObserver(SubjectExample subject){
	      this.subject = subject;
	      this.subject.attach(this);
	   }

	   @Override
	   public void update() {
	      System.out.println( "Binary String: " + Integer.toBinaryString( subject.getState() ) ); 
	   }
	}