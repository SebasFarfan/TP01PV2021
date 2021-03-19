package ar.edu.unju.fi.ejercicio4;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Clase CalculoMatematico");
		Scanner entrada= new Scanner(System.in);
		System.out.println("Ingrese el valor de n:");
		int n = entrada.nextInt();
		entrada.close();
		CalculoMatematico cm= new CalculoMatematico(n);
		System.out.println("Valor de la sumatoria:"+ cm.calcularSumatoria());
		System.out.println("Valor de la Productoria:"+cm.calcularProductoria());

	}

}
