package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Legal;
import entities.Physical;
import entities.TaxPayer;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<TaxPayer> list = new ArrayList<>();
		
		System.out.print("Enter the number of tax payers: ");
		int n = sc.nextInt();
		
		for(int i=1; i <= n; i++) {
			System.out.println("Tax Payer #" + i + " data: ");
			System.out.print("Physical or Legal (p/l): ");
			char esc = sc.next().charAt(0);
			System.out.print("Name: ");
			String name = sc.next();
			System.out.print("Anual income: ");
			double annualIncome = sc.nextDouble();
			
			if(esc == 'p') {
				System.out.print("Health expenditures: ");
				double healthExpense = sc.nextDouble();				
				list.add(new Physical(name, annualIncome, healthExpense));
			}else {
				System.out.print("Number of employee: ");
				int employeeNumber = sc.nextInt();
				list.add(new Legal(name, annualIncome, employeeNumber));
			}
			
		}
		
		System.out.println();
		System.out.println("Taxes Paid: ");
		double sum = 0.0;
		
		for(TaxPayer l: list) {
			System.out.println(l.getName() + ": $ " + String.format("%.2f", l.tax()));
			sum += l.tax();
		}
		
		System.out.println("Total Taxes: $ " + String.format("%.2f", sum));
		sc.close();
	}

}
