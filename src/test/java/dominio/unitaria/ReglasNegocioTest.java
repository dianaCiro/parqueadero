package dominio.unitaria;

import org.junit.Before;
import org.junit.Test;

import dominio.Carro;
import dominio.Moto;
import dominio.ReglasNegocio;
import dominio.Vehiculo;
import testdatabuilder.CarroTestDataBuilder;
import testdatabuilder.MotoTestDataBuilder;



import java.util.Calendar;

import org.junit.Assert;

public class ReglasNegocioTest {
	
	private static final String MENSAJE_AUTORIZACION = "No esta autorizado para ingresar";
	private Vehiculo carro;
	private Vehiculo moto;
	private ReglasNegocio reglasNegocio;
	private MotoTestDataBuilder motoBuilder;
	private CarroTestDataBuilder carroBuilder;
	private Calendar fechaEntrada;
	private Calendar fechaSalida;
	private String auxStr;
	private int auxInt;
	private boolean auxBool;
	
	@Before
	public void inicializar(){
		
		reglasNegocio = new ReglasNegocio();
		fechaEntrada = Calendar.getInstance();
		fechaSalida = Calendar.getInstance();
	}
	
	
	@Test
	public void letraInicialPlacaA(){
		
		//Arrange
		carroBuilder = new CarroTestDataBuilder().conPlaca("aSD FFF");
		carro = carroBuilder.build();
		
		//Act
		auxBool = reglasNegocio.esLetraInicialA(carro.getPlaca());
		
		//Assert
		Assert.assertTrue(auxBool);
	}
	
	/*Ingresa dia domingo con  placa inicial A */
	@Test
	public void permitirIngreso(){
		
		//Arrange
		carroBuilder = new CarroTestDataBuilder().conPlaca("ASD FFF");
		carro = carroBuilder.build();
		fechaEntrada.set(Calendar.DAY_OF_WEEK, 1);
		
		//Act
		auxStr = reglasNegocio.permitirIngreso(carro, fechaEntrada);
		
		//Assert
		Assert.assertTrue(auxStr.equalsIgnoreCase(MENSAJE_AUTORIZACION));
	}
	
	@Test
	public void cilindrajeMayor500(){
		
		//Arrange
		motoBuilder = new MotoTestDataBuilder().conCilindraje(510);
		moto = motoBuilder.build();
		
		//Act
		auxBool = reglasNegocio.validarCilindrajeMoto(moto);
		
		//Assert
		Assert.assertTrue(auxBool);
	}
	
	@Test
	public void calcularTiempoDePermanencia(){
		
		//Arrange
		fechaEntrada.set(Calendar.HOUR_OF_DAY, 10);
		fechaSalida.set(Calendar.HOUR_OF_DAY, 22);
		
		//Act
		auxInt = reglasNegocio.calcularTiempoDePermanencia(fechaEntrada , fechaSalida);
		
		//Assert
		Assert.assertEquals(auxInt, 12);
		
	}
	
	@Test
	public void calcularMontoAPagarMoto(){
		
		//Arrange
		fechaEntrada.set(Calendar.HOUR_OF_DAY, 10);
		fechaSalida.set(Calendar.HOUR_OF_DAY, 20);
		motoBuilder = new MotoTestDataBuilder().conCilindraje(650);
		moto = motoBuilder.build();
		//Act
		auxInt = reglasNegocio.calcularMontoAPagar(moto,fechaEntrada,fechaSalida );
		
		//Assert
		Assert.assertEquals(auxInt, 6000);
		
		
	}
	
	@Test
	public void calcularMontoAPagarCarro(){
		
		//Arrange
		int diaEntrada = fechaEntrada.get(Calendar.DAY_OF_MONTH);
		fechaEntrada.set(Calendar.HOUR_OF_DAY, 1);
		fechaSalida.set(Calendar.DAY_OF_MONTH, diaEntrada + 1);
		fechaSalida.set(Calendar.HOUR_OF_DAY, 4);
		carroBuilder = new CarroTestDataBuilder().conPlaca("ASD FFF");
		carro = carroBuilder.build();
		//Act
		auxInt = reglasNegocio.calcularMontoAPagar(carro,fechaEntrada,fechaSalida );
		
		//Assert
		Assert.assertEquals(auxInt, 11000);
		
		
	}
}


