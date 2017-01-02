import java.util.Scanner;

public class w1d2e6 {

	public static void main(String[] args){

		Scanner snr = new Scanner(System.in);

		int[] arr = new int[5];

		int max,min;

		System.out.println("Enter the numbers: ");

		max = Integer.MIN_VALUE;

		min = Integer.MAX_VALUE;

		for(int i=0 ; i < 5 ;i++){

			arr[i]=snr.nextInt();
		
			if(max<arr[i])
		
				max = arr[i];

			if(min>arr[i])	
			
				min = arr[i];

		}


		System.out.println("Max: "+max+" Min:"+min);
	}



}
