package ar.edu.unju.fi.ejercicio2;

public class Cuenta {
	private long numeroCuenta;
	private long dni;
	private double saldoActual;
	
	public Cuenta() {
		
	}

	public Cuenta(long numeroCuenta, long dni, double saldoActual) {
		super();
		this.numeroCuenta = numeroCuenta;
		this.dni = dni;
		this.saldoActual = saldoActual;
	}

	public long getNumeroCuenta() {
		return numeroCuenta;
	}

	public void setNumeroCuenta(long numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}

	public long getDni() {
		return dni;
	}

	public void setDni(long dni) {
		this.dni = dni;
	}

	public double getSaldoActual() {
		return saldoActual;
	}

	public void setSaldoActual(double saldoActual) {
		this.saldoActual = saldoActual;
	}

	@Override
	public String toString() {
		return "Cuenta [numeroCuenta=" + numeroCuenta + ", dni=" + dni + ", saldoActual=" + saldoActual + "]";
	}
	
	/**
	 * Metodo que permite depositar dinero en la cuenta bancaria
	 * @param monto es el valor a depositar
	 */
	public void depositar(double monto) {
		this.saldoActual= this.saldoActual+monto;
		System.out.println("Se depositó la cantidad de $"+monto+". Su saldo es de:"+ this.saldoActual);
	}
	
	/**
	 * Metodo que permite extraer dinero de la cuenta bancaria
	 * @param monto es el valor a extraer
	 */
	public void extraer(double monto) {
		
		if(this.saldoActual<monto) {
			System.out.println("Saldo insuficiente");
		}else {
			this.saldoActual=this.saldoActual-monto;
			System.out.println("Monto de Extracción: $"+monto+". Su saldo es de: $"+this.saldoActual);
		}
	}
	
	

}
