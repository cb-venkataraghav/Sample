
import java.util.*;
class Employee{
	
	String name;
	int salary,age;
	
	Employee(String n,int a, int s){

		name = n ;
		salary = s;
		age = a;
	}

	String getName(){

		return name;

	}

	int getAge(){

		return age;
	}

	int getSalary(){


		return salary;
	}
	
	public String toString() {
 
		   return String.format("(%s, %d, %d)", name, salary, age);
	}
}

class w1d5e2{
	public static void main(String[] args){

		Employee[] e = new Employee[3];
		
		e[0] = new Employee("DEV",24000,23);

		e[1] = new Employee("ABC",4000,19);

		e[2] = new Employee("ZIG",14560,22);

		Scanner snr = new Scanner(System.in);

		System.out.println("Sort by...1.Name 2.Salary 3.Age");

		switch(snr.nextInt()){

			case 1:
			
			Arrays.sort(e,new Comparator<Employee>() {

				public int compare(Employee e1 , Employee e2){

					return e1.getName().compareTo(e2.getName());
				}

			});

			break;
	
			case 2:

                        Arrays.sort(e,new Comparator<Employee>() {

                                public int compare(Employee e1 , Employee e2){

                                        return e1.getSalary() - e2.getSalary();
                                }

                        });

                        break;

			case 3:

                        Arrays.sort(e,new Comparator<Employee>() {

                                public int compare(Employee e1 , Employee e2){

                                        return e1.getAge() - e2.getAge();
                                }

                        });

                        break;

			default:
		}

		System.out.println(Arrays.toString(e));

	}



}
