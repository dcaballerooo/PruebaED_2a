package ed.examen.modelo;
/**Clase que gestiona la creacion de un objeto "Persona"
 * @author Daniel
 * @version 2.0.0
 *
 */

public class Persona{
	
	private String dni;
	private String nombre;
	private String apellido1;
	
	public Persona() {}
	
	/** Constructor para la generacion del objeto persona
	 * @param dni dni de la persona
	 * @param nombre nombre de la persona
	 * @param apellido1 apellido de la persona
	 */
	public Persona(String dni, String nombre, String apellido1) {
		this.dni = dni;
		this.nombre = nombre;
		this.apellido1 = apellido1;
	}
	
	/**Getter delegado para la obtencion del dni de la persona
	 * @return devuelve el dni
	 */
	public String getDni() {
		return dni;
	}
	
	
	/** Setter delegado para la modificacion del dni de la persona
	 * @param dni dni de la persona
	 * @throws Exception Lanza una excepcion si el dni de la persona no es valido
	 */
	public void setDni(String dni) throws Exception {
		//comprobacion de si el ultimo caracter es una letra
		if(Character.isLetter(dni.charAt(dni.length()))) {
			this.dni=dni;
		}else {
			throw new Exception("El ultimo caracter introducido no es una letra");
		}
	}
	
	/** Getter delegado para la obtencion del nombre de la persona
	 * @return devuelve el nombre de la persona
	 */
	public String getNombre() {
		return nombre;
	}
	
	/**Setter generado para modificar/asignar un nombre a la persona
	 * @param nombre nombre de la persona
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	/**Getter delegado para obtener el apellido de la persona
	 * @return devuelve el apellido de la persona
	 */
	public String getApellido1() {
		return apellido1;
	}
	
	/** Setter delegado para modificar/añadir un apellido a la persona
	 * @param apellido1 apellido de la persona
	 */
	public void setApellido1(String apellido1) {
		this.apellido1 = apellido1;
	}
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dni == null) ? 0 : dni.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Persona other = (Persona) obj;
		if (dni == null) {
			if (other.dni != null)
				return false;
		} else if (!dni.equals(other.dni))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Persona [dni=" + dni + ", nombre=" + nombre + "]";
	}
	

}
