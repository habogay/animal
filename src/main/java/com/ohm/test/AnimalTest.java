package com.ohm.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.ohm.entity.Animal;

public class AnimalTest {

	Animal animal =null;
	@Before
	public void setUp() throws Exception {
		animal= new Animal();
	}

	@After
	public void tearDown() throws Exception {
		animal=null;
	}

	@Test
	public void nullTest() {
		assertNotNull(animal);
	}
	@Test
	public void setNameTest() {
		
		animal.setName("Dog");
		assertEquals(animal.getName(),"Cat");
	}
	@Test
	public void soundTest() {
		
		
		assertEquals(animal.sound(),"WOWWOW");
	}


}
