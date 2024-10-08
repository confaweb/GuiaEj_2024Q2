package ar.edu.unlam.empresa;

import java.time.LocalDate;
import java.util.Objects;

public class Gerente extends Empleado {

	private Cochera cochera;
	private Departamento departamento;

	public Gerente(String nombre, String apellido, Integer dni, LocalDate fechaDeNacimiento,Double salario) {
		super(nombre, apellido, dni, fechaDeNacimiento, salario);

		this.cochera = Cochera.NUMERO_COCHERA;
		
	}

	public Cochera getCochera() {
		return cochera;
	}

	public void setCochera(Cochera cochera) {
		this.cochera = cochera;
	}

	public Departamento getDepartamento() {
		return departamento;
	}

	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(departamento);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Gerente other = (Gerente) obj;
		return departamento == other.departamento;
	}

}
