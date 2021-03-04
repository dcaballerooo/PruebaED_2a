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
		try {
			p1.setDni("12345678R");
		} catch (Exception e) {
			e.printStackTrace();
		}
		assertEquals("12345678R", p1.getDni());
	}

	@Test
	void testGetNombre() {
		assertEquals("Daniel", p1.getNombre());
	}

	@Test
	void testSetNombre() {
		try {
			p1.setNombre("Javier");
		} catch (Exception e) {
			e.printStackTrace();
		}
		assertEquals("Javier", p1.getNombre());

	}

	@Test
	void testGetApellido1() {
		assertEquals("Caballero", p1.getApellido1());
	}

	@Test
	void testSetApellido1() {
		fail("Not yet implemented");
	}

}
