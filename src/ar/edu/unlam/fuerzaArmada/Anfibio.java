package ar.edu.unlam.fuerzaArmada;

import interfaces.Acuatico;
import interfaces.Terrestre;

public class Anfibio extends Vehiculo implements Terrestre,Acuatico{

	public Anfibio(String codigoVehiculo) {
		super(codigoVehiculo);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Boolean navegar() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public Boolean desplazarse() {
		// TODO Auto-generated method stub
		return true;
	}

}
