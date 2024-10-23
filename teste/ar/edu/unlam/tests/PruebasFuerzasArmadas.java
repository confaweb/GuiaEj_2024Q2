package ar.edu.unlam.tests;

import static org.junit.Assert.*;

import org.junit.Test;

import ar.edu.unlam.fuerzaArmada.Avion;
import ar.edu.unlam.fuerzaArmada.Tanque;
import interfaces.Terrestre;
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

	@Test//#2
	public void queUnVehiculoTerrestrePuedaDesplazarse() {
		//ENTRADA
		String codigoVehiculo = "Vol001";
		Terrestre tanque;
		//PROCESO
		tanque =new Tanque(codigoVehiculo);
		//SALIDA
		assertTrue(tanque.desplazarse());
	}

}
