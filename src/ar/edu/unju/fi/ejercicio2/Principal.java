package ar.edu.unju.fi.ejercicio2;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//cuenta sin parametro
		Cuenta c1 = new Cuenta();
		c1.setNumeroCuenta(654789123);
		c1.setDni(31564789);
		c1.setSaldoActual(500);
		System.out.println(c1.toString());
		double montoDepositar=1000;		
		System.out.println("Monto a depositar:"+montoDepositar);
		c1.depositar(montoDepositar);
		System.out.println(c1.toString());
		double montoExtraer=2000;
		System.out.println("Monto a Extraer:"+montoExtraer);
		c1.extraer(montoExtraer);
		System.out.println(c1.toString());
		System.out.println("----------------------------------------------------");
		//cuenta con parametros
		Cuenta c2 = new Cuenta(112564789, 30562410, 15000);
		System.out.println(c2.toString());
		double montoDepositar2=1000;		
		System.out.println("Monto a depositar:"+montoDepositar2);
		c2.depositar(montoDepositar2);
		System.out.println(c2.toString());
		double montoExtraer2=2000;
		System.out.println("Monto a Extraer:"+montoExtraer2);
		c2.extraer(montoExtraer2);
		System.out.println(c2.toString());
		
		

	}

}
