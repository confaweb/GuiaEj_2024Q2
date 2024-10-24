package ar.edu.unlam.tests;

import static org.junit.Assert.*;

import org.junit.Test;

import ar.edu.unlam.fuerzaArmada.vehiculos.Anfibio;
import ar.edu.unlam.fuerzaArmada.vehiculos.Avion;
import ar.edu.unlam.fuerzaArmada.vehiculos.Barco;
import ar.edu.unlam.fuerzaArmada.vehiculos.HidroAvion;
import ar.edu.unlam.fuerzaArmada.vehiculos.Tanque;
import ar.edu.unlam.fuerzaArmada.vehiculos.Vehiculo;
import interfaces.Terrestre;
import interfaces.Volador;

public class PruebasFuerzasArmadasVehiculos {

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
		String codigoVehiculo = "Ter001";
		//PROCESO
		Terrestre tanque =new Tanque(codigoVehiculo);
		//SALIDA
		assertTrue(tanque.desplazarse());
	}
	@Test//#3
	public void queUnVehiculoAcuticoPuedaNavegar() {
		//ENTRADA
		String codigoVehiculo = "Vol001";
		Vehiculo buque;
		//PROCESO
		buque =new Barco(codigoVehiculo);
		//SALIDA
		assertTrue(((Barco) buque).navegar());
	}
	@Test//#4
	public void queUnVehiculoAnfibioPuedaNavegarYDesplazarsePorTierra() {
		//ENTRADA
		String codigoVehiculo = "Anf001";
		Vehiculo anfibio1;
		//PROCESO
		anfibio1 =new Anfibio(codigoVehiculo);
		//SALIDA
		assertTrue(((Anfibio)anfibio1).navegar());
		assertTrue(((Anfibio) anfibio1).desplazarse());
	}
	@Test//#5
	public void queUnVehiculoAnfibioHidroAvionPuedaNavegarYDespegar() {
		//ENTRADA
		String codigoVehiculo = "Hidro001";
		Vehiculo hidroAvion1;
		//PROCESO
		hidroAvion1 =new HidroAvion(codigoVehiculo);
		//SALIDA
		assertTrue(((HidroAvion)hidroAvion1).navegar());
		assertTrue(((HidroAvion) hidroAvion1).despegar());
	}

}

