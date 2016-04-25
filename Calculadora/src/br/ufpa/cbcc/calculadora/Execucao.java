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
		
		vcalculadoras[2] = new Cientifica();
		vcalculadoras[2].ligar();
		System.out.print("Calculadora Financeira 1 está ligada.\n");
		
		{
		int i = 0;
		for(Calculadora calculadora: vcalculadoras) 
		{
			Scanner ler = new Scanner(System.in);
			System.out.println("\tCalculadora Científica " + i+1 + ":\n");
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
			
			System.out.println("\tCalculadora Financeira 1:\n");
			int nn;
			double p, ii;
			System.out.println("Digite o capital, taxa e o periodo para calcular os juros simples e compostos: ");
			p = ler.nextDouble();
			ii = ler.nextDouble();
			nn = ler.nextInt();
			((Financeira) calculadora).juros_simples(p,ii,nn);
			((Financeira) calculadora).juros_compostos(p,ii,nn);
			
			
			vcalculadoras[i].imprimir();
			System.out.println();
			i++;
		}}
		
		vcalculadoras[0].truncar();
		System.out.println("O valor truncado e:\n");
		vcalculadoras[0].imprimir();
		
		for(int i=0; i<n; i++)
	        vcalculadoras[0].desligar();
		
		System.out.println("\nAs Calculadoras desligaram.\n");
	}
}
