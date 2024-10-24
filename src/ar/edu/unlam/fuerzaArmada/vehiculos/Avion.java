package ar.edu.unlam.fuerzaArmada.vehiculos;

import interfaces.Volador;

public class Avion extends Vehiculo implements Volador {

	public Avion(String codigoVehiculo) {
		super(codigoVehiculo);

	}
	public Boolean despegar() {
		// TODO Auto-generated method stub
		return true;
	}
}
