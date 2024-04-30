package clases;


public class Cliente {
	
	private String nombre;
	private String apellidos;
	private int edad;

	
	/**
	 * Costructor por defecto con los parametros 
	 * @param nombre nombre del cliente 
	 * @param apellidos apellidos del cliente
	 * @param edad edad del cliente
	 */
	public Cliente(String nombre, String apellidos, int edad) {
	    this.nombre = nombre;
	    this.apellidos = apellidos;
	    this.edad = edad;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getApellidos() {
		return apellidos;
	}


	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}


	public int getEdad() {
		return edad;
	}


	public void setEdad(int edad) {
		this.edad = edad;
	}
	
}