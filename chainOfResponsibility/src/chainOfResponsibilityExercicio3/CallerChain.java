package chainOfResponsibilityExercicio3;

import chainofresponsibilityExercicio2.IDBancos;

public abstract class CallerChain {

	protected CallerChain next;
	protected int identificadorDoBanco;
	
	public CallerChain(int id) {
		next = null;
		identificadorDoBanco = id;
	}
	
	
	public void setNext(CallerChain callerChain) {
		if (next == null) {
			next = callerChain;
		} else {
			next.setNext(callerChain);
		}
	}	

	public void efetuarEntrega(int id, Produto p) throws Exception {
		if (podeEfetuarEntrega(id, p)) {
			atenderPedido(id, p);
		} else {
			if (next == null) {
				throw new Exception("Empresa não cadastrada");
			}
			next.atenderPedido(id, p);
		}
	}

	private boolean podeEfetuarEntrega(int id, Produto p) {
		if (identificadorDoBanco == id) {
			return true;
		}
		return false;
	}
	
	
	
	
	protected abstract void atenderPedido(int idEmpresa, Produto p);

	
	
}
