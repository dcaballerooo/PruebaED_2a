package ed.examen.modelo;

import java.util.ArrayList;
import java.util.List;

/**Clase que gestiona un Curso con alumnos 
 * @author Daniel
 * @version 2.0.0
 *
 */

public class Curso {
	
	private List<Persona> listaAlumnos;

	/**Metodo para eliminar un Alumno; su dni debe ser valido
	 * @param dni parametro del dni del alumno a eliminar
	 * @throws Exception Excepción lanzada si el dni no tiene la lonigtud adecuada
	 */
	public void eliminarAlumno(String dni) throws Exception {
		if(dni.length()==9) {//comprobar la longitud del dni
			listaAlumnos.remove(new Persona(dni, "", "")); //solo hace falta el dni
		}else {
			throw new Exception("El dni no tiene la longitud adecuada");
		}
	}
	
	/**Método para aniadir un alumno; debemos tener creadas Objetos persona
	 * @param p Objeto persona; necesario para aniadir alumno
	 */
	public void aniadirAlumno(Persona p) {
		listaAlumnos.add(p);
	}
	
	/**Metodo poara comprobar si un Alumno ya esta registrado 
	 * @param dni dni del alumno 
	 * @return devuelve true or false en funcion de lo ha encontrado o no
	 */
	public Boolean estaRegistrado(String dni) {
		int i =0;
		Boolean encontrado=false;
		while (!encontrado && i<listaAlumnos.size()) {
			if(listaAlumnos.get(i).getDni().equals(dni)) {
				encontrado=true;
			}
			i++;
		}
		return encontrado;
	}
	
	/**Metodo para la creacion de un nuevo curso mediante una lista
	 * 
	 */
	public Curso() {
		listaAlumnos= new ArrayList<Persona>();
	}
	
	/**Metodo para saber el numero de alumnos de un curso
	 * @return devuelve el numero de alumnos que hay en el curso
	 */
	public Integer numeroAlumnos() {return listaAlumnos.size();}
	
	
	public void mostrarTodos() {
		for (Persona persona : listaAlumnos) {
			System.out.println(persona);
		}
	}

	public Object getlistaAlumnos() {
		// TODO Auto-generated method stub
		return listaAlumnos;
	}

}
