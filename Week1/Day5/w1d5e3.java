import java.util.*;

class Factorial{

	int lowerLimit, upperLimit;
	Factorial(int l ,int u){

		lowerLimit = l; 
		upperLimit = u;
	}

	interface Iterator{

                void  iterator();

                String toString();
        }
	
	class inner implements Iterator{

			String str ="";
	
			public void  iterator(){
				
				int val = 1 , x =1;
		
				while(x < lowerLimit){
			
					val *= x;

					x++;
				}				

				while(x < upperLimit){
				
					val  *= x;

					str += val+", ";

					x++;

				}
				
				str += val*x;

		
			}

			public String toString(){

				return str;

			} 

	}
}

class w1d5e3{

	public static void main(String[] args){

		int u,l;

		Scanner snr =new Scanner(System.in);

		l=snr.nextInt();
	
		u=snr.nextInt();

		Factorial f = new Factorial(l,u);

		Factorial.inner innerObj = f.new inner();

		innerObj.iterator();

		System.out.println(innerObj.toString()); 
		

	}


}
