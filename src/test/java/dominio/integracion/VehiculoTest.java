package dominio.integracion;

import java.util.Calendar;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import dominio.ReglasNegocio;
import dominio.Vehiculo;
import dominio.repositorio.RepositorioParqueadero;
import dominio.repositorio.RepositorioVehiculo;
import persistencia.sistema.SistemaDePersistencia;
import testdatabuilder.CarroTestDataBuilder;

public class VehiculoTest {
	
	private SistemaDePersistencia sistemaPersistencia;
	private RepositorioVehiculo repositorioVehiculo;
	private ReglasNegocio reglasNegocio;
	private static final String MENSAJE_AUTORIZACION = "Esta autorizado a ingresar";
	private Calendar date;
	private String auxStr;
	private Vehiculo vehiculo;
	
	@Before
	public void inicializar() {
		
		reglasNegocio = new ReglasNegocio();
		sistemaPersistencia = new SistemaDePersistencia();
		repositorioVehiculo = sistemaPersistencia.obtenerRepositorioVehiculo();
		date = Calendar.getInstance();
		sistemaPersistencia.iniciar();
	}
	
	@After
	public void terminar() {
		sistemaPersistencia.terminar();
	}
	
	@Test
	public void agregarVehiculo(){
		vehiculo = new CarroTestDataBuilder().conPlaca("A123456").build();
		date.set(Calendar.DAY_OF_WEEK, 3);
		auxStr = reglasNegocio.permitirIngreso(vehiculo, date);
		if(auxStr.equalsIgnoreCase(MENSAJE_AUTORIZACION)){
			repositorioVehiculo.insertar(vehiculo);
		}
		Assert.assertTrue(repositorioVehiculo.obtenerPorPlaca(vehiculo.getPlaca()).equals(vehiculo.getPlaca()));
	}
}
