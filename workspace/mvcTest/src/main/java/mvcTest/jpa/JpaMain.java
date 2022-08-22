package mvcTest.jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import mvcTest.model.Member;
import mvcTest.model.Todo;

public class JpaMain {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("hello");
		EntityManager em = emf.createEntityManager();

		EntityTransaction et = em.getTransaction();
		et.begin();
		try {
			/*
			 * Member member = new Member(); member.setId("sku10");
			 * member.setPassword("1234"); member.setName("서경10");
			 * member.setEmail("sku10@sku.com");
			 * 
			 * em.persist(member);
			 */
			
			Member member = em.find(Member.class, "sku10");
			member.setName("이서경");
			
			Todo todo = new Todo();
			todo.setMember(member);
			todo.setTodo("jpa study!!!");
			
			em.persist(todo);
			
			et.commit();
		} catch (Exception e) {
			e.printStackTrace();
			et.rollback();
		} finally {
			em.close();
		}

		emf.close();
	}

}
