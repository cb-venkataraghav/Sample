import java.util.Scanner;

public class w1d2e5{

	public static void main(String[] args){

		int f1 =0  , f2=1 , f3 ,n;

		Scanner snr = new Scanner(System.in);

		System.out.println("No. of fibonacci numbers: ");

		n = snr.nextInt();

		System.out.println(f1+"\t"+f2+"\t"); //print first two numbers

		n-=2;
		
		do {          

			f3=f1+f2;  //add previous two numbers
		
			f1=f2; //assign the next numbers 

			f2=f3;

			System.out.print(f3+"\t"); //print the number

		

		}while(--n!=0);



	}


}
