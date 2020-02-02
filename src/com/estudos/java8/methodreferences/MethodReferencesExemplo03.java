package com.estudos.java8.methodreferences;
import java.util.ArrayList;
import java.util.List;

class ProdutoExemplo3 {
	private String nome;
	private Double preco;
	
	public ProdutoExemplo3(String nome, Double preco) {
		this.nome = nome;
		this.preco = preco;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}
	
	public void imprime() {
		System.out.println(nome + " = " + preco);
	}
}

public class MethodReferencesExemplo03 {
	
	public static void main(String[] args) {
		
		List<ProdutoExemplo3> lista = new ArrayList<>();
		
		lista.add(new ProdutoExemplo3("TV 32'", 2000.00));
		lista.add(new ProdutoExemplo3("Geladeira 370L'", 3200.00));
		lista.add(new ProdutoExemplo3("Fog�o 3 bocas", 900.00));
		lista.add(new ProdutoExemplo3("Videogame", 1999.00));
		lista.add(new ProdutoExemplo3("Microondas", 550.00));
		
		/*Method reference 
		* Refer�ncia a um m�todo de inst�ncia (imprime) de um objeto arbitr�rio (?) a partir de um tipo espec�fico (Produto)
		*/
		lista.forEach(ProdutoExemplo3::imprime);
		
	}
}
