import java.lang.Math;
public class w1d2e1 {
	public static void main(String[] args){

		int threshold;

		threshold = 7;  //initialize the value till which the pattern is to be printed

		for(int row = 0 ; row < threshold ; row ++){

			for(int col = 0 ; col < (threshold*2) ; col++){ 

				if( Math.abs( threshold  - col - 1 ) <= row )  

					System.out.print(row+1-Math.abs( threshold - 1  - col)+"\t");

				
				
				else
				
					System.out.print("\t");

				
			}
			
			System.out.println();
		}

	}


}
