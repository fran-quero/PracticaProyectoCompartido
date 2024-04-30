package clases;


public class Cuenta {
	
	
	private String iban;
	private Cliente cliente;
	private double cantidad;
	private String estado;
	
	/**
	 *  Constructor de la clase cuenta
	 *  
	 * @param iban			Pide iban
	 * @param cliente		Pide cliente
	 * @param cantidad		Pide cantidad
	 * @param estado		Estado por defecto "Activa"
	 */
	
	public Cuenta(String iban, Cliente cliente, double cantidad, String estado) {
		
		this.iban = iban;
		this.cliente = cliente;
		this.cantidad = cantidad;
		this.estado = "Activa";
	}
	
	

}
