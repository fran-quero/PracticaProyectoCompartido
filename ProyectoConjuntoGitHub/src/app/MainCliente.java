package app;

import clases.Cliente;
import clases.Cuenta;
import util.Operaciones;

public class MainCliente {

	public static void main(String[] args) {
		
		//Creamos cliente
		Cliente cliente1= new Cliente("Daniela", "Martinez Fernández", 19);
		Cliente cliente2= new Cliente("Fran", "Quero Henares", 21);
		Cliente cliente3= new Cliente("Roberto", "Bañasco Luque", 20);
		
		//Creamos cada cuenta del respectivo cliente
		Cuenta cuentaCliente1 = new Cuenta("ES12345678901234599890", cliente1, 10000);
	    Cuenta cuentaCliente2 = new Cuenta("ES99065432109876543210", cliente2, 5000);
	    Cuenta cuentaCliente3 = new Cuenta("ES99065432109876543210", cliente3, 5000);
	    
	    //Hago una transferencia entre la cuenta del cliente 1 y la cuenta del cliente dos
	 
	    Operaciones.transferencia(cuentaCliente1, cuentaCliente2, 20.00);
	    
	    System.out.println(cuentaCliente1.toString());

	}

}
