package dominio.repositorio;


import dominio.Parqueadero;

public interface RepositorioParqueadero {
	
	void agregar(Parqueadero parqueadero);
	Parqueadero obtenerParqueadero(String nombre);
}
