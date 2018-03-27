package edu.springboot.databasedemo.repository;


import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.junit4.SpringRunner;

import edu.springboot.databasedemo.model.Alien;
import edu.springboot.databasedemo.model.Name;
import edu.springboot.databasedemo.repository.AlienRepository;

@RunWith(SpringRunner.class)
@DataJpaTest
public class AlienRepositoryTest {
	
	@Autowired
	private TestEntityManager entityManager;
	
	@Autowired
	private AlienRepository alienRepo;
	
	@Test
	public void whenFindByNameThenReturnAlien() {
		Alien alien = new Alien();
		alien.setAid(111);
		Name n = new Name();
		n.setfName("Anand");
		n.setmName("S");
		n.setlName("Nair");
		alien.setName(n);
		alien.setColor("Brown");
		
		entityManager.persist(alien);
		entityManager.flush();
		
		
		Alien a = alienRepo.findByName(n);
		
		System.out.println("Got the alien from DB" + a.getAid() +" name = "+a.getName());
		assertEquals(a.getAid(), alien.getAid());
		
	}
}
