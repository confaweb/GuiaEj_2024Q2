package ar.edu.unlam.empresa;

import java.time.LocalDate;

public class Director extends Gerente {

	private Double SUELDOeXTRAdIRECTOR = 2000000.0;
	private Double salario;

	public Director(String nombre, String apellido, Integer dni, LocalDate fechaDeNacimiento, Double salario,
			CategoriaEmpleado categoria) {
		super(nombre, apellido, dni, fechaDeNacimiento, salario, categoria);
		this.salario = salario;
	}

	public void setSalario(Double salario) {
		if (super.getCategoria() == CategoriaEmpleado.INGENIERO) {
			super.setSalario(salario);
			this.salario = salario + SUELDOeXTRAdIRECTOR;
		}else
		this.salario = salario + SUELDOeXTRAdIRECTOR;
	}

	public Double getSalario() {
		return salario;
	}
	

}
