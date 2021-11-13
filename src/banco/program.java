package banco;

import java.util.Locale;
import java.util.Scanner;

import dados.Pessoal;

public class program {

	public static void main(String[] args) {
	
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		Pessoal pessoal;
		
		
		System.out.print("Enter account number: ");
		int number = sc.nextInt();
		System.out.print("Enter account holder: ");
		sc.nextLine();
		String holder = sc.nextLine();
		System.out.print(" Is there an initial deposit (y/n)? ");
		char response = sc.next().charAt(0);
		if (response == 'y') {
			 System.out.print("Enter initial deposit value: ");
			 double initialDeposit = sc.nextDouble();	
			 pessoal = new Pessoal (number, holder, initialDeposit);
		}
		else {
			pessoal = new Pessoal (number , holder);
		}
		
		System.out.println();
		System.out.println("Account data: ");
		System.out.println(pessoal);
		
		System.out.println();
		System.out.print("Enter a deposit value: ");
		double depositvalue = sc.nextDouble();
		pessoal.deposit(depositvalue);
		System.out.println("Updated account data: ");
		System.out.println("Account");
		
		System.out.println();
		System.out.print("Enter a withdraw value: ");
		double withdrawValue = sc.nextDouble();
		pessoal.whithdraw(withdrawValue);
		System.out.println("Updated account data:");
		System.out.println(pessoal);
		
		
		sc.close();
		
	}

}
