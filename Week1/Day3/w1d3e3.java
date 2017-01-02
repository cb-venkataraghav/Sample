import java.util.*;

class Author{

	String name,email;
	char gender;
	Author(String n,char g,String e){
		name=n;
		email=e;
		gender=g;
	}

	public String getName(){

		return name;
	}

	public String getEmail(){
	
		return email;
	}

	public char getGender(){

		return gender;
	}
	
	public void setEmail(String e){

		email = e;
	
	}
	
	public String toDisplay(){

		return (getName()+"("+getGender()+") at "+getEmail());	

	}
/*	void main(){

		

		System.out.println(toDisplay());

		System.out.println("Enter new Email: ");

		setEmail(snr.nextLine());

		System.out.println(toDisplay);
		
	}*/
}

class w1d3e3{

	static	ArrayList<Author> auth = new ArrayList<Author>();

	

	String name;
	
	double price;

	int qtyInStock =0;

	w1d3e3(String n, double p,int q,ArrayList<Author> au){

		name =n;

		price = p;

		qtyInStock = q;

		auth = au;
	}

	public String getName(){

                return name;
        }

        public double  getPrice(){

                return price;
        }

        public ArrayList<Author>  getAuthors(){

                return auth;
        }
        
        public int getQtyInStock(){

                return qtyInStock;
        
        }

	public void setQtyInStock(int temp){

                qtyInStock = temp;

        }

	public void setPrice(double temp){

                price = temp;

        }

	public String toDisplay(){

                String temp="";

		temp+=getName()+" by ";
  
  		for(Author a: auth){  
   
			temp+= a.toDisplay()+", ";
			
			 
  		} 

		temp+=" Price: "+getPrice();

		temp+=" No of books avl: "+getQtyInStock();

		return temp;

        }

	public static void main(String[] args){

		Author a = new Author("Chetan Bhagat",'m',"cb@yahoo.com");
		auth.add(a);
		a = new Author("Adams",'m',"adam@gmail.com");
		auth.add(a);
		w1d3e3 w = new w1d3e3("Half Girlfriend",250.0,10,auth);
		System.out.println(w.toDisplay());
		auth.clear();
		a = new Author("Eve",'f',"eve@gmail.com");
                auth.add(a);
                w = new w1d3e3("Cindrella",150.0,5,auth);
		System.out.println(w.toDisplay());
		
	}






}
