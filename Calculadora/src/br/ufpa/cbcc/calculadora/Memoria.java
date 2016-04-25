package br.ufpa.cbcc.calculadora;

public class Memoria {
	public Memoria(){
		this.reg1 = 0;
		this.reg2 = 0;
		this.reg3 = 0;
	}
	public void memorizar(double a, double b, double c){
		this.reg1 = a;
		this.reg2 = b;
		this.reg3 = c;
	}
	public void imprimir(){
		System.out.println("Memo 1: " + reg1 + "\nMemo 2: " + reg2 + "\nMemo 3: " + reg3);
	}
	public void atribuir(Memoria co){
		reg1 = co.reg1;
		reg2 = co.reg2;
		reg3 = co.reg3;
	}

	private double reg1;
	private double reg2;
	private double reg3;
}
