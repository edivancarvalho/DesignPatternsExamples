package strategy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import chainofesponsibility.Item;


// Ctrl N Class
// Ctrl + 1 > Assign Parameter (em cima do atributo, no caso o valor)
// Ctrl + 3 em qualquer parte > digitar GGAS - Generate Getters and Setters


public class Orcamento {

	private final double valor;
	private final List<Item> itens;
	

	public Orcamento (double valor) {
		this.valor = valor;
		itens = new ArrayList<Item>();
		
	}

	public double getValor() {
		return valor;
	}
	
	
	public void adicionaItem(Item item) {
		itens.add(item);
	}
	
	public List<Item> getItens() {
		return Collections.unmodifiableList(itens);

	}
	
	
	
}
