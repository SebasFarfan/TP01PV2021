package ar.edu.unju.fi.ejercicio1;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calculadora c1 = new Calculadora();
		Calculadora c2 = new Calculadora("Blanco", "Casio", "mediano", 5, 2);
		c1.setColor("Rojo");
		c1.setMarca("Patito");
		c1.setTamanio("grande");
		c1.setOperando1(8);
		c1.setOperando2(4);
		System.out.println("Datos de la Calculadora 1 (sin parametros)");
		System.out.println("------------------------------------");
		System.out.println(c1.toString());
		System.out.println("------------------------------------");
		System.out.println("la suma es:"+c1.sumar());
		System.out.println("La Resta es:"+c1.restar());
		System.out.println("La Multiplicación es:"+c1.multiplicar());
		System.out.println("La División es:"+c1.dividir());
		System.out.println();
		
		System.out.println("Datos de la Calculadora 2 (con parametros)");
		System.out.println("------------------------------------");
		System.out.println(c2.toString());
		System.out.println("------------------------------------");
		System.out.println("la suma es:"+c2.sumar());
		System.out.println("La Resta es:"+c2.restar());
		System.out.println("La Multiplicación es:"+c2.multiplicar());
		System.out.println("La División es:"+c2.dividir());
		

	}

}
