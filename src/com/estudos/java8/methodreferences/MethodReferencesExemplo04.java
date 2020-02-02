package com.estudos.java8.methodreferences;
//Functional interface
interface Figura2DExemplo4 {
	Retangulo desenha(Double largura, Double altura);
}

class RetanguloExemplo4 {
	
	public RetanguloExemplo4(Double largura, Double altura) {
		System.out.println("Desenha ret�ngulo de Largura: " + largura + " e Altura: " + altura);
	}
}

public class MethodReferencesExemplo04 {

	public static void main(String[] args) {
		
		/*Method reference 
		* Refer�ncia a um construtor
		*/
		Figura2D fig1 = RetanguloExemplo4::new;
		
		fig1.desenha(10.5, 7.0);

	}

}
