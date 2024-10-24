package ar.edu.unlam.fuerzaArmada.vehiculos;

import interfaces.Acuatico;
import interfaces.Volador;

public class HidroAvion extends Vehiculo implements Volador,Acuatico{

	public HidroAvion(String codigoVehiculo) {
		super(codigoVehiculo);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Boolean navegar() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public Boolean despegar() {
		// TODO Auto-generated method stub
		return true;
	}

}
