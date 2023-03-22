package application;

import java.util.Locale; 
import java.util.Scanner;

import entities.Product;


public class Program {


	public static void main(String[] args) {
		Locale.setDefault ( Locale.US);
		Scanner sc = new  Scanner (System.in);
		
		System.out.print("Entre com o id do produto: ");
		int id = sc.nextInt();
		System.out.print("Entre com o nome do produto: ");
		sc.nextLine();
		String name = sc.nextLine();
		System.out.print("Preço: ");
		double price = sc.nextDouble();
		if (price < 1) {
			System.out.println("Nao entra no estoque pois nao tem preço");
		}else if (price > 1) {
		System.out.print("Quantidade de produto no estoque: " );
		}
		double quantity = sc.nextDouble();
	    System.out.println();
	    Product product = new Product(id, name, price, quantity);

		System.out.println("Dados de produto " + product);
		
		System.out.println();
		System.out.print("Entre com o numero de produtos para adiciona e atualiza o estoque: ");
		quantity = sc.nextInt();
		product.updateStock(quantity);
		System.out.println();
		System.out.println("Atualizar dados: " + product);
		
		System.out.println();
		System.out.print("Entre com o numreo de produtos para remover e atualiza o estoque: ");
		quantity = sc.nextInt();
		product.removeStock(quantity);
		
		System.out.println();
		System.out.println("Atualizar dados: " + product);

		
		sc.close();
	}

}
