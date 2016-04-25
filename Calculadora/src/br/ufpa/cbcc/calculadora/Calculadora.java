package br.ufpa.cbcc.calculadora;

public abstract class Calculadora extends Dispositivo implements Dividir, CalculoInf {
	public Calculadora(){
		this.memo = new Memoria();
		this.variavel_a = 0;
		this.variavel_b = 0;
		this.variavel_c = 0;
		this.alpha = new Ponto(0,0,0,0,0);
		this.gama = new Ponto(0,0,0,0,0);
		this.delta = new Ponto(0,0,0,0,0);
		this.lista = new Ponto[0];
		this.dim = 0;
	}
	public Calculadora(double a, double b, double c){
		this.memo = new Memoria();
		this.variavel_a = a;
		this.variavel_b = b;
		this.variavel_c = c;
		this.alpha = new Ponto(0,0,0,0,0);
		this.gama = new Ponto(0,0,0,0,0);
		this.delta = new Ponto(0,0,0,0,0);
		this.lista = new Ponto[0];
		this.dim = 0;
	}
	public Calculadora(Calculadora co){
		variavel_a = co.variavel_a;
	    variavel_b = co.variavel_b;
	    variavel_c = co.variavel_c;
		alpha = co.alpha;
		gama = co.gama;
		delta = co.delta;
		memo = co.memo;
		dim = co.dim;
		lista = new Ponto[dim];
		for(int i=0; i<dim; i++)
			lista[i] = co.lista[i];
	}
	public Calculadora(int dia, int mes, int ano){
		this.ligou = new Data(dia,mes,ano);
	}
	public void atribuir(Calculadora co){
		variavel_a = co.variavel_a;
	    variavel_b = co.variavel_b;
	    variavel_c = co.variavel_c;
		alpha = co.alpha;
		gama = co.gama;
		delta = co.delta;
		memo = co.memo;
		dim = co.dim;
		lista = new Ponto[dim];
		for(int i=0; i<dim; i++)
			lista[i] = co.lista[i];
	}
	public abstract void imprimir();
	public void imprimirPontos(){
		alpha.imprimir();
		gama.imprimir();
		delta.imprimir();
	}
	public void imprimirData(){
		ligou.print();
	}
	public void imprimirTudo(){
		imprimir();
		alpha.imprimir();
		gama.imprimir();
		delta.imprimir();
		for(int i=0; i<dim; i++)
			lista[i].imprimir();
		memo.imprimir();
	}
	public double somar(){
		return variavel_a+variavel_b+variavel_c;
	}
	public double multiplicar(){
		return variavel_a*variavel_b*variavel_c;
	}
	public double betar(){
		return beta*variavel_a*variavel_b*variavel_c;
	}
	public static double retorna_beta(){
		return beta;
	}
	public static void divertir(String meme){
		System.out.println('\n'+meme+easter_egg+'\n');
	}
	public void operarPontos(){ // verificar depois
		
	}
	public void guardarAntigos(){
		memo.memorizar(variavel_a, variavel_b, variavel_c);
	}
	public void adicionarPonto(Ponto pont){
		if(dim != 0)
		{
			Ponto[] aux = new Ponto[dim];

			for(int i = 0; i<dim; i++)
				aux[i] = lista[i];

			lista = new Ponto[++dim];

			for(int i = 0; i<dim-1; i++)
				lista[i] = aux[i];

			lista[dim-1] = pont;
		}
		else
		{
			lista = new Ponto[++dim];
			lista[0] = pont;
		}
	}
	public abstract void truncar();
	public int dividir(int numerador, int denominador)
	{
		return variavel_d = numerador/denominador;
	}
	
	public int calcRestoDivisao(int quociente, int divisor)
	{
		return variavel_d = quociente % divisor;
	}
	
	public abstract boolean ligar();
	public abstract boolean desligar();
	
	protected double variavel_a;
	protected double variavel_b;
	protected double variavel_c;
	protected int variavel_d;
	protected Ponto alpha;
	protected Ponto gama;
	protected Ponto delta;
	protected Ponto[] lista;
	protected Memoria memo;
	protected int dim;
	
	private static String easter_egg;
	private static double beta = 1.6646234298426847;
	private Data ligou;
}
