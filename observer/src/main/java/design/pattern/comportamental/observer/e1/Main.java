package design.pattern.comportamental.observer.e1;

public class Main {
	   public static void main(String[] args) {
	      SubjectExample subject = new SubjectExample();

	      new HexaObserver(subject);
	      new OctalObserver(subject);
	      new BinaryObserver(subject);

	      System.out.println("First state change: 15");	
	      subject.setState(15);
	      System.out.println("Second state change: 10");	
	      subject.setState(10);
	   }
	}