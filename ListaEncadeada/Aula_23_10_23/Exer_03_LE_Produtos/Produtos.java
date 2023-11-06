
package ListaEncadeada.Aula_23_10_23.Exer_03_LE_Produtos;

public class Produtos {
	private String descricao;
	private Double valor;
	
	
	public Produtos() {
	}

	public Produtos(String descricao, Double valor) {
		this.descricao = descricao;
		this.valor = valor;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	@Override
	public String toString() {
		return "Produto: " 
				+  "\nDescricao: " + getDescricao() 
				+ "\nValor: " + getValor() 
				+ "\n";
	}	

}
