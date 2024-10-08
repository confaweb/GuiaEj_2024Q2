package ar.edu.unlam.empresa;

import java.time.LocalDate;

public class Empleado extends Persona {



	private Double salario;

	public Empleado(String nombre, String apellido, Integer dni, LocalDate fechaDeNacimiento, Double salario) {
		super(nombre, apellido, dni, fechaDeNacimiento);
		this.salario=salario;
		
		
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}

}
