package br.ufpa.cbcc.calculadora;

public interface CalculoInf {
	public double derivada(double const_a, double const_b, double const_c, double ponto_x);
	public double integral(double const_a, double const_b, double const_c, int a, int b, int n);
}
