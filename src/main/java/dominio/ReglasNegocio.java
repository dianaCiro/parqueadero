package dominio;

import java.util.Calendar;

import org.hamcrest.core.IsInstanceOf;

import dominio.repositorio.RepositorioReglasNegocio;


public class ReglasNegocio{
	
	private static final int VALOR_HORA_CARRO = 1000;
	private static final int VALOR_HORA_MOTO = 500;
	private static final int VALOR_DIA_CARRO = 8000;
	private static final int VALOR_DIA_MOTO = 4000;
	private static final int EXCEDENTE_MOTO = 2000;
	private static final int HORA_INICIO_DIA = 9;
	
	private Calendar calendario;
	
	public boolean esLetraInicialA(String placa) {
		
		char letra = placa.toLowerCase().charAt(0);
		return letra == 'a';
	}

	
	public boolean validarCilindrajeMoto(Vehiculo vehiculo) {
		Moto moto = (Moto)vehiculo;
		
		return (moto.getCilindraje() > 500);
	}

	
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

	
	public int calcularTiempoDePermanencia(Calendar fechaEntrada, Calendar fechaSalida) {
		
		int horaEntrada;
		int horaSalida;
		int tiempoTotal;
		int diaEntrada;
		int diaSalida;
		int totalDias;
		
	    diaEntrada = fechaEntrada.get(Calendar.DAY_OF_MONTH);
	    diaSalida = fechaSalida.get(Calendar.DAY_OF_MONTH);
	    totalDias = diaSalida - diaEntrada;
	    
		horaEntrada =  fechaEntrada.get(Calendar.HOUR_OF_DAY);
		horaSalida = fechaSalida.get(Calendar.HOUR_OF_DAY);
		tiempoTotal = (totalDias * 24) + horaSalida - horaEntrada;
		
		return tiempoTotal;
	}


	public int calcularMontoAPagar(Vehiculo vehiculo, Calendar fechaEntrada, Calendar fechaSalida) {
		
		int totalHoras;
		int horas = 0;
		int dias = 0;
		int montoAPagar = 0;
		
		totalHoras = calcularTiempoDePermanencia(fechaEntrada, fechaSalida);
		
		if (totalHoras >= 24){
			horas = totalHoras % 24;
			dias = totalHoras / 24;
		} else if (totalHoras > HORA_INICIO_DIA && totalHoras <= 24 ) {
			dias = 1;
		}else {
			horas = totalHoras;
		}
		
		
		if(vehiculo instanceof Moto){
			horas = horas * VALOR_HORA_MOTO;
			dias = dias * VALOR_DIA_MOTO;
			if(validarCilindrajeMoto(vehiculo)){
				montoAPagar = horas + dias + EXCEDENTE_MOTO;
			}else{
				montoAPagar = horas + dias;
			}
		}else {
			horas = horas * VALOR_HORA_CARRO;
			dias = dias * VALOR_DIA_CARRO;
			montoAPagar = horas + dias;
		}
		
		return montoAPagar;
	}
	
	

}
