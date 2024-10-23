package ar.edu.unlam.fuerzaArmada;

import interfaces.Terrestre;
import interfaces.Volador;

public abstract class Vehiculo {

	private String codigoVehiculo;

	public Vehiculo(String codigoVehiculo) {
		this.codigoVehiculo = codigoVehiculo;
	}

	public String getCodigoVehiculo() {
		return codigoVehiculo;
	}

	public void setCodigoVehiculo(String codigoVehiculo) {
		this.codigoVehiculo = codigoVehiculo;
	}

}
