package br.ufpa.cbcc.calculadora;

public class Cientifica extends Calculadora{
	public Cientifica(){
		this.valor_seno = 0;
		this.valor_cosseno = 0;
		this.valor_tangente = 0;
		this.variavel_a = 0;
		this.variavel_b = 0;
		this.variavel_c = 0;
		this.alpha = new Ponto(0,0,0,0,0);
		this.gama = new Ponto(0,0,0,0,0);
		this.delta = new Ponto(0,0,0,0,0);
		this.lista = new Ponto[0];
		this.dim = 0;
	}
	public Cientifica(Cientifica c){
		valor_seno = c.valor_seno;
	    valor_cosseno = c.valor_cosseno;
	    valor_tangente = c.valor_tangente;
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
	public double seno(double teta){
		return valor_seno = Math.sin(teta);
	}
	public double cosseno(double teta){
		return valor_cosseno = Math.cos(teta);
	}
	public double tangente(double teta){
		return valor_tangente = Math.tan(teta);
	}
	public void atribuir(Cientifica c){
		valor_seno = c.valor_seno;
	    valor_cosseno = c.valor_cosseno;
	    valor_tangente = c.valor_tangente;
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
		System.out.print("Valor do seno: " + valor_seno + "\nValor do cosseno: " + valor_cosseno + "\nValor da tangente: " + valor_tangente);
	}
	public void truncar(){
		valor_seno = (int) valor_seno;
		valor_cosseno = (int) valor_cosseno;
		valor_tangente = (int) valor_tangente;
	}
	public boolean ligar(){
		System.out.println("A calculadora científica está ligada.");
		power = true;
		return power;
	}
	public boolean desligar(){
		System.out.println("A calculadora científica está desligada.");
		power = false;
		return power;
	}
	public double dividir(double numerador, double denominador)
	{
		dividendo = numerador/denominador;
		return dividendo;
	}
	public int calcRestoDivisao(int quociente, int divisor)
	{
		resto = quociente % divisor;
		return resto;
	}
	public double derivada(double const_a, double const_b, double const_c, double ponto_x)
	{
		double h = 0.0001;
		double fth = const_a*(ponto_x+h)*(ponto_x+h) + const_b*(ponto_x+h) + const_c;
		double ftmh = const_a*(ponto_x-h)*(ponto_x-h) + const_b*(ponto_x-h) + const_c;
		return (fth-ftmh)/(2*h);
	}
	public double integral(double const_a, double const_b, double const_c, int a, int b, int n)
	{
		double dx, t=0;
		dx = (double) (b-a)/n;
		double[] fx = new double[n+1];
		for(int i=0;i<=n;i++)
		{
	        if (i == 0){
	            t = a;
	        }
	        else if (i == n){
	            t = b;
	        }
	        else{
	            t = a+(i*dx);
	        }
	        
	        fx[i] = 1/(1+t*t);
	    }
		
		double sum = 0, area = 0;
		for (int i=0;i<=n;i++)
		{
	        if (i == 0 || i == n){
	            sum = sum + fx[i];
	        }
	        else if( i%2 == 0){
	            sum = sum + 2*fx[i];
	        }
	        else {
	            sum = sum + 4*fx[i];
	        }
	    }
		area = (dx/3)*sum;
		return area;
	}
    
	private double valor_seno;
	private double valor_cosseno;
	private double valor_tangente;
	private double dividendo;
	private int resto;
	private boolean power;
}
