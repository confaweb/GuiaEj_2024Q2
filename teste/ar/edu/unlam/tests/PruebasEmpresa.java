package ar.edu.unlam.tests;

import static org.junit.Assert.*;

import java.time.LocalDate;

import org.junit.Test;

import ar.edu.unlam.empresa.Departamento;
import ar.edu.unlam.empresa.Empleado;
import ar.edu.unlam.empresa.Empresa;
import ar.edu.unlam.empresa.Gerente;
import ar.edu.unlam.empresa.Persona;

public class PruebasEmpresa {

	@Test
	public void queLaEmpresaPuedaBUscarUnEmpleadoPorDni() {
		String nombre = "Pedro", apellido = "Sanchez", razoonSocial = "PepeHermanos";
		Integer dni = 111111, cuit = 3011115;
		Double salario = 1000000.0, salarioGerente = 5000000.0;
		LocalDate fechaDeNacimiento = LocalDate.of(2000, 10, 10);
		// Entrada
		Empleado empleado1 = new Empleado(nombre, apellido, dni, fechaDeNacimiento, salario);
		Gerente gerente = new Gerente(nombre, apellido, dni, fechaDeNacimiento, salarioGerente);
		Empresa empresa = new Empresa(razoonSocial, cuit);
		// Proceso
		assertTrue(empresa.ingresarEmpleado(empleado1));
		// Salida
		Empleado vo = empresa.buscarEmpleadoPOrDni(dni);
		Empleado ve = empleado1;
		assertEquals(ve, vo);

	}
	@Test
	public void queLaEmpresaPuedaBuscarUnGerentePordepartamento() {
		String nombre = "Pedro", apellido = "Sanchez", razoonSocial = "PepeHermanos";
		Integer dni = 111111, cuit = 3011115;
		Double salario = 1000000.0, salarioGerente = 5000000.0;
		LocalDate fechaDeNacimiento = LocalDate.of(2000, 10, 10);
		Departamento departamento=Departamento.MANTENIMIENTO;
		// Entrada
		
		Gerente gerente = new Gerente(nombre, apellido, dni, fechaDeNacimiento, salarioGerente);
		Empresa empresa = new Empresa(razoonSocial, cuit);
		// Proceso
		assertTrue(empresa.ingresarGerente(gerente));
		gerente.setDepartamento(departamento);;
		// Salida
		Gerente vo = empresa.buscarGerentePorDepartamento(departamento);
		Empleado ve = gerente;
		assertEquals(ve, vo);

	}

}
