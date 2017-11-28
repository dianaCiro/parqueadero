package persistencia.repositorio;



import javax.persistence.EntityManager;
import javax.persistence.Query;

import dominio.Parqueadero;
import dominio.repositorio.RepositorioParqueadero;
import persistencia.builder.ParqueaderoBuilder;
import persistencia.entidad.ParqueaderoEntity;


public class RepositorioParqueaderoPersistente implements RepositorioParqueadero{
	
	private EntityManager entityManager;
	private static final String BUSCAR_PARQUEADERO = "buscarPorNombre";
	private static final String NOMBRE = "nombre";
	private ParqueaderoBuilder parqueaderoBuilder = new ParqueaderoBuilder();
	
	public RepositorioParqueaderoPersistente(EntityManager entityManager) {
		this.entityManager = entityManager;
	}


	@Override
	public void agregar(Parqueadero parqueadero) {
		entityManager.persist(parqueaderoBuilder.convertirAEntity(parqueadero));
		
	}


	@Override
	public Parqueadero obtenerParqueadero(String nombre) {
		ParqueaderoEntity parqueaderoEntity = obtenerParqueaderoEntity(nombre);
		return parqueaderoBuilder.convertirADominio(parqueaderoEntity) ;
	}

	public ParqueaderoEntity obtenerParqueaderoEntity(String nombre){
		Query query = entityManager.createNamedQuery(BUSCAR_PARQUEADERO);
		query.setParameter(NOMBRE, nombre);

		return (ParqueaderoEntity) query.getSingleResult();
	}


	

}
