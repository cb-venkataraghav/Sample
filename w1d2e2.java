import java.util.Scanner;

class w1d2e2{

		public static void  print_matrix(int mat[][]){

                	for(int i=0;i<3;i++){

                        	for(int j=0;j<3;j++) {
	
        	                        System.out.print(mat[i][j]+"\t");
				
				}
	
                	System.out.println();

               		 }
             
                }

		
		public static void  print_reverse_row(int mat[][]){

                        for(int i=0;i<3;i++){

                                for(int j=2;j>=0;j--) {

                                        System.out.print(mat[i][j]+"\t");

                                }

                        System.out.println();

                         }
             
                }


		public static void  print_reverse_col(int mat[][]){

                        for(int i=2;i>=0;i--){

                                for(int j=0;j<3;j++) {

                                        System.out.print(mat[i][j]+"\t");

                                }

                        System.out.println();

                         }
             
                }


	public static void main(String[] args){

		int[][]  arr = { {5,6,4},
				   {10,34,1},
				   {23,0,5}
				};		

		Scanner snr = new Scanner(System.in);		

		print_matrix(arr);
		
		int[][]  arr1 = new int[3][3];


		 int temp;

                 for(int i=0;i<3;i++)    //transpose the matrix
			for(int j =0;j<3;j++)
				arr1[i][j]=arr[j][i];
				
				


		System.out.println("Choose rotation: 1.Left 2.Right ");

	
		switch(snr.nextInt()){

		case 1:
		
		print_reverse_col(arr1);	

		break;

		case 2:

		print_reverse_row(arr1);

		break;

		default:

		}

		
		
	}

	


}
