package dominio.integracion;



import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import dominio.Parqueadero;
import dominio.repositorio.RepositorioParqueadero;
import persistencia.sistema.SistemaDePersistencia;
import testdatabuilder.ParqueaderoTestDataBuilder;


public class ParqueaderoTest {
	private SistemaDePersistencia sistemaPersistencia;
	private RepositorioParqueadero repositorioParqueadero;
	private Parqueadero parqueadero;

	@Before
	public void inicializar() {
		
		sistemaPersistencia = new SistemaDePersistencia();
		repositorioParqueadero = sistemaPersistencia.obtenerRepositorioParqueadero();
		sistemaPersistencia.iniciar();
	}
	
	@After
	public void terminar() {
		sistemaPersistencia.terminar();
	}
	
	@Test
	public void agregarParqueadero(){
		//Arrange
		parqueadero = new ParqueaderoTestDataBuilder().build();
		String nombre;
		//Act
		repositorioParqueadero.agregar(parqueadero);
		nombre = repositorioParqueadero.obtenerParqueadero(parqueadero.getNombre()).getNombre();
		//Assert
		Assert.assertTrue(nombre.equals(parqueadero.getNombre()));
	}
}
