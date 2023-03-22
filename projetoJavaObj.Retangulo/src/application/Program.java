package application;

import java.util.Locale;
import java.util.Scanner;

import entities.MedidaRectangle;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault ( Locale.US);
		Scanner sc = new  Scanner (System.in);
		
		MedidaRectangle rect = new MedidaRectangle();
		
		System.out.println("Entre com a largura a altura do retangulo:");
		rect.width = sc.nextDouble();
		rect.height = sc.nextDouble();
		
		System.out.printf("AREA = %.2f%n", rect.area());
		System.out.printf("PERIMETRO = %.2f%n", rect.perimeter());
		System.out.printf("DIAGONAL = %.2f%n", rect.diagonal());
		
		sc.close();

	}

}
