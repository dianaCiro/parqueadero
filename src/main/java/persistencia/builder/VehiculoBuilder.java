package persistencia.builder;

import dominio.Carro;
import dominio.Moto;
import dominio.Vehiculo;
import persistencia.entidad.VehiculoEntity;

public class VehiculoBuilder {
	
	public static final String MOTO = "moto";
	public static final String CARRO = "carro";
	private String tipo;
	private String marca;
	private String modelo;
	private String placa;
	private int cilindraje;
	
	
	public VehiculoBuilder() {
	}

	public Vehiculo convertirADominio(VehiculoEntity vehiculoEntity){
		
		Vehiculo vehiculo = null;
		
		if(vehiculoEntity != null){
			
			tipo = vehiculoEntity.getTipoVehiculo();
			marca = vehiculoEntity.getMarca();
			modelo = vehiculoEntity.getModelo();
			placa = vehiculoEntity.getPlaca();
			
			if (tipo.equalsIgnoreCase(MOTO)) {
				
				cilindraje = vehiculoEntity.getCilindraje();
				vehiculo = new Moto(marca, modelo, placa, cilindraje);
				
			}else{
				
				vehiculo = new Carro(marca, modelo, placa);
				
			}
			
		}
		return vehiculo;
	}
	
	public VehiculoEntity convertirAEntity(Vehiculo vehiculo){
		
		VehiculoEntity vehiculoEntity = null;
		
		if(vehiculo != null){
			placa = vehiculo.getPlaca();
			modelo = vehiculo.getModelo();
			marca = vehiculo.getMarca();
			cilindraje = 0;
			tipo = CARRO;
			
			if(vehiculo instanceof Moto){
				Moto moto = (Moto)vehiculo;
				cilindraje = moto.getCilindraje();
				tipo = MOTO;
			}
			
			vehiculoEntity = new VehiculoEntity(placa, tipo, cilindraje, modelo, marca);
		}
		return vehiculoEntity;
		
	}
}
