package com.estudos.java8.optional;

public class OptionalExemplo {
	
	public static void main(String[] args) {
		
		Curso cursoAdm = new Curso("Administra��o");
		
		Aluno jose = new Aluno("Jos�");
		jose.setMatricula(new Matricula("11100"));
		//Adiciona aluno ao curso
		cursoAdm.getListaAlunos().add(jose);
		
		Aluno maria = new Aluno("Maria");
		maria.setMatricula(new Matricula("12010"));
		//Adiciona aluno ao curso
		cursoAdm.getListaAlunos().add(maria);
		
		//SEM MATR�CULA !!!
		Aluno ana = new Aluno("Ana");
		//Adiciona aluno ao curso
		cursoAdm.getListaAlunos().add(ana);
		
		Aluno paulo = new Aluno("Paulo");
		paulo.setMatricula(new Matricula("14010"));
		//Adiciona aluno ao curso
		cursoAdm.getListaAlunos().add(paulo);
		
//		System.out.println("Teste lista full");
//		cursoAdm.getListaAlunos().forEach(a -> System.out.println(a.getNome() + " - " +  a.getMatricula().   ));
//		
		
		System.out.println("Teste lista filter stream");
		//Exibe o nome do aluno e o n�mero de sua matr�cula no curso
		getListaAlunosComMatricula(cursoAdm);
		
	}

	private static void getListaAlunosComMatricula(Curso cursoAdm) {
		
		cursoAdm.getListaAlunos().stream()
		//Filter para pegar alunos com matricula
		.filter( a -> a.getMatricula().isPresent() )
		//forEach para imprimir os alunos.
		.forEach( a -> System.out.println(a.getNome() + " - " + a.getMatricula().get().getNumero() ));
	}
	
}
