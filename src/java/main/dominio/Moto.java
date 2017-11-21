package dominio;

public class Moto extends Vehiculo{
	

	private int cilindraje;
	
	public int getCilindraje() {
		return cilindraje;
	}

	public void setCilindraje(int cilindraje) {
		this.cilindraje = cilindraje;
	}

	public Moto(String marca, String modelo, String placa, int cilindraje) {
		super(marca, modelo, placa);
		this.cilindraje = cilindraje;
	}
	
	
}
