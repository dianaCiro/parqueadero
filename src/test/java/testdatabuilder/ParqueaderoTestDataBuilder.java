package testdatabuilder;

import dominio.Parqueadero;

public class ParqueaderoTestDataBuilder {
	
	private static final String NOMBRE = "Diana";
	private static final int CAPACIDAD_CARROS = 20;
	private static final int CAPACIDAD_MOTOS = 10;
	private static final int VALOR_HORA_CARRO = 1000;
	private static final int VALOR_HORA_MOTO = 500;
	private static final int VALOR_DIA_CARRO = 8000;
	private static final int VALOR_DIA_MOTO = 4000;
	
	private String nombre;
	private int capacidadCarros;
	private int capacidadMotos;
	private int valorHoraCarro;
	private int valorHoraMoto;
	private int valorDiaCarro;
	private int valorDiaMoto;
	
	public ParqueaderoTestDataBuilder(){
		this.nombre = NOMBRE;
		this.capacidadCarros = CAPACIDAD_CARROS;
		this.capacidadMotos = CAPACIDAD_MOTOS;
		this.valorHoraCarro = VALOR_HORA_CARRO;
		this.valorHoraMoto = VALOR_HORA_MOTO;
		this.valorDiaCarro = VALOR_DIA_CARRO;
		this.valorDiaMoto = VALOR_DIA_MOTO;
	}
	
	public ParqueaderoTestDataBuilder conNombre(String nombre){
		this.nombre = nombre;
		return this;
	}
	
	public ParqueaderoTestDataBuilder conCapacidadCarros(int capacidadCarros){
		this.capacidadCarros = capacidadCarros;
		return this;
	}
	
	public ParqueaderoTestDataBuilder conCapacidadMotos(int capacidadMotos){
		this.capacidadMotos = capacidadMotos;
		return this;
	}
	
	public ParqueaderoTestDataBuilder conValorHoraCarro(int valorHoraCarro){
		this.valorHoraCarro = valorHoraCarro;
		return this;
	}
	
	public ParqueaderoTestDataBuilder conValorHoraMoto(int valorHoraMoto){
		this.valorHoraMoto = valorHoraMoto;
		return this;
	}
	
	public ParqueaderoTestDataBuilder conValorDiaCarro(int valorDiaCarro){
		this.valorDiaCarro = valorDiaCarro;
		return this;
	}
	
	public ParqueaderoTestDataBuilder conValorDiaMoto(int valorDiaMoto){
		this.valorDiaMoto = valorDiaMoto;
		return this;
	}
	
	public Parqueadero build(){
		return new Parqueadero(nombre, capacidadCarros, capacidadMotos, valorHoraCarro,
								valorHoraMoto, valorDiaCarro, valorDiaMoto);
	}
}
