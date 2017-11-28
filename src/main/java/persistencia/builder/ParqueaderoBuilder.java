package persistencia.builder;

import dominio.Parqueadero;
import persistencia.entidad.ParqueaderoEntity;

public class ParqueaderoBuilder {

	private String nombre;
	private int capacidadCarros;
	private int capacidadMotos;
	private int valorHoraCarro;
	private int valorHoraMoto;
	private int valorDiaCarro;
	private int valorDiaMoto;
	
	public ParqueaderoBuilder(){}
	
	public Parqueadero convertirADominio(ParqueaderoEntity parqueaderoEntity){
		Parqueadero parqueadero = null;
		if(parqueaderoEntity != null){
			nombre = parqueaderoEntity.getNombre();
			capacidadCarros = parqueaderoEntity.getCapacidadCarros();
			capacidadMotos = parqueaderoEntity.getCapacidadMotos();
			valorHoraCarro = parqueaderoEntity.getValorHoraCarro();
			valorHoraMoto = parqueaderoEntity.getValorHoraMoto();
			valorDiaCarro = parqueaderoEntity.getValorDiaCarro();
			valorDiaMoto = parqueaderoEntity.getValorDiaMoto();
			parqueadero = new Parqueadero(nombre,capacidadCarros, capacidadMotos, valorHoraCarro, 
										  valorHoraMoto, valorDiaCarro, valorDiaMoto);
		}
		return parqueadero;
	}
	
	public ParqueaderoEntity convertirAEntity(Parqueadero parqueadero){
		ParqueaderoEntity parqueaderoEntity = null;
		if(parqueadero != null){
			nombre = parqueadero.getNombre();
			capacidadCarros = parqueadero.getCapacidadCarros();
			capacidadMotos = parqueadero.getCapacidadMotos();
			valorHoraCarro = parqueadero.getValorHoraCarro();
			valorHoraMoto = parqueadero.getValorHoraMoto();
			valorDiaCarro = parqueadero.getValorDiaCarro();
			valorDiaMoto = parqueadero.getValorDiaMoto();
			parqueaderoEntity = new ParqueaderoEntity(nombre,capacidadCarros, capacidadMotos, valorHoraCarro, 
													  valorHoraMoto, valorDiaCarro, valorDiaMoto);
		}
		
		return parqueaderoEntity;
	}
}
