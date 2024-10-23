package ar.edu.unlam.tests;

import static org.junit.Assert.*;

import org.junit.Test;

import ar.edu.unlam.fuerzaArmada.Avion;
import interfaces.Volador;

public class PruebasFuerzasArmadas {

	@Test
	public void queUnVehiculoVoladorPuedaDespegar() {
		//ENTRADA
		String codigoVehiculo = "Vol001";
		//PROCESO
		Volador avion =new Avion(codigoVehiculo);
		//SALIDA
		assertTrue(avion.despegar());
	}

}
