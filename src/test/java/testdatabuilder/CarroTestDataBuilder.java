package testdatabuilder;

import dominio.Carro;

public class CarroTestDataBuilder {
	
	private static final String MARCA = "Yamaha YBR";
	private static final String MODELO = "2017";
	private static final String PLACA = "JXG 21E";
	
	private String marca;
	private String modelo;
	private String placa;

	public CarroTestDataBuilder() {
		this.marca = MARCA;
		this.modelo = MODELO;
		this.placa = PLACA;
	}

	public CarroTestDataBuilder conMarca(String marca) {
		this.marca = marca;
		return this;
	}

	public CarroTestDataBuilder conModelo(String modelo) {
		this.modelo = modelo;
		return this;
	}

	public CarroTestDataBuilder conPlaca(String placa) {
		this.placa = placa;
		return this;
	}

	public Carro build() {
		return new Carro(this.marca, this.modelo, this.placa);
	}
}


