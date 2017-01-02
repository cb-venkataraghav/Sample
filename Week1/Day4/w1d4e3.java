import java.util.ArrayList;
class Person{

	protected String name,contact;
	protected int  age; 
	Person(String n, String c, int a){
	
		name = n;
		contact = c;
		age = a;
	}

	String toDisplay(){

		return name+"|"+age+"|"+contact;

	}

}

class Employee extends Person{

	int empid;

	Employee(String n, String c, int a, int eid){

		super(n,c,a);
		
		empid = eid;
	}

	String toDisplay(){

		return super.toDisplay()+"|"+empid;

	}
}

class Customer extends Person{

        

        Customer(String n, String c, int a){

                super(n,c,a);
                
        }

	Customer(Employee e){

                super(e.name,e.contact,e.age);

        }

        String toDisplay(){

                return super.toDisplay();

        }
}

class Vehicle{
	
	String brand, color, service;
	char  vehicle_type;				// a for car ; b for bike ; c for bus
	
	Vehicle(String b, String c, String s, char vt){

		brand =b;
		color= c;
		service = s;
		vehicle_type=vt;


	}

	float getServiceCharge(){

		switch(vehicle_type){

			case 'a':  
			return 150;
			

			case 'b':
			return 85;
			


			case 'c':
			return 400;
			

			default:
			return -1;
		}


	}
	
	String toDisplay(){

                return "\n"+brand+"|"+color+"|"+service+"|"+vehicle_type+"|"+getServiceCharge();

        }
}

class Invoice{

	Customer c;
	Employee e;
	Vehicle v; 
	float amount_total;
	
	Invoice(Customer cu, Employee em, Vehicle ve){

		c =cu;
		e =em;
		v = ve;

	
	}
	float	getTotalAmt(){
			
			amount_total = v.getServiceCharge();

		
		return amount_total;
	}

	String toDisplay(){

		String temp="\n---------------------------\n";

		temp += "Customer: "+c.name+"\n";

		temp += "Employee: "+e.name+"\n";

		temp+= "Vehicle"+v.toDisplay();	
		

		temp+="\nTotal amt: "+getTotalAmt();

		temp+="\n-----------------------------";

		return temp;
	}
	

}

class ServiceStation{

	String name, address, contact;

	ArrayList<Employee> e = new ArrayList<Employee>();

	ArrayList<Customer> c = new ArrayList<Customer>();

	ArrayList<Vehicle> v = new ArrayList<Vehicle>();

	ArrayList<Invoice> i = new ArrayList<Invoice>();

	ServiceStation(String n, String a, String c){

		name = n;
		address = a;
		contact =c;
	}

	void addEmployee(Employee em){

		e.add(em);
	}

	void addCustomer(Customer cu){

                c.add(cu);
        }
	
	void addVehicle(Vehicle ve){

                v.add(ve);
        }
	
	void addInvoice(Invoice in){

                i.add(in);
		
        }

	void vehicle_charges(){

		for(Vehicle ve : v){

			System.out.println(ve.toDisplay());
		}
	}

	void displayInvoice(){

		 for(Invoice in : i){

                        System.out.print(in.toDisplay());
                }

	}

}

class w1d4e3{
	public static void main(String[] args){

	ServiceStation ss = new ServiceStation("SSN","123,wert","123456789");

	Employee e = new Employee("adam","1234",21,123);

	ss.addEmployee(e);

	Customer c = new Customer("bob","1114",45);

        ss.addCustomer(c);

	Vehicle v = new Vehicle("Hyundai","Red","Full Service",'a');

        ss.addVehicle(v);

	Invoice i = new Invoice(c,e,v);

	ss.addInvoice(i);

	e = new Employee("alice","567",34,124);

        ss.addEmployee(e);

        c = new Customer(e);

        ss.addCustomer(c);

        
        v = new Vehicle("MarcoPolo","Green","Wash",'c');

        ss.addVehicle(v);

	v = new Vehicle("Pulsar","White","Wash",'b');

	ss.addVehicle(v);

	i = new Invoice(c,e,v);

	ss.addInvoice(i);

	System.out.println("Vehicles details and their charges...\n");
	ss.vehicle_charges();

	System.out.println("\nInvoices.....");
	ss.displayInvoice();
	
	}


}
