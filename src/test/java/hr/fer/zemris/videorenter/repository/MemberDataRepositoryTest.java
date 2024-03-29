package hr.fer.zemris.videorenter.repository;

import hr.fer.zemris.videorenter.domain.Member;
import junit.framework.TestCase;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:/testApplicationContext.xml")
@Transactional
public class MemberDataRepositoryTest extends TestCase {

	@Autowired
	private MemberRepository repository;
	
	@Test
	public void testMemberRepository() {
		
		Member member = new Member();
		member.setName("Ivo");
		member.setSurname("Majic");
		member.setAddress("Belinin odvojak 1A");
		
		repository.save(member);
		assertEquals(1, repository.count());
		
	}
	
}
