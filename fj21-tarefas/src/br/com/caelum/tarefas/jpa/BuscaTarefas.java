package br.com.caelum.tarefas.jpa;

import java.io.Serializable;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import br.com.caelum.tarefas.modelo.Tarefa;

public class BuscaTarefas implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("tarefas");
		EntityManager manager = factory.createEntityManager();

		// cuidado, use o import javax.persistence.Query
		Query query = manager.createQuery("select t from Tarefa as t " + "where t.finalizado = :paramFinalizado");
		query.setParameter("paramFinalizado", false);
		@SuppressWarnings("unchecked")
		List<Tarefa> lista = query.getResultList();
		for (Tarefa t : lista) {
			System.out.println();
			System.out.println(t.getDescricao());
		}
		manager.close();
	}

}
