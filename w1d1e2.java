
public class w1d1e2 {

	public static void main(String[] args){
		
		int x,y,z;
	
		x=5; y=10;		

		z=add(x,y); // call the function 'add' to sum

		System.out.print("Sum: "+z); // print the sum value

	}
	
	public static int add(int x,int y){

		return x+y;  //add the two integer values and return to main

	}

}
