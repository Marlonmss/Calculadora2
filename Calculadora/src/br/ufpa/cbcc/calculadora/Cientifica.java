package br.ufpa.cbcc.calculadora;

public class Cientifica extends Calculadora {
	public Cientifica(){}
	public Cientifica(Cientifica c){}
	public double seno(double teta){}
	public double cosseno(double teta){}
	public double tangente(double teta){}
	public Cientifica operator=(Cientifica c){}
	public void imprimir(){}
	public void truncar(){}
	public boolean ligar(){}
	public boolean desligar(){}
	public double dividir(double numerador, double denominador)
	{
		return dividendo = numerador/denominador;
	}
	public int calcRestoDivisao(int quociente, int divisor)
	{
		return resto = quociente % divisor;
	}
    
	private double valor_seno;
	private double valor_cosseno;
	private double valor_tangente;
	private double dividendo;
	private int resto;
	private boolean power;
}
