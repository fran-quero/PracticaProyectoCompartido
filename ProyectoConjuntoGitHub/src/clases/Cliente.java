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
}