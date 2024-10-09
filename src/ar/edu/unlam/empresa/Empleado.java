package ar.edu.unlam.empresa;

import java.time.LocalDate;

public class Empleado extends Persona {

	private Double salario;
	private Double ADICIONALpRODUCTIVIDAD = 0.2;
	private CategoriaEmpleado categoria;

	public Empleado(String nombre, String apellido, Integer dni, LocalDate fechaDeNacimiento, Double salario,
			CategoriaEmpleado categoria) {
		super(nombre, apellido, dni, fechaDeNacimiento);
		this.salario = salario;
		this.categoria = categoria;

	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		if (this.categoria == CategoriaEmpleado.INGENIERO) {
			this.salario = calcularSalarioIngeniero();
		} else

			this.salario = salario;
	}

	private Double calcularSalarioIngeniero() {
		Double salarioIngeniero = this.salario + (salario * ADICIONALpRODUCTIVIDAD);
		return salarioIngeniero;
	}

}
