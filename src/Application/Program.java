package Application;

import java.util.Locale;
import java.util.Scanner;

import Entity.Account;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Account c;

		System.out.print("Enter account number: ");
		int numAccount = sc.nextInt();
		System.out.print("Enter account holder: ");
		sc.nextLine();
		String nameHolder = sc.nextLine();
		System.out.print("Is there na initial deposit (y/n)? ");
		char yesOrnot = sc.next().charAt(0);

		if (yesOrnot == 'y') {
			System.out.print("Enter initial deposit value: ");
			double initial = sc.nextDouble();
			c = new Account(numAccount, nameHolder, initial);
				System.out.print("Go out of bank? (y/n) ");
			char yesOrnot2 = sc.next().charAt(0);
				if (yesOrnot2 == 'y') {
					System.exit(0);
			}

		} else {
			c = new Account(numAccount, nameHolder);
				System.out.print("Go out of bank? (y/n) ");
			char yesOrnot3 = sc.next().charAt(0);
					if (yesOrnot3 == 'y') {
						System.exit(0);
			}
		}

		System.out.println();
		System.out.println("Account data:");
		System.out.printf(c.toString());

		System.out.println();
		System.out.print("Enter a deposit value: ");
		double deposit = sc.nextDouble();
		c.makeDeposit(deposit);
		System.out.println();
		System.out.println("Updated data:");
		System.out.println(c.toString());

		System.out.println();
		System.out.print("Enter a withdraw value: ");
		double bankDrafts = sc.nextDouble();
		c.withdraw(bankDrafts);

		System.out.println();
		System.out.println("Updated data:");
		System.out.printf(c.toString());
		System.out.println();

		sc.close();
	}

}
