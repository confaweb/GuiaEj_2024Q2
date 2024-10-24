package ar.edu.unlam.fuerzaArmada.fuerzas;

import java.util.ArrayList;

import ar.edu.unlam.fuerzaArmada.vehiculos.Vehiculo;

public abstract class Fuerza {
	private String nombreFuerza;
	private Integer numeroRegimiento;

	public Fuerza(String nombreFuerza, Integer numeroRegimiento) {
		this.nombreFuerza = nombreFuerza;
		this.numeroRegimiento = numeroRegimiento;
	}

	public boolean agregarVehiculo(ArrayList<Vehiculo> convoy, Vehiculo vehiculo) {
		Boolean vehiculoAgregado = false;
		vehiculoAgregado = convoy.add(vehiculo);
		return vehiculoAgregado;
	}

}
