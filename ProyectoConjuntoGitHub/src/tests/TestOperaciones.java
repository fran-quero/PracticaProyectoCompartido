package tests;

import static org.junit.jupiter.api.Assertions.*;
import util.Operaciones;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import clases.Cliente;
import clases.Cuenta;

class TestOperaciones {
	
	static Cliente c1;
	static Cliente c2;
	static Cuenta cuenta1;
	static Cuenta cuenta2;
	
	@BeforeAll
	static void setup() {
		c1 = new Cliente("Fran","Quero",20);
		c2 = new Cliente("Daniela","Martinez",19);
		
		cuenta1 = new Cuenta ("abcd",c1,1000);
		cuenta2 = new Cuenta ("bcbc",c2,1000);
	}

	@Test
	static void testTransferencia() {
		Operaciones.transferencia(cuenta2, cuenta1, 200.00);
		double cantidadEsperadoC1 = 1200;
		double cantidadObtenidaC1 = cuenta1.getCantidad();
		assertEquals(cantidadEsperadoC1,cantidadObtenidaC1);
	}
	
	@Test
	static void testPrestamo() {
		Operaciones.prestamo(cuenta1, 200.00);
		double cantidadEsperadoC1 = 1000;
		double cantidadObtenidaC1 = cuenta1.getCantidad();
		assertEquals(cantidadEsperadoC1,cantidadObtenidaC1);
	}
	
	@Test
	static void testCancelarCuenta() {
		Operaciones.cancelarCuenta(cuenta2);
		String esperado="Activa";
		String obtenido=cuenta2.getEstado();
		assertEquals(esperado,obtenido);
	}

}
