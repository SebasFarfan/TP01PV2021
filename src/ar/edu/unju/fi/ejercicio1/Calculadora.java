package ar.edu.unju.fi.ejercicio1;

public class Calculadora {
	private String color;
	private String marca;
	private String tamanio;
	private double operando1;
	private double operando2;

	/**
	 * constructor sin parametros
	 */
	public Calculadora() {
		super();
	}

	/**
	 * Constructor con parametros
	 */
	public Calculadora(String color, String marca, String tamanio, double operando1, double operando2) {
		
		this.color = color;
		this.marca = marca;
		this.tamanio = tamanio;
		this.operando1 = operando1;
		this.operando2 = operando2;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getTamanio() {
		return tamanio;
	}

	public void setTamanio(String tamanio) {
		this.tamanio = tamanio;
	}

	public double getOperando1() {
		return operando1;
	}

	public void setOperando1(double operando1) {
		this.operando1 = operando1;
	}

	public double getOperando2() {
		return operando2;
	}

	public void setOperando2(double operando2) {
		this.operando2 = operando2;
	}

	@Override
	public String toString() {
		return "Calculadora [color=" + color + ", marca=" + marca + ", tamanio=" + tamanio + ", operando1=" + operando1
				+ ", operando2=" + operando2 + "]";
	}
	
	public double sumar() {
		return this.operando1+this.operando2;
	}
	
	public double restar() {
		return this.operando1-this.operando2;
	}
	
	public double multiplicar() {
		return this.operando1*this.operando2;
	}
	
	public double dividir() {
		return this.operando1/this.operando2;
	}
	

}
