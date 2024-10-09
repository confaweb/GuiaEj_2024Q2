package ar.edu.unlam.tests;

import static org.junit.Assert.*;

import java.time.LocalDate;

import org.junit.Test;

import ar.edu.unlam.empresa.CategoriaEmpleado;
import ar.edu.unlam.empresa.Cochera;
import ar.edu.unlam.empresa.Departamento;
import ar.edu.unlam.empresa.Director;
import ar.edu.unlam.empresa.Empleado;
import ar.edu.unlam.empresa.Empresa;
import ar.edu.unlam.empresa.Gerente;
import ar.edu.unlam.empresa.Persona;

public class PruebasEmpresa {

	@Test//#1
	public void queLaEmpresaPuedaBUscarUnEmpleadoPorDni() {
		String nombre = "Pedro", apellido = "Sanchez", razoonSocial = "PepeHermanos";
		Integer dni = 111111, cuit = 3011115;
		Double salario = 1000000.0, salarioGerente = 5000000.0;
		LocalDate fechaDeNacimiento = LocalDate.of(2000, 10, 10);
		CategoriaEmpleado categoria=CategoriaEmpleado.INGENIERO;
		// Entrada
		Empleado empleado1 = new Empleado(nombre, apellido, dni, fechaDeNacimiento, salario,categoria);
		Gerente gerente = new Gerente(nombre, apellido, dni, fechaDeNacimiento, salarioGerente,categoria);
		Empresa empresa = new Empresa(razoonSocial, cuit);
		// Proceso
		assertTrue(empresa.ingresarEmpleado(empleado1));
		// Salida
		Empleado vo = empresa.buscarEmpleadoPOrDni(dni);
		Empleado ve = empleado1;
		assertEquals(ve, vo);

	}
	@Test//#2
	public void queLaEmpresaPuedaBuscarUnGerentePordepartamento() {
		String nombre = "Pedro", apellido = "Sanchez", razoonSocial = "PepeHermanos";
		Integer dni = 111111, cuit = 3011115;
		Double salario = 1000000.0, salarioGerente = 5000000.0;
		LocalDate fechaDeNacimiento = LocalDate.of(2000, 10, 10);
		Departamento departamento=Departamento.MANTENIMIENTO;
		CategoriaEmpleado categoria=CategoriaEmpleado.INGENIERO;
		// Entrada
		
		Gerente gerente = new Gerente(nombre, apellido, dni, fechaDeNacimiento, salarioGerente,categoria);
		Empresa empresa = new Empresa(razoonSocial, cuit);
		// Proceso
		assertTrue(empresa.ingresarGerente(gerente));
		gerente.setDepartamento(departamento);;
		// Salida
		Gerente vo = empresa.buscarGerentePorDepartamento(departamento);
		Empleado ve = gerente;
		assertEquals(ve, vo);

	}
	@Test//#3
	public void queLaEmpresaPuedaAsignarUNaCocheraPorGerente() {
		String nombre = "Pedro", apellido = "Sanchez", razoonSocial = "PepeHermanos";
		Integer dni = 111111, cuit = 3011115;
		Double salario = 1000000.0, salarioGerente = 5000000.0;
		LocalDate fechaDeNacimiento = LocalDate.of(2000, 10, 10);
		Cochera cochera=Cochera.NUMERO_COCHERA;
		CategoriaEmpleado categoria=CategoriaEmpleado.INGENIERO;
		
		// Entrada
		
		Gerente gerente = new Gerente(nombre, apellido, dni, fechaDeNacimiento, salarioGerente,categoria);
		Empresa empresa = new Empresa(razoonSocial, cuit);
		// Proceso
		assertTrue(empresa.asignarCochera(gerente, cochera));
		// Salida
		Cochera vo = gerente.getCochera();
		Cochera ve = cochera;
		assertEquals(ve, vo);

	}
	@Test//#4
	public void queElSlarioDeUnEmpleadoIngenieroSumeElAdicionalProdctividad() {
		String nombre = "Pedro", apellido = "Sanchez", razoonSocial = "PepeHermanos";
		Integer dni = 111111, cuit = 3011115;
		Double salario = 1000000.0, salarioGerente = 5000000.0,adicionalProductividad=0.20,
				salarioIngeniero=salario+(salario*adicionalProductividad);
		LocalDate fechaDeNacimiento = LocalDate.of(2000, 10, 10);
		Cochera cochera=Cochera.NUMERO_COCHERA;
		CategoriaEmpleado categoria=CategoriaEmpleado.INGENIERO,categoria2=CategoriaEmpleado.ABOGADO;
		
		// Entrada
		Empleado empleado1 = new Empleado(nombre, apellido, dni, fechaDeNacimiento, salario,categoria);
		Empleado empleado2 = new Empleado(nombre, apellido, dni, fechaDeNacimiento, salario,categoria2);
		empleado1.setSalario(salario);
		empleado2.setSalario(salario);
		
		//SALIDA
		
		Double vo = empleado1.getSalario();
		Double ve = 1200000.0;
		assertEquals(ve, vo);
		Double vo2 = empleado2.getSalario();
		Double ve2= 1000000.0;
		assertEquals(ve2, vo2);

	}
	@Test//#5
	public void queUnDirectorCobreSueldoExtra() {
		String nombre = "Pedro", apellido = "Sanchez", razoonSocial = "PepeHermanos";
		Integer dni = 111111, cuit = 3011115;
		Double salario = 1000000.0, salarioGerente = 5000000.0,adicionalProductividad=0.20,
				salarioIngeniero=salario+(salario*adicionalProductividad);
		LocalDate fechaDeNacimiento = LocalDate.of(2000, 10, 10);
		Cochera cochera=Cochera.NUMERO_COCHERA;
		CategoriaEmpleado categoria=CategoriaEmpleado.INGENIERO,categoria2=CategoriaEmpleado.ABOGADO;
		
		// Entrada
		Empleado empleado1 = new Empleado(nombre, apellido, dni, fechaDeNacimiento, salario,categoria);
		Director director = new Director(nombre, apellido, dni, fechaDeNacimiento, salarioGerente,categoria2);
		empleado1.setSalario(salario);
		director.setSalario(salario);
		
		//SALIDA
		
		Double vo = empleado1.getSalario();
		Double ve = 1200000.0;
		assertEquals(ve, vo);
		Double vo2 = director.getSalario();
		Double ve2= 7000000.0;
		assertEquals(ve2, vo2);

	}


}
