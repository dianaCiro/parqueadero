package dominio.repositorio;

import java.util.Calendar;

import dominio.Recibo;
import dominio.Vehiculo;

public interface RepositorioReglasNegocio {
	
	boolean validarCapacidadCarros();
	boolean validarCapacidadMotos();
	boolean esLetraInicialA(String placa);
	boolean validarCilindrajeMoto(Vehiculo vehiculo);	
	String permitirIngreso(Vehiculo vehiculo, Calendar date);
	Recibo generarRecibo();
}
