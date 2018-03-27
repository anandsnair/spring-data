package edu.springboot.databasedemo.service.impl;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.Bean;
import org.springframework.test.context.junit4.SpringRunner;

import edu.springboot.databasedemo.model.Alien;
import edu.springboot.databasedemo.model.Name;
import edu.springboot.databasedemo.repository.AlienRepository;
import edu.springboot.databasedemo.service.AlienService;

@RunWith(SpringRunner.class)
public class AlienServiceImplTest {

	@TestConfiguration
	static class AlienServiceImplTestContextConfiguration {
		
		@Bean
		public AlienService alienService() {
			return new AlienServiceImpl();
		}
	}

	@Autowired
	AlienService service;
	
	@MockBean
	AlienRepository aRepo;
	
	Name n = null;
	@Before
	public void setup() {
		Alien alien = new Alien();
		alien.setAid(111);
		n = new Name();
		n.setfName("Anand");
		n.setmName("S");
		n.setlName("Nair");
		alien.setName(n);
		alien.setColor("Brown");
		
		Mockito.when(aRepo.findByName(alien.getName())).thenReturn(alien);
	}
	
	@Test
	public void whenValidAlienFound() {
		Alien found = service.getAlienByName(n);
		System.out.println("Alien foundby name " + found.getName().getfName());
		assertEquals("Anand", found.getName().getfName());
	}
	
	@Test
	public void whenValidAlienNotFound() {
		Name notFound = new Name();
		Alien found = service.getAlienByName(notFound);
		assertNull(found);
	}

}
