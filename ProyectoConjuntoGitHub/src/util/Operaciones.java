package util;

import clases.Cuenta;

public class Operaciones {
	
	/**
	 * Transfiere si tiene suficiente cantidad la cuenta origen la cantidad indicada a otra
	 * @param cuentaOrigen
	 * @param cuentaDestino
	 * @param i
	 */
	public static void transferencia(Cuenta cuentaOrigen, Cuenta cuentaDestino, Double cantidad) {
		
		if(cuentaOrigen.getCantidad()>=cantidad) {
			cuentaOrigen.setCantidad(cuentaOrigen.getCantidad()-cantidad);
			cuentaDestino.setCantidad(cuentaDestino.getCantidad()+cantidad);
			System.out.println("Transferencia realizada");
		}
		else {
			System.out.println("No tiene cantidad suficiente");
		}
		
	}
	
	/**
	 * Se presta una cantidad indicada a la cuenta indicada
	 * 
	 * @param cuentaDestino
	 * @param cantidad
	 */
	public static void prestamo(Cuenta cuentaDestino, Double cantidad) {
			
			
		cuentaDestino.setCantidad(cuentaDestino.getCantidad()+cantidad);
		System.out.println("Cantidad prestada");
		
	}
	
	/**
	 * Cambia el estado de una cuenta a cancelado
	 * 
	 * @param cuentaDestino
	 */
	public static void cancelarCuenta(Cuenta cuentaDestino) {
			
		cuentaDestino.setEstado("Cancelada");
		
	}
	
	

}
