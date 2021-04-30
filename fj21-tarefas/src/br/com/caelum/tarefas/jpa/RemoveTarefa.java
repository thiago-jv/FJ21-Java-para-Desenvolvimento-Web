package br.com.caelum.tarefas.jpa;

import java.io.Serializable;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.caelum.tarefas.modelo.Tarefa;

public class RemoveTarefa implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("tarefas");
		EntityManager manager = factory.createEntityManager();
		
		Tarefa encontrada = manager.find(Tarefa.class, 2L);

		manager.getTransaction().begin();
		manager.remove(encontrada);
		manager.getTransaction().commit();

		System.out.println();
		System.out.println(encontrada.getDescricao());
		manager.close();

	}
}
