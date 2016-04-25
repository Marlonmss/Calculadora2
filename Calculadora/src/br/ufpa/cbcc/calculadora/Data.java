package br.ufpa.cbcc.calculadora;

public class Data {
	public Data(int dia, int mes, int ano){
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}
	public void print(){
		System.out.print(this.dia + '/' + this.mes + '/' + this.ano + '\n' );
	}
	
	private int dia;
	private int mes;
	private int ano;
}
