package persistencia.entidad;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
/*
@Entity
@NamedQuery(name = "Vehiculo.buscarPorPlaca", query = "SELECT vehiculo FROM Vehiculo vehiculo WHERE vehiculo.placa = :placa")
*/public class VehiculoEntity {
	
	/*@Id
	@Column*/
	private String placa;
	
	//@Column(nullable = false)
	private String tipoVehiculo;
	
	//@Column(nullable = false)
	private int cilindraje;

	//@Column(nullable = false)
	private String modelo;
	
	//@Column(nullable = false)
	private String marca;
	
	
	public VehiculoEntity(String placa, String tipoVehiculo, int cilindraje, String modelo, String marca) {
		this.placa = placa;
		this.tipoVehiculo = tipoVehiculo;
		this.cilindraje = cilindraje;
		this.modelo = modelo;
		this.marca = marca;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getTipoVehiculo() {
		return tipoVehiculo;
	}

	public void setTipoVehiculo(String tipoVehiculo) {
		this.tipoVehiculo = tipoVehiculo;
	}

	public int getCilindraje() {
		return cilindraje;
	}

	public void setCilindraje(int cilindraje) {
		this.cilindraje = cilindraje;
	}
	
	
}
