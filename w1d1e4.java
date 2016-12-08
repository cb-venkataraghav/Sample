public class w1d1e4{

	public static void main(String[] args){

		int x,y,temp_prod,power;
	
		x=5; y=130; temp_prod=1; power=0; //initialise the values

		while(temp_prod  <= y){ //loop until the product is less than or equal to the 'y'

			temp_prod*=x;

			power++; //increment power variable
		}

		System.out.print(power-1); //print the value

	}
} 
