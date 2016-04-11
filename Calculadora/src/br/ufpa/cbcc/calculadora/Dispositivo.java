package br.ufpa.cbcc.calculadora;

public abstract class Dispositivo {
	public Dispositivo(){}
	public Dispositivo(Dispositivo c){}
	public abstract boolean ligar();
	public abstract boolean desligar();
	
	protected boolean power;
}
