package ar.edu.unju.fi.ejercicio3;

public class ProcesoFecha {
	private short dia;
	private short mes;
	private short anio;

	/**
	 * constructor sin parametros cuyos valores por defecto 1-1-1900
	 */
	public ProcesoFecha() {
		this.dia = 1;
		this.mes = 1;
		this.anio = 1900;
	}

	/**
	 * constructor con parametros
	 * 
	 * @param dia  de 1 al 31
	 * @param mes  de 1 al 12
	 * @param anio de 1900 a 2021
	 */
	public ProcesoFecha(short dia, short mes, short anio) {
		this.dia = dia;
		this.mes = mes;
		this.anio = anio;
	}

	public short getDia() {
		return dia;
	}

	public void setDia(short dia) {
		this.dia = dia;
	}

	public short getMes() {
		return mes;
	}

	public void setMes(short mes) {
		this.mes = mes;
	}

	public short getAnio() {
		return anio;
	}

	public void setAnio(short anio) {
		this.anio = anio;
	}

	/**
	 * Método que determina si el año ingresado es bisiesto.
	 * 
	 * @param anio
	 * @return true si es bisiesto, en otro caso retorna false.
	 */
	public boolean verificarBisiesto(short anio) {
		boolean bisiesto = false;
		if (anio % 4 == 0 && (anio % 100 != 0 || anio % 400 == 0)) {
			bisiesto = true;
		}
		return bisiesto;
	}

	/**
	 * Método que devuelve la cantidad de días que tiene un mes
	 * 
	 * @param mes  valor entero de 1 a 12.
	 * @param anio valor entero de 1900 a 2021.
	 * @return la cantidad de días que tiene el mes ingresado
	 */
	public short devolverCantidadDiasMes(short mes, short anio) {
		short cantidad = 0;
		if ((mes < 7 && mes % 2 != 0) || (mes > 7 && mes % 2 == 0)) {
			cantidad = 31;
		} else if ((mes < 7 && mes % 2 == 0 && mes != 2) || (mes > 7 && mes % 2 != 0)) {
			cantidad = 30;
		} else if (mes == 2) {
			if (verificarBisiesto(anio)) {
				cantidad = 29;
			} else {
				cantidad = 28;
			}
		}
		return cantidad;
	}

	/**
	 * Método que muestra una cadena con la fecha en el formato "dd-mm-aaaa".
	 */
	public void mostrarFormatoSimple() {
		String fecha = String.valueOf(this.dia) + "-" + String.valueOf(this.mes) + "-" + String.valueOf(this.anio);
		System.out.println(fecha);
	}

	/**
	 * Método que muestra una cadena con la fecha en el formato "dd/mm/aa".
	 */
	public void mostrarFormatoReducido() {
		String fecha = String.valueOf(this.dia) + "/" + String.valueOf(this.mes) + "/"
				+ String.valueOf(this.anio).substring(2);
		System.out.println(fecha);
	}

	/**
	 * Método que muestra el nombre del mes por ejemplo si mes=1 entonces mostrará
	 * Enero.
	 * 
	 * @param mes valor de 1 a 12
	 */
	public void mostrarNombreMes(short mes) {
		String nombreMes = "";
		switch (mes) {
		case 1:
			nombreMes = "Enero";
			break;
		case 2:
			nombreMes = "Febrero";
			break;
		case 3:
			nombreMes = "Marzo";
			break;
		case 4:
			nombreMes = "Abril";
			break;
		case 5:
			nombreMes = "Mayo";
			break;
		case 6:
			nombreMes = "Junio";
			break;
		case 7:
			nombreMes = "Julio";
			break;
		case 8:
			nombreMes = "Agosto";
			break;
		case 9:
			nombreMes = "Septiembre";
			break;
		case 10:
			nombreMes = "Octubre";
			break;
		case 11:
			nombreMes = "Noviembre";
			break;
		case 12:
			nombreMes = "Diciembre";
			break;
		}
		System.out.println("Mes:" + nombreMes);
	}

	/**
	 * Método que valida la fecha del objeto del tipo ProcesoFecha
	 * si el dia no es correcto devuelve 1.
	 * si el mes no es correcto devuelve 1.
	 * si el año no es correcto devuelve 1900.
	 */
	public void validar() {

		short valorAnio = 0;
		short valorMes = 0;
		short valorDia = 0;
		boolean correcto = true;
		// validar el año
		if (!(this.anio >= 1900 && this.anio <= 2021)) {
			valorAnio = 1900;
			correcto = false;
		}

		// validar mes
		if (!(this.mes >= 1 && this.mes <= 12)) {
			valorMes = 1;
			correcto = false;
		}

		// validar dia
		if (!(this.dia >= 1 && this.dia <= this.devolverCantidadDiasMes(this.mes, this.anio))) {
			valorDia = 1;
			correcto = false;
		}

		if (!correcto) {
			if (valorAnio != 0) {
				this.anio = valorAnio;
			}
			if (valorMes != 0) {
				this.mes = valorMes;
			}
			if (valorDia != 0) {
				this.dia = valorDia;
			}
			System.out.println("Fecha no Valida");
		}
		
		this.mostrarFormatoSimple();
	}

}
