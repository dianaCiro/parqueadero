package persistencia.sistema;

import javax.persistence.EntityManager;


import dominio.repositorio.RepositorioParqueadero;
import dominio.repositorio.RepositorioVehiculo;
import persistencia.conexion.ConexionJPA;
import persistencia.repositorio.RepositorioParqueaderoPersistente;
import persistencia.repositorio.RepositorioVehiculoPersistente;

public class SistemaDePersistencia {

	private EntityManager entityManager;

	public SistemaDePersistencia() {
		this.entityManager = new ConexionJPA().createEntityManager();
	}

	public RepositorioParqueadero obtenerRepositorioParqueadero() {
		return new RepositorioParqueaderoPersistente(entityManager);
	}
	
	public RepositorioVehiculo obtenerRepositorioVehiculo() {
		return new RepositorioVehiculoPersistente(entityManager);
	}
	
	
	public void iniciar() {
		entityManager.getTransaction().begin();
	}

	public void terminar() {
		entityManager.getTransaction().commit();
	}
}
