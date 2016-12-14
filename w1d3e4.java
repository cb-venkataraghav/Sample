import java.util.*;

class TaxCalculator{

	static double tax=0;

	static double tax_percentage;	

	static double calculate(Employee e){

		tax_percentage = ( e.gender=='m' ) ? 12 : 8; //percentage depending upon the gender

		tax = e.income * (tax_percentage/100.0);

		return tax;
		
	}



}

class Employee{
	
	String name;
	char gender;
	double income;

	Employee(String ename, char egender , double eincome){ 					//parameterized constructor

		name = ename;
	
		gender = egender;

		income = eincome;
	}
	
	String getName(){

		return name;
	
	}

	char getGender(){

		return gender;
	}

	double getIncome(){

		return income;
	}

	String toDisplay(){
		
	//	TaxCalculator tc = new TaxCalculator();

		return getName()+"|"+getGender()+"|"+getIncome()+"|"+TaxCalculator.calculate(this);
	}
}

class w1d3e4{

	public static void main(String[] args){

		ArrayList<Employee> emp_al = new ArrayList<Employee>();

		Employee e_obj;

		int choice=1;

		String ename;

		char egender;
	
		double eincome;

		Scanner snr = new Scanner(System.in);
		
		while(choice == 1){

			System.out.println("Enter employee name: ");
			
			ename=snr.nextLine();

			System.out.println("Enter gender: ");

			egender = snr.nextLine().charAt(0);

			System.out.println("Enter income: ");

			eincome = snr.nextDouble();

			e_obj = new Employee(ename,egender,eincome);			//instantiate an object with the values

			emp_al.add(e_obj);						//add to the array list
			
			System.out.println("Press 1.Add employee 2.Exit");

			choice=snr.nextInt();	
			
			snr.nextLine();

		}

		for(Employee e : emp_al){						//display all the objects
			
			System.out.println(e.toDisplay());
		}
		
	}


}
