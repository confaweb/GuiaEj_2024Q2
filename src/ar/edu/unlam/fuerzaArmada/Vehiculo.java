package ar.edu.unlam.fuerzaArmada;

import interfaces.Volador;

public abstract class Vehiculo implements Volador {
	
	private String codigoVehiculo;
	public Vehiculo(String codigoVehiculo) {
		this.codigoVehiculo=codigoVehiculo;
	}

	public String getCodigoVehiculo() {
		return codigoVehiculo;
	}

	public void setCodigoVehiculo(String codigoVehiculo) {
		this.codigoVehiculo = codigoVehiculo;
	}

	

	public Boolean despegar() {
		// TODO Auto-generated method stub
		return true;
	}


}