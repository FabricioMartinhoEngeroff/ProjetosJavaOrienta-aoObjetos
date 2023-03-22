package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault ( Locale.US);
		Scanner sc = new  Scanner (System.in);
		
		int n;
		double soma;
		double media;
		
		System.out.print("Quantos numeros voce quer soma e faze a media? ");
		n = sc.nextInt();
		
		int[] vetor = new int[n];
		
		for (int i=0; i<n; i++) {
			System.out.print("Digite um numero: ");
			vetor[i] = sc.nextInt();
		}
		
		 soma = 0;
	    for (int i=0; i<n; i++) {
	        soma = soma + vetor[i];
	    }
	    
	    media = soma / n;
	    
	    System.out.printf("Valores =");
		
		 for (int i=0; i<n; i++) {
		    	System.out.printf("%d\n ", vetor[i]);
		    }

		    System.out.printf("\nSOMA = %.2f\n", soma);
		    System.out.printf("MEDIA = %.2f\n", media);
		
		sc.close();
	}

}
