package br.ufpa.cbcc.calculadora;

public class Ponto {
	public Ponto(){
		this.x = 0;
		this.y = 0;
		this.z = 0;
		this.t = 0;
		this.u = 0;
	}
	public Ponto(double x, double y, double z, double t, double u){
		this.x = x;
		this.y = y;
		this.z = z;
		this.t = t;
		this.u = u;
	}
	public Ponto(Ponto B){
		this.x = B.x;
		this.y = B.y;
		this.z = B.z;
		this.t = B.t;
		this.u = B.u;
	}

	public double calcModulo(){
		return Math.sqrt(x*x+y*y+z*z+t*t+u*u);
	}
	public void imprimir(){
		System.out.print('(' + x + ',' + y + ',' + z + ',' + t + ',' + u + ')' + '\n');
	}

	public Ponto somarPontos(Ponto B){
		return new Ponto(x+B.x,y+B.y,z+B.z,t+B.t,u+B.u);
	}
	public Ponto somarPontos(double n){
		return new Ponto(x+n,y+n,z+n,t+n,u+n);
	}
	public Ponto subtrairPontos(Ponto B){
		return new Ponto(x-B.x,y-B.y,z-B.z,t-B.t,u-B.u);
	}
	public Ponto subtrairPontos(double n){
		return new Ponto(x-n,y-n,z-n,t-n,u-n);
	}
	public Ponto multiplicarPontos(Ponto B){
		return new Ponto(x*B.x,y*B.y,z*B.z,t*B.t,u*B.u);
	}
	public Ponto multiplicarPontos(double n){
		return new Ponto(x*n,y*n,z*n,t*n,u*n);
	}
	public Ponto dividirPontos(Ponto B){
		Ponto b = new Ponto();
		try
		{
			b.x = x/B.x;
			b.y = y/B.y;
			b.z = z/B.z;
			b.t = t/B.t;
			b.u = u/B.u;
		}
		catch(ArithmeticException e)
		{
			System.out.println ("Erro: um n�mero n�o pode ser dividido por zero.");
		}
		return b;
	}
	public Ponto dividirPontos(double n){
		Ponto b = new Ponto();
		try
		{
			b.x = x/n;
			b.y = y/n;
			b.z = z/n;
			b.t = t/n;
			b.u = u/n;
		}
		catch(ArithmeticException e)
		{
			System.out.println ("Erro: um n�mero n�o pode ser dividido por zero.");
		}
		return b;
	}
	public boolean verificarIgualdade(Ponto B){
		if(x==B.x && y==B.y && z==B.z && t==B.t && u==B.u)
	        return true;
	    return false;
	}
	public void atribuir(Ponto B){
		this.x = B.x;
		this.y = B.y;
		this.z = B.z;
		this.t = B.t;
		this.u = B.u;
	}
	
	private double x;
	private double y;
	private double z;
	private double t;
	private double u;
}
