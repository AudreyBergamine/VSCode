package Fila.Pilha_E_ListaEncadeada;


public class Program {

	public static void main(String[] args) {
		
		ListaLigada pilha = new ListaLigada();
	
		pilha.adicionar("E");
		pilha.adicionar("B");
		pilha.adicionar("Z");
		pilha.adicionar("D");
		pilha.adicionar("C");
		
		System.out.println("Topo: "+ pilha.get()); // imprimir  quem está no topo
		
		pilha.adicionar("D");
		System.out.println("Topo: "+ pilha.get()); // imprimir  quem está no topo
		
		
		pilha.remover("D");
		System.out.println("Topo: "+ pilha.get()); // imprimir  quem está no topo
		
	}

}

