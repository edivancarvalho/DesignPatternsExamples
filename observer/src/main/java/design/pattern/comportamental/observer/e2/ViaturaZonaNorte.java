package design.pattern.comportamental.observer.e2;

import design.pattern.comportamental.observer.e2.ObserverSuspeitos;

public class ViaturaZonaNorte extends ObserverE2 {

	
    public ViaturaZonaNorte(ObserverSuspeitos subject){
       this.subject = subject;
       this.subject.attach(this);
    }
	@Override
	public void update() {
		// TODO Auto-generated method stub
		System.out.println("ViaturaZonaNorte indo atras de " + subject.getNomeLadrao());
		
	}

}
