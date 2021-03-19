package ar.edu.unju.fi.ejercicio4;

/**
 * Clase CalculoMatematico que realiza operaciones de sumatoria y productoria
 * @author Sebas
 *
 */
public class CalculoMatematico {
	
	private int n;

	public CalculoMatematico(int n) {
		this.n = n;
	}

	public int getN() {
		return n;
	}

	public void setN(int n) {
		this.n = n;
	}

	/**
	 * Método que realiza la sumatoria de n terminos
	 * usa la estructura for.
	 * @return un double que es el resultado de la sumatoria
	 */
	public double calcularSumatoria() {
		double suma = 0;
		double base = 0;
		for (int i = 1; i <= n; i++) {
			base = (i * (i + 1)) / 2;
			suma = suma + Math.pow(base, 2);
		}
		return suma;
	}
	
	/**
	 * Método que realiza la productoria de n terminos
	 * usa la estructura for.
	 * @return un double que es el resultado de la productoria.
	 */
	public double calcularProductoria() {
		double producto = 1;
		for (int i = 1; i <= n; i++) {
			producto = producto * (i * (i + 4));
		}
		return producto;
	}
	
	/**
	 * Método que realiza la sumatoria de n terminos
	 * usa la estructura while.
	 * @return un double que es el resultado de la sumatoria
	 */

	public double calcularSumatoriaWhile() {
		double suma = 0;
		double base = 0;
		int i = 1;
		while (i <= n) {
			base = (i * (i + 1)) / 2;
			suma = suma + Math.pow(base, 2);
			i++;
		}
		return suma;
	}

	/**
	 * Método que realiza la productoria de n terminos
	 * usa la estructura while.
	 * @return un double que es el resultado de la productoria.
	 */
	public double calcularProductoriaWhile() {
		double producto = 1;
		int i = 1;
		while (i <= n) {
			producto = producto * (i * (i + 4));
			i++;
		}
		return producto;
	}

	/**
	 * Método que realiza la sumatoria de n terminos
	 * usa la estructura Do while.
	 * @return un double que es el resultado de la sumatoria
	 */
	public double calcularSumatoriaDoWhile() {
		double suma = 0;
		double base = 0;
		int i = 1;
		do {
			base = (i * (i + 1)) / 2;
			suma = suma + Math.pow(base, 2);
			i=i+1;
		} while (i <= n);
		return suma;
	}

	/**
	 * Método que realiza la productoria de n terminos
	 * usa la estructura do while.
	 * @return un double que es el resultado de la productoria.
	 */
	public double calcularProductoriaDoWhile() {
		double producto = 1;
		int i = 1;
		do {
			producto = producto * (i * (i + 4));
			i=i+1;
		} while (i <= n);

		return producto;
	}

}
