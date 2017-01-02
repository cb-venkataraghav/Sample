import java.util.*;

class Contact{

	String name,add,mob,home,work;

	Contact(String n, String a, String m, String h, String w){  //parameterized constructor

		name = n;
		add = a;
		mob = m;
		home = h;
		work = w;	


	}

	String toDisplay(){

		String str="\n";

		str+="Name: "+name+"\t"+"Address: "+add+"\t";

		if(!mob.isEmpty()){

			str+="Mobile: "+mob+"\t";
		}

		if(!home.isEmpty()){

                        str+="Home: "+home+"\t";
                } 

		if(!work.isEmpty()){

                        str+="Work: "+work+"\t";
                } 

		return str;
	}

}

class w2d12e3{

	public static void main(String[] args){

		String contacts[][]={ {"Venkat","xyz","123","456","789"},
				      {"barani","ase","456","",""},
				      {"Venky","as","","567","789"},
				      {"Venkat","wer","","","111"}

		};

	

		Scanner snr = new Scanner(System.in);

		ArrayList<Contact> ph_directory = new ArrayList<Contact>();


		for(String[] c : contacts){

			Contact con = new Contact(c[0],c[1],c[2],c[3],c[4]);  //call constructor
	
			ph_directory.add(con);         //add to the array list
		}

		System.out.println("Search by 1.Name 2.Number");

		String test_word;

		switch(snr.nextInt()){

			case 1:

			snr.nextLine();

			System.out.println("Enter phrase or full name: ");
			
			test_word = snr.nextLine();
			
			String contact_name;

			for(int i=0 ; i < ph_directory.size(); i++){   

				contact_name = ph_directory.get(i).name;

				if ( contact_name.toLowerCase().contains(test_word.toLowerCase()) ){

						System.out.println(ph_directory.get(i).toDisplay());
				}
			}
		
			break;

			case 2:

			snr.nextLine();

			System.out.println("Enter number: ");

                        test_word = snr.nextLine();

			Contact contactObj;

                        for(int i = 0;  i < ph_directory.size()  ; i++){

                              	 contactObj = ph_directory.get(i);

				 if ( ( contactObj.mob.contains(test_word) ) || ( contactObj.work.contains(test_word) ) || ( contactObj.home.contains(test_word) ) ){

					System.out.println(ph_directory.get(i).toDisplay());
			}
                        }

			break;


		}

	}






}


