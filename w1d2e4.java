import java.util.Scanner;

import java.lang.Math;

public class w1d2e4{

	public static void main(String[] args){

		Scanner snr = new Scanner(System.in);

		double p,r,n,t;

		int choice;

		System.out.println("Choose option...\n1.Simple Interest\n2.Compound Interest\n");

		choice = snr.nextInt();
		
		System.out.println("Enter principal: ");

		p = snr.nextDouble();

		System.out.println("Enter rate of interest: ");

                r = snr.nextDouble()/100.0;

		System.out.println("Enter no of years: ");

                n = snr.nextDouble();

		switch (choice) {  //branching based on choice

		case 1:

		System.out.println("Simple Interest: "+ (p*n*r)/100.0); //formula for SI

		break;
		
		case 2:

		System.out.println("Enter the no. of times interest compounded per annum: ");

		t = snr.nextDouble();

		System.out.println("Compound Interest: "+ p * Math.pow( ( 1 + (r/t) ) ,( n*t ) ) ); //formula for CI

		break;

		default:

		System.out.println("Invalid selection...");

		}


	}


}

