package persistencia.entidad;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;



@Entity(name = "Parqueadero")
@NamedQuery(name = "buscarPorNombre", query = "SELECT parqueadero FROM Parqueadero parqueadero WHERE parqueadero.nombre = :nombre")
public class ParqueaderoEntity {
	
	@Id
	private String nombre;
	@Column(nullable = false)
	private int capacidadCarros;
	@Column(nullable = false)
	private int capacidadMotos;
	@Column(nullable = false)
	private int valorHoraCarro;
	@Column(nullable = false)
	private int valorHoraMoto;
	@Column(nullable = false)
	private int valorDiaCarro;
	@Column(nullable = false)
	private int valorDiaMoto;
	
	public ParqueaderoEntity(String nombre, int capacidadCarros, int capacidadMotos, int valorHoraCarro, int valorHoraMoto,
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
