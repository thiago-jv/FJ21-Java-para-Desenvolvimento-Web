package br.com.caelum.tarefas.jpa;

import java.io.Serializable;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.caelum.tarefas.modelo.Tarefa;

public class AtualizaTarefa implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("tarefas");
		EntityManager manager = factory.createEntityManager();

		Tarefa tarefa = new Tarefa();
		tarefa.setId(3L); //esse id já existe no banco
		tarefa.setDescricao("Estudar JPA e Hibernate 34");
		
		tarefa.setFinalizado(false);
		tarefa.setDataFinalizacao(null);
		
		manager.getTransaction().begin();
		manager.merge(tarefa);
		manager.getTransaction().commit();
		manager.close();

	}
}
