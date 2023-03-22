package application;

import java.util.Scanner;

import exceptions.BusinessException;
import model.entities.Account;

public class Program {

	public static void main(String[] args) {
        
         Scanner sc = new Scanner(System.in);
		
		System.out.println("entre com acount data:");
		System.out.print("Number :");
		int number = sc.nextInt();
		System.out.print("Titular: ");
		sc.nextLine();
		String holder = sc.nextLine();
		System.out.print("Saldo inicial :");
		double balance = sc.nextDouble();
		System.out.print("Limite de saque: ");
		double withdrawLimit = sc.nextDouble();
		
		Account acc = new Account(number, holder ,balance, withdrawLimit);

		System.out.println();
		System.out.print("Enter amount for withdraw: ");
		double amount = sc.nextDouble();
		
		try {
			acc.withdraw(amount);
			System.out.printf("New balance: %.2f%n", acc.getBalance());
		}
		catch (BusinessException e) {
			System.out.println(e.getMessage());
		}
		
		
		sc.close();
	}

}
