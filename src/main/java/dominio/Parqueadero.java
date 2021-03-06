package dominio;



public class Parqueadero {
	
	private String nombre;
	private int capacidadCarros;
	private int capacidadMotos;
	private int valorHoraCarro;
	private int valorHoraMoto;
	private int valorDiaCarro;
	private int valorDiaMoto;
	
	

	public Parqueadero(String nombre, int capacidadCarros, int capacidadMotos, int valorHoraCarro, int valorHoraMoto,
			int valorDiaCarro, int valorDiaMoto) {
		this.nombre = nombre;
		this.capacidadCarros = capacidadCarros;
		this.capacidadMotos = capacidadMotos;
		this.valorHoraCarro = valorHoraCarro;
		this.valorHoraMoto = valorHoraMoto;
		this.valorDiaCarro = valorDiaCarro;
		this.valorDiaMoto = valorDiaMoto;
	}

	
	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public int getCapacidadCarros() {
		return capacidadCarros;
	}

	public void setCapacidadCarros(int capacidadCarros) {
		this.capacidadCarros = capacidadCarros;
	}

	public int getCapacidadMotos() {
		return capacidadMotos;
	}

	public void setCapacidadMotos(int capacidadMotos) {
		this.capacidadMotos = capacidadMotos;
	}

	public int getValorHoraCarro() {
		return valorHoraCarro;
	}

	public void setValorHoraCarro(int valorHoraCarro) {
		this.valorHoraCarro = valorHoraCarro;
	}

	public int getValorHoraMoto() {
		return valorHoraMoto;
	}

	public void setValorHoraMoto(int valorHoraMoto) {
		this.valorHoraMoto = valorHoraMoto;
	}

	public int getValorDiaCarro() {
		return valorDiaCarro;
	}

	public void setValorDiaCarro(int valorDiaCarro) {
		this.valorDiaCarro = valorDiaCarro;
	}

	public int getValorDiaMoto() {
		return valorDiaMoto;
	}

	public void setValorDiaMoto(int valorDiaMoto) {
		this.valorDiaMoto = valorDiaMoto;
	}


	
		
}
