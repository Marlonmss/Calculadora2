package br.ufpa.cbcc.calculadora;

public class Ponto {
	public Ponto(){}
	public Ponto(double xx, double yy, double zz, double tt, double uu){}

	public double calcModulo(){}
	public void imprimir(){}

	public Ponto operator+(Ponto B){}
	public Ponto operator+(double n){}
	public Ponto operator-(Ponto B){}
	public Ponto operator-(double n){}
	public Ponto operator*(Ponto B){}
	public Ponto operator*(double n){}
	public Ponto operator/(Ponto B){}
	public Ponto operator/(double n){}
	public bool operator==(Ponto B){}
	public const Ponto& operator=(Ponto B){}
	
	private double x;
	private double y;
	private double z;
	private double t;
	private double u;
}
