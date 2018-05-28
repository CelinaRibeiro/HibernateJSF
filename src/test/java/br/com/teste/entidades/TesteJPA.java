package br.com.teste.entidades;

import javax.persistence.Persistence;

public class TesteJPA {
	public static void main(String[] args) {
		Persistence.createEntityManagerFactory("HibernateJSF");
	}


}
