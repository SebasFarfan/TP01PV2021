package ar.edu.unju.fi.ejercicio5;

import java.util.Scanner;

import ar.edu.unju.fi.ejercicio4.CalculoMatematico;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Clase CalculoMatematico");
		Scanner entrada= new Scanner(System.in);
		System.out.println("Ingrese el valor de n:");
		int n = entrada.nextInt();
		entrada.close();
		CalculoMatematico cm = new CalculoMatematico(n);
		System.out.println("Valor de la sumatoria:"+ cm.calcularSumatoriaWhile());
		System.out.println("Valor de la Productoria:"+cm.calcularProductoriaWhile());

	}

}
