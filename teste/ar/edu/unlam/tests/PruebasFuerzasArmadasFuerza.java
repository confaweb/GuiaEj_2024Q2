package ar.edu.unlam.tests;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import ar.edu.unlam.fuerzaArmada.fuerzas.Ejercito;
import ar.edu.unlam.fuerzaArmada.fuerzas.Fuerza;
import ar.edu.unlam.fuerzaArmada.fuerzas.FuerzaAerea;
import ar.edu.unlam.fuerzaArmada.fuerzas.Marina;
import ar.edu.unlam.fuerzaArmada.vehiculos.Avion;
import ar.edu.unlam.fuerzaArmada.vehiculos.Barco;
import ar.edu.unlam.fuerzaArmada.vehiculos.Tanque;
import ar.edu.unlam.fuerzaArmada.vehiculos.Vehiculo;
import interfaces.Acuatico;
import interfaces.Terrestre;
import interfaces.Volador;

public class PruebasFuerzasArmadasFuerza {

	@Test
	public void queExistaUnaFuerzaCapazDeArmarUnConvoyDeVehiculos() {
		//INICIO
		
		String nombreFuerzaE="ejercito",nombreFuerzaM="marina",nombreFuerzaA="fuerzaAerea",codigoT = "T001",codigoM = "M001" ,codigoA= "A001";
		Integer numeroRegimientoE=001,numeroRegimientoM=002,numeroRegimientoA=003;
		ArrayList <Vehiculo>convoy;
		Terrestre tanque;
		Volador avion;
		Acuatico barco;
		
		
		//PROCESO
		convoy=new ArrayList<Vehiculo>();
		
		tanque=new Tanque(codigoT);
		avion= new Avion(codigoA);
		barco=new Barco(codigoM);
		
		Fuerza ejercito=new Ejercito(nombreFuerzaE,numeroRegimientoE);
		Fuerza marina=new Marina(nombreFuerzaM,numeroRegimientoM);
		Fuerza fuerzaAerea=new FuerzaAerea(nombreFuerzaA,numeroRegimientoA);
		
		assertTrue(ejercito.agregarVehiculo(convoy,(Vehiculo) tanque));
		assertTrue(marina.agregarVehiculo(convoy,(Vehiculo) barco));
		assertTrue(fuerzaAerea.agregarVehiculo(convoy,(Vehiculo) avion));
		//SALIDA
		Integer ve=3;
		Integer vo=convoy.size();
		assertEquals(ve,vo);
	}

}
