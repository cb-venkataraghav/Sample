import java.util.Scanner;

public class w1d2e3{

	public static void main(String[]args){


		Scanner snr = new Scanner(System.in);

		int sum = 0;

		System.out.print("Enter the word: ");
		
		String word = snr.nextLine();

		for(int index = 0; index < word.length() ; index++) // for each letter

			sum+=Character.getNumericValue( word.charAt(index) ) - 9; //find the value of the letter and sum it up

		if(sum%2 == 0) //print based on the condition
			
			System.out.print("Even");

		else
		
			System.out.print("Odd");

	}





}
