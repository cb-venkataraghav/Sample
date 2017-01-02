import java.util.Scanner;

class Student{
	
	int sid;
	String sname;
	boolean gender;
	Subject sub;
	Scanner snr = new Scanner(System.in);

	void get(){  //user input for the student details
         
	        System.out.println("Enter the student id: ");
                sid = snr.nextInt();
		snr.nextLine();
                System.out.println("Enter the name: ");
                sname = snr.nextLine();
                System.out.println("Enter the gender(true/false):  ");
                gender = snr.nextBoolean();
		set();
      	}

	void set(){  

		sub = new Subject();
		sub.get();
		
	}
}

class Subject{

	Scanner snr = new Scanner(System.in);
	String sub1,sub2,sub3;
	float m1,m2,m3;
	void get(){  //user input for subjects

		System.out.println("Enter the subject1 name: ");
		sub1 = snr.nextLine();
		System.out.println("Enter the mark1: ");
                m1 = snr.nextFloat();
		snr.nextLine();
		System.out.println("Enter the subject2 name: ");
                sub2 = snr.nextLine();
                System.out.println("Enter the mark2: ");
                m2 = snr.nextFloat();
		snr.nextLine();
		System.out.println("Enter the subject3 name: ");
                sub3 = snr.nextLine();
                System.out.println("Enter the mark3: ");
                m3 = snr.nextFloat();


	}
}

class ResultGenerator{

	static float tot;
	static void testResults(Student s){ //calculate the results
		tot = s.sub.m1 + s.sub.m2 + s.sub.m3;
		System.out.println("Total Marks: "+tot);
		System.out.println("Average Marks: "+tot/3);
	}
}
public class w1d3e2{

  	Scanner snr = new Scanner(System.in);
	


	public static void main(String[] args){

	
		Student st = new Student();
		w1d3e2 w = new w1d3e2();
	      	st = w.storeStudentData(st);
		ResultGenerator rg = new ResultGenerator();
		rg.testResults(st);

	}
	
	Student storeStudentData(Student st){
	
		st.get();
	
		return st;

	}	

}

