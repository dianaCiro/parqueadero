package dominio.unitaria;

import org.junit.Before;
import org.junit.Test;


import dominio.ReglasNegocio;
import dominio.Vehiculo;
import testdatabuilder.CarroTestDataBuilder;
import testdatabuilder.MotoTestDataBuilder;



import java.util.Calendar;

import org.junit.Assert;

public class ReglasNegocioTest {
	
	private static final String MENSAJE_AUTORIZACION = "No está autorizado para ingresar";
	private Vehiculo carro;
	private Vehiculo moto;
	private ReglasNegocio reglasNegocio;
	private MotoTestDataBuilder motoBuilder;
	private CarroTestDataBuilder carroBuilder;
	private Calendar date;
	private String auxStr;
	private boolean auxBool;
	
	@Before
	public void inicializar(){
		
		reglasNegocio = new ReglasNegocio();
		
		
		date = Calendar.getInstance();
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
		date.set(Calendar.DAY_OF_WEEK, 1);
		
		//Act
		auxStr = reglasNegocio.permitirIngreso(carro, date);
		
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
	public void reciboSalida(){
		
	}
}
