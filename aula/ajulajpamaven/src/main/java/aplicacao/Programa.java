package aplicacao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import dominio.Pessoa;

public class Programa {
	
	public static void main(String[] args) {
		
		Pessoa p1 = new Pessoa(null,"Carlos Silva", "carlos@gmail.com.br");
		Pessoa p2 = new Pessoa(null,"Joaquim Torres", "joaquim@gmail.com.br");
		Pessoa p3 = new Pessoa(null,"Ana Maria", "amairas@gmail.com.br");
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
		EntityManager em = emf.createEntityManager();
		
		/*
		INCLUSAO DE DADOS NA BASE DO MYSQL
		em.getTransaction().begin();
		em.persist(p1);
		em.persist(p2);
		em.persist(p3);
		em.getTransaction().commit();
		em.close();
		emf.close();
		*/
		
		/*
		PESQUISA NA BASE PELO METODO FIND
		Pessoa p = em.find(Pessoa.class,2);
		System.out.println(p);
		*/
		
		/*
		DELEÇÃO DE UM ITEM DE UMA ENTIDADE MONITORADA		
		Pessoa p = em.find(Pessoa.class,2);
		em.getTransaction().begin();
		em.remove(p);
		em.getTransaction().commit();
		em.close();
		emf.close();
		*/
		
		System.out.println("Pornto!");
		
	}

}
