package br.ufpa.cbcc.calculadora;

public class Financeira extends Calculadora{
	public Financeira(){
		this.valor_simples = 0;
		this.valor_composto = 0;
		this.variavel_a = 0;
		this.variavel_b = 0;
		this.variavel_c = 0;
		this.alpha = new Ponto(0,0,0,0,0);
		this.gama = new Ponto(0,0,0,0,0);
		this.delta = new Ponto(0,0,0,0,0);
		this.lista = new Ponto[0];
		this.dim = 0;
	}
	public Financeira(Financeira c){
		valor_simples = c.valor_simples;
	    valor_composto = c.valor_composto;
		variavel_a = c.variavel_a;
		variavel_b = c.variavel_b;
		variavel_c = c.variavel_c;
		alpha = c.alpha;
		gama = c.gama;
		delta = c.delta;
		lista = new Ponto[dim];
		for(int i=0; i<dim; i++)
			lista[i] = c.lista[i];
		memo = c.memo;
	}
	public double juros_simples(double capital, double taxa, int periodos){
		return valor_simples = capital * taxa * periodos;
	}
	public double juros_compostos(double capital, double taxa, int periodos){
		double montante = capital * Math.pow((1+taxa), periodos);
		return valor_composto = montante - capital;
	}
	public void atribuir(Financeira c){
		valor_simples = c.valor_simples;
	    valor_composto = c.valor_composto;
		variavel_a = c.variavel_a;
		variavel_b = c.variavel_b;
		variavel_c = c.variavel_c;
		alpha = c.alpha;
		gama = c.gama;
		delta = c.delta;
		lista = new Ponto[dim];
		for(int i=0; i<dim; i++)
			lista[i] = c.lista[i];
		memo = c.memo;
	}
	public void imprimir(){
		System.out.print("Juros Simples: " + valor_simples + "\nJuros Compostos: " + valor_composto);
	}
	public void truncar(){
		valor_simples = (int) valor_simples;
		valor_composto = (int) valor_composto;
	}
	public boolean ligar(){
		System.out.println("A calculadora financeira está ligada.");
		power = true;
		return power;
	}
	public boolean desligar(){
		System.out.println("A calculadora financeira está desligada.");
		power = false;
		return power;
	}
	public int dividir(int numerador, int denominador)
	{
		try
		{
			dividendo = numerador/denominador;
		}
		catch(ArithmeticException e)
		{
			System.out.println ("Erro: um número não pode ser dividido por zero.");
		}
		return dividendo;
	}
	public double dividir(double numerador, double denominador){
		try
		{
			dividendo = (int)(numerador/denominador);
		}
		catch(ArithmeticException e)
		{
			System.out.println ("Erro: um número não pode ser dividido por zero.");
		}
		return dividendo;
	}
	public int calcRestoDivisao(int quociente, int divisor)
	{
		try
		{
			resto = quociente % divisor;
		}
		catch(ArithmeticException e)
		{
			System.out.println ("Erro: um número não pode ser dividido por zero.");
		}
		return resto;
	}
	
	protected double valor_simples;
	protected double valor_composto;
	protected int dividendo;
	protected int resto;
	protected boolean power;
}
