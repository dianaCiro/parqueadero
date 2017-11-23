package dominio;

import java.util.Calendar;

import dominio.repositorio.RepositorioReglasNegocio;

public class ReglasNegocio implements RepositorioReglasNegocio{

	@Override
	public boolean validarCapacidadCarros() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean validarCapacidadMotos() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean esLetraInicialA(String placa) {
		
		char letra = placa.toLowerCase().charAt(0);
		return letra == 'a';
	}

	@Override
	public boolean validarCilindrajeMoto(Vehiculo vehiculo) {
		Moto moto = (Moto)vehiculo;
		
		return (moto.getCilindraje() > 500);
	}

	@Override
	public Recibo generarRecibo() {
		// TODO Auto-generated method stub
		return null;
	}

	

	@Override
	public String permitirIngreso(Vehiculo vehiculo, Calendar date) {
		
		int dia;
		String autorizar;
		
		autorizar = "Esta autorizado a ingresar";
		dia = date.get(Calendar.DAY_OF_WEEK);
		
		if (esLetraInicialA(vehiculo.getPlaca())){
			if (dia == 1 || dia == 2){
				autorizar = "No esta autorizado para ingresar";
			}
		}
		return autorizar;
	}

}
