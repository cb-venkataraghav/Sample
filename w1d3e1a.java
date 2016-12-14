import animals.w1d3e1;
//import java.util.Scanner;
class w1d3e1a{
	public static void main(String[] args){
		char animal_habitat , consumer_type;
		String species_name;
		int choice=1;
		Scanner snr = new Scanner(System.in);
		while(choice == 1){
			System.out.println("Enter the species name: ");
                	species_name = snr.nextLine();
                	System.out.println("Enter the animal habitat(b/w/l): ");
                	animal_habitat = snr.next().charAt(0);
                	System.out.println("Enter the consumer type(c/h/o): ");
                	consumer_type  = snr.next().charAt(0);
			w1d3e1 a = new w1d3e1(species_name,consumer_type,animal_habitat);
			System.out.println("Animals created..."+a.no_of_animals);
			System.out.println("Press 1.To Add 2.Exit");
			choice = snr.nextInt();
			snr.nextLine();
			
		}
	}


}
