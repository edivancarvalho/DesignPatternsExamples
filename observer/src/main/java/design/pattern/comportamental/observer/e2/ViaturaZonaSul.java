package design.pattern.comportamental.observer.e2;


public class ViaturaZonaSul extends ObserverE2 {

    public ViaturaZonaSul(ObserverSuspeitos subject){
      this.subject = subject;
      
      this.subject.attach(this);
    }	
    
    public void deattach(ObserverSuspeitos subject){
        this.subject = subject;
        this.subject.deattach(this);
      }	    
	
	@Override
	public void update() {
		// TODO Auto-generated method stub
		if (!(subject.getNomeLadrao()=="Ricardo")) 
		System.out.println("ViaturaZonaSul indo atras de " + subject.getNomeLadrao());
		
	}

}
