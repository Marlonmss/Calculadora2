package br.ufpa.cbcc.calculadora;

public abstract class Calculadora extends Dispositivo implements Dividir, CalculoInf {
	public Calculadora(){}
	public Calculadora(double aa, double bb, double cc){}
	public Calculadora(Calculadora co){}
	public Calculadora(int dia, int mes, int ano){}
	public void atribuir(double aa, double bb, double cc){}
	public abstract void imprimir();
	public void imprimirPontos(){}
	public void imprimirData(){}
	public void imprimirTudo(){}
	public double somar(){}
	public double multiplicar(){}
	public double betar(){}
	public static double retorna_beta(){}
	public static void divertir(String meme){}
	public void operarPontos(){}
	public void guardarAntigos(){}
	public void adicionarPonto(Ponto pont){}
	public Calculadora operator=(Calculadora co){}
	public abstract void truncar();
	public int dividir(int numerador, int denominador)
	{
		return variavel_d = numerador/denominador;
	}
	
	public int calcRestoDivisao(int quociente, int divisor)
	{
		return variavel_d = quociente % divisor;
	}
	
	protected double variavel_a;
	protected double variavel_b;
	protected double variavel_c;
	protected int variavel_d;
	protected Ponto alpha;
	protected Ponto gama;
	protected Ponto delta;
	protected Ponto lista;
	protected Memoria memo;
	protected int dim;
	
	private static String easter_egg;
	private static double beta = 1.6646234298426847;
	private Data ligou;
}
