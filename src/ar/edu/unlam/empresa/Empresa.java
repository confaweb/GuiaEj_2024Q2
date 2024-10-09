package ar.edu.unlam.empresa;

import java.util.ArrayList;
import java.util.Objects;

public class Empresa {
	private String razonSocial;
	private Integer cuit;
	private Departamento departamento;
	private ArrayList<Gerente> listadoGerentes;
	private ArrayList<Empleado> listadoEmpleado;

	public Empresa(String razonSocial, Integer cuit) {
		this.razonSocial = razonSocial;
		this.cuit = cuit;
		this.setDepartamento(Departamento.DEPARTAMENTO);
		this.listadoGerentes = new ArrayList<Gerente>();
		this.listadoEmpleado = new ArrayList<Empleado>();
	}

	public String getRazonSocial() {
		return razonSocial;
	}

	public void setRazonSocial(String razonSocial) {
		this.razonSocial = razonSocial;
	}

	public Integer getCuit() {
		return cuit;
	}

	public void setCuit(Integer cuit) {
		this.cuit = cuit;
	}

	public Departamento getDepartamento() {
		return departamento;
	}

	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}

	public ArrayList<Gerente> getListadoGerentes() {
		return listadoGerentes;
	}

	public void setListadoGerentes(ArrayList<Gerente> listadoGerentes) {
		this.listadoGerentes = listadoGerentes;
	}

	public boolean asignarGerente(Gerente gerente) {
		boolean gerenteAsignado = false;
		gerenteAsignado = this.listadoGerentes.add(gerente);
		return gerenteAsignado;
	}

	public boolean ingresarEmpleado(Empleado empleado) {
		Boolean empleadoIngresado = false;
		empleadoIngresado = listadoEmpleado.add(empleado);
		return empleadoIngresado;
	}
	public boolean ingresarGerente(Gerente gerente) {
		Boolean gerenteIngresado = false;
		gerenteIngresado = listadoGerentes.add(gerente);
		return gerenteIngresado;
	}

	public Empleado buscarEmpleadoPOrDni(Integer dni) {
		for (Empleado empleado : listadoEmpleado) {
			if (empleado.getDni() == dni)
				return empleado;
		}
		return null;
	}

	public Gerente buscarGerentePorDepartamento(Departamento departamento) {
		for (Gerente gerente : listadoGerentes) {
			if (gerente.getDepartamento()!=null&& gerente.getDepartamento()==departamento);
				return gerente;
		}
		return null;
	}

	@Override
	public int hashCode() {
		return Objects.hash(cuit);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Empresa other = (Empresa) obj;
		return Objects.equals(cuit, other.cuit);
	}

	public boolean asignarCochera(Gerente gerente,Cochera cochera) {	
		boolean cocheraAsignada = false;
		gerente.setCochera(cochera);
		if (gerente.getCochera()!=null)
			cocheraAsignada=true;
		return cocheraAsignada;
	}

	

	

	
}
