package strategy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import chainofesponsibilityEexercicio1.ItemExercicio1;



// Ctrl N Class
// Ctrl + 1 > Assign Parameter (em cima do atributo, no caso o valor)
// Ctrl + 3 em qualquer parte > digitar GGAS - Generate Getters and Setters


public class OrcamentoStrategy {

	private final double valor;
	private final List<ItemExercicio1> itens;
	

	public OrcamentoStrategy (double valor) {
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
