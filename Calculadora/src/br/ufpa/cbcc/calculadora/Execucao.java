package br.ufpa.cbcc.calculadora;
import java.util.Scanner;

public class Execucao {
	public static void main(String[] args) {
		int n = 3;
		
		Calculadora vcalculadoras[] = new Calculadora[n];
		
		vcalculadoras[0] = new Cientifica();
		vcalculadoras[0].ligar();
		System.out.print("Calculadora Cientifica 1 está ligada.\n");
		
		vcalculadoras[1] = new Cientifica();
		vcalculadoras[1].ligar();
		System.out.print("Calculadora Cientifica 2 está ligada.\n");
		
		vcalculadoras[2] = new Financeira();
		vcalculadoras[2].ligar();
		System.out.print("Calculadora Financeira 1 está ligada.\n");
		
		for(Calculadora calculadora: vcalculadoras) 
		{
			if(calculadora instanceof Cientifica)
			{
				Scanner ler = new Scanner(System.in);
				System.out.println("\tCalculadora Científica" + ":\n");
				double temp;
				
				System.out.println("Digite um valor para calcular o seno: ");
				temp = ler.nextDouble();
				((Cientifica) calculadora).seno(temp);
				
				System.out.println("Digite um valor para calcular o cosseno: ");
				temp = ler.nextDouble();
				((Cientifica) calculadora).cosseno(temp);
				
				System.out.println("Digite um valor para calcular o tangente: ");
				temp = ler.nextDouble();
				((Cientifica) calculadora).tangente(temp);
			}
			
			if(calculadora instanceof Financeira)
			{
				Scanner ler = new Scanner(System.in);
				System.out.println("\tCalculadora Financeira:\n");
				int nn;
				double p, ii;
				System.out.println("Digite o capital, taxa e o periodo para calcular os juros simples e compostos: ");
				p = ler.nextDouble();
				ii = ler.nextDouble();
				nn = ler.nextInt();
				((Financeira) calculadora).juros_simples(p,ii,nn);
				((Financeira) calculadora).juros_compostos(p,ii,nn);
			}
			
			calculadora.imprimir();
			System.out.println();
		}
		
		vcalculadoras[0].truncar();
		System.out.println("Os valores truncados são(para a primeira calculadora científica):\n");
		vcalculadoras[0].imprimir();
		
		System.out.println();
		for(Calculadora calculadora: vcalculadoras)
	        calculadora.desligar();
		
		System.out.println("\nTodas as calculadoras desligaram.\n");
	}
}
