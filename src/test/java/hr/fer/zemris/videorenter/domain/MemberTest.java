package hr.fer.zemris.videorenter.domain;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import junit.framework.TestCase;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:/testContext.xml")
@Transactional
public class MemberTest extends TestCase {

	@PersistenceContext  
	private EntityManager em;
	
	@Test
	public void testPersist() {
		Member user = new Member();
		user.setName("Ivo");
		user.setSurname("Majic");
		em.persist(user);
		em.flush();
		assertNotNull(user.getId());
	}
	
}
