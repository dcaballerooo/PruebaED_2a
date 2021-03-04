package ed.examen.modelo.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import ed.examen.modelo.Persona;

class PersonaTest {
	private Persona p1 = new Persona("18185158R","Daniel","Caballero");

	@Test
	void testPersona() {
		assertNotNull(p1);
		assertEquals("18185158R", p1.getDni());
		assertEquals("Daniel", p1.getNombre());
		assertEquals("Caballero", p1.getApellido1());
	}

	@Test
	void testGetDni() {
		assertEquals("18185158R", p1.getDni());
	}

	@Test
	void testSetDni() {
		fail("Not yet implemented");
	}

	@Test
	void testGetNombre() {
		fail("Not yet implemented");
	}

	@Test
	void testSetNombre() {
		fail("Not yet implemented");
	}

	@Test
	void testGetApellido1() {
		fail("Not yet implemented");
	}

	@Test
	void testSetApellido1() {
		fail("Not yet implemented");
	}

}
