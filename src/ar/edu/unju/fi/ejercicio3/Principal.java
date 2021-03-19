package ar.edu.unju.fi.ejercicio3;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ProcesoFecha f1= new ProcesoFecha();
		System.out.println("cantidad de días del mes:"+f1.devolverCantidadDiasMes(f1.getMes(), f1.getAnio()));
		f1.mostrarNombreMes(f1.getMes());
		System.out.println("fecha formato reducido:");
		f1.mostrarFormatoReducido();
		System.out.println("Fecha formato simple");
		f1.mostrarFormatoSimple();
		System.out.println("fecha valida?");
		f1.validar();
		
		//-----------------------------------------------------------
		System.out.println("Datos de la Fecha");
		Scanner entrada = new Scanner(System.in);
		System.out.print("Ingrese Día:");
		short dia = entrada.nextShort();
		System.out.print("Ingrese Mes:");
		short mes = entrada.nextShort();
		System.out.print("Ingrese Año:");
		short anio = entrada.nextShort();
		entrada.close();
		ProcesoFecha f2 = new ProcesoFecha(dia, mes, anio);
		System.out.println("cantidad de días del mes:"+f2.devolverCantidadDiasMes(f2.getMes(), f2.getAnio()));
		f2.mostrarNombreMes(f2.getMes());
		System.out.println("fecha formato reducido:");
		f2.mostrarFormatoReducido();
		System.out.println("Fecha formato simple");
		f2.mostrarFormatoSimple();
		System.out.println("fecha valida?");
		f2.validar();
		
		

	}

}
