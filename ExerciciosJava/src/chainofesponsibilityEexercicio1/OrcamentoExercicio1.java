package chainofesponsibilityEexercicio1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import chainofesponsibilityEexercicio1.ItemExercicio1;


public class OrcamentoExercicio1 {

	private final double valor;
	private final List<ItemExercicio1> itens;
	

	public OrcamentoExercicio1 (double valor) {
		this.valor = valor;
		itens = new ArrayList<ItemExercicio1>();
		
	}

	public double getValor() {
		return valor;
	}
	
	
	public void adicionaItem(ItemExercicio1 item) {
		itens.add(item);
	}
	
	public List<ItemExercicio1> getItens() {
		return Collections.unmodifiableList(itens);

	}
	

	
	
}
