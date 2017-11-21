package testdatabuilder;

import dominio.Moto;

public class MotoTestDataBuilder {
	
	private static final String MARCA = "HONDA";
	private static final String MODELO = "2012";
	private static final String PLACA = "STU66";
	private static final int CILINDRAJE = 149;
	
	private String marca;
	private String modelo;
	private String placa;
	private int cilindraje;
	
	public MotoTestDataBuilder() {
		this.marca = MARCA;
		this.modelo = MODELO;
		this.placa = PLACA;
	}

	public MotoTestDataBuilder conMarca(String marca) {
		this.marca = marca;
		return this;
	}

	public MotoTestDataBuilder conModelo(String modelo) {
		this.modelo = modelo;
		return this;
	}

	public MotoTestDataBuilder conPlaca(String placa) {
		this.placa = placa;
		return this;
	}

	public MotoTestDataBuilder conCilindraje(int cilindraje) {
		this.cilindraje = cilindraje;
		return this;
	}
	
	public Moto build() {
		return new Moto(this.marca, this.modelo, this.placa, this.cilindraje);
	}
}


