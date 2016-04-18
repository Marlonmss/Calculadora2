package br.ufpa.cbcc.calculadora;

public class Cientifica extends Calculadora{
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
