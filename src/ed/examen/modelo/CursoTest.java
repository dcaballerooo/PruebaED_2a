package ed.examen.modelo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CursoTest {
	private Curso c1= new Curso();
	private Persona p1 = new Persona("18185158R","Daniel","Caballero");
	private Persona p2 = new Persona("16789654C","Rafael","Caballero");
	

	@Test
	void testEliminarAlumno() throws Exception {
		c1.aniadirAlumno(p1);

		Integer Numerodealumnosantes = c1.numeroAlumnos();

		c1.eliminarAlumno(p1.getDni());

		assertEquals(Numerodealumnosantes.intValue() - 1, c1.numeroAlumnos().intValue());
		assertFalse(c1.estaRegistrado(p1.getDni()));
	}

	@Test
	void testAniadirAlumno() {
		Integer Numerodealumnosantes = c1.numeroAlumnos();
		c1.aniadirAlumno(p1);

		assertEquals(Numerodealumnosantes.intValue() + 1, c1.numeroAlumnos().intValue());
		assertTrue(c1.estaRegistrado(p1.getDni()));
	}
	

	@Test
	void testEstaRegistrado() {
		
		c1.aniadirAlumno(p1);

		assertTrue(c1.estaRegistrado(p1.getDni()));
		assertFalse(c1.estaRegistrado(p2.getDni()));

	}


	@Test
	void testCurso() {
		fail("Not yet implemented");
	}

	@Test
	void testNumeroAlumnos() {
		fail("Not yet implemented");
	}

}
