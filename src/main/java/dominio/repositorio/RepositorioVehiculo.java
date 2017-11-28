package dominio.repositorio;

import dominio.Vehiculo;

public interface RepositorioVehiculo {
	
	Vehiculo obtenerPorPlaca(String placa);
	void insertar(Vehiculo vehiculo);
	
}
