package br.ufpa.cbcc.calculadora;

public class Financeira extends Calculadora{
	public Financeira(){}
	public Financeira(Financeira c){}
	public double juros_simples(double capital, double taxa, int periodos){}
	public double juros_compostos(double capital, double taxa, int periodos){}
	public Financeira operator=(Financeira c){}
	public void imprimir(){}
	public void truncar(){}
	public boolean ligar(){}
	public boolean desligar(){}
	
	protected double valor_simples;
	protected double valor_composto;
	protected boolean power;
}
