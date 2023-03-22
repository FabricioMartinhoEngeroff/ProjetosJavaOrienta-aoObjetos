package projetoJavaObj6.Cambio.IOF;

import java.util.Locale;
import java.util.Scanner;



public class CotacaoDolar {


	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new  Scanner (System.in);
		
		System.out.printf("Qual o valor do dolar? " + Converter.dolar);
		
		
		System.out.println();
		System.out.print("Quantos dolar serão comprados? ");
		
		double buyDolar = sc.nextDouble();
		
		double c = Converter.valueReal(buyDolar);
		
		System.out.printf("Valor a ser pago em reais:" + c);
		
		
		sc.close();
	}

}
