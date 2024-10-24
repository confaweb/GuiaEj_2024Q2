package ar.edu.unlam.fuerzaArmada.vehiculos;

import interfaces.Terrestre;

public class Tanque extends Vehiculo implements Terrestre {

	public Tanque(String codigoVehiculo) {
		super(codigoVehiculo);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Boolean desplazarse() {
		// TODO Auto-generated method stub
		return true;
	}

}
