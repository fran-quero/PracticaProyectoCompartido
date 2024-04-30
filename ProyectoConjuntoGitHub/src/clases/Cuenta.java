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

	public String getIban() {
		return iban;
	}

	public void setIban(String iban) {
		this.iban = iban;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public double getCantidad() {
		return cantidad;
	}

	public void setCantidad(double cantidad) {
		this.cantidad = cantidad;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	
	
	

}
