package br.ufpa.cbcc.calculadora;

public abstract class Dispositivo {
	public Dispositivo(){
		power = false;
	}
	public Dispositivo(Dispositivo c){
		power = c.power;
	}
	public abstract boolean ligar();
	public abstract boolean desligar();
	
	protected boolean power;
}