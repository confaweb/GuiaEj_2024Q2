package ar.edu.unlam.fuerzaArmada;

import interfaces.Terrestre;

public class Tanque extends Vehiculo implements Terrestre {

	public Tanque(String codigoVehiculo) {
		super(codigoVehiculo);
		// TODO Auto-generated constructor stub
	}
	public Boolean desplazarse() {
		return true;
	}



}
