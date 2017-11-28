package persistencia.repositorio;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import dominio.Vehiculo;
import dominio.repositorio.RepositorioVehiculo;
import persistencia.builder.VehiculoBuilder;
import persistencia.entidad.VehiculoEntity;

public class RepositorioVehiculoPersistente implements RepositorioVehiculo{
	
	private EntityManager entityManager;
	private VehiculoBuilder vehiculoBuilder;
	private static final String BUSCAR_VEHICULO = "Vehiculo.buscarPorPlaca";
	private static final String PLACA = "placa";
	
	public RepositorioVehiculoPersistente(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

	@Override
	public Vehiculo obtenerPorPlaca(String placa) {
		VehiculoEntity vehiculoEntity = obtenerVehiculoEntityPorPlaca(placa);
		return vehiculoBuilder.convertirADominio(vehiculoEntity);
	}

	@Override
	public void insertar(Vehiculo vehiculo) {
		entityManager.persist(vehiculoBuilder.convertirAEntity(vehiculo));
		
	}

	public VehiculoEntity obtenerVehiculoEntityPorPlaca(String placa){
		Query query = entityManager.createNamedQuery(BUSCAR_VEHICULO);
		query.setParameter(PLACA, placa);

		return (VehiculoEntity) query.getSingleResult();
	}
	
	
}
