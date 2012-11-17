package hr.fer.zemris.videorenter.repository;

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
		
		repository.findAll();
		
	}
	
}
