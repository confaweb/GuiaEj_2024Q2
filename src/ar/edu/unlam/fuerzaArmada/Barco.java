package ar.edu.unlam.fuerzaArmada;

import interfaces.Acuatico;

public class Barco extends Vehiculo implements Acuatico{

	public Barco(String codigoVehiculo) {
		super(codigoVehiculo);
		// TODO Auto-generated constructor stub
	}
	@Override
	public Boolean navegar() {
		return true;
	}
	

}
