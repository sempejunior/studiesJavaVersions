package com.estudos.java8.optional;

import java.util.ArrayList;
import java.util.List;

public class Curso {

	private String nome;

	private List<Aluno> listaAlunos;

	public Curso(String nome) {
		this.nome = nome;
		this.listaAlunos = new ArrayList<>();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Aluno> getListaAlunos() {
		return listaAlunos;
	}

	public void setListaAlunos(List<Aluno> listaAlunos) {
		this.listaAlunos = listaAlunos;
	}

}
