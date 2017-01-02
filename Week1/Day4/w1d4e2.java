
class car{
	int speed;
	double rp;
	String color;
	car(int s,double r,String c){
 		speed=s;
 		rp=r;
 		color=c;
	}

	public  double getsaleprice(){

		return rp;
	}	

	public String toDisplay(){

	return speed+"|"+rp+"|"+color;
	}
}

class truck extends car{

	int weight;
	truck(int w,int s,double r,String c)
	{

 	super(s,r,c);	
 	weight=w;
	}
	public double getsaleprice()
		{
 		  return weight>2000? (0.9*rp) : (0.8*rp) ;
 	
		}
	public String toDisplay(){

		return super.toDisplay()+"|"+weight;
	}

}

class ford extends car{
	int yr;
	int md;
	ford(int y,int m,int s,double r,String c)
 	{
 	super(s,r,c);
  	yr=y;
  	md=m;
 
	 }

	public double getsaleprice()
	{
 	return rp-md;
	}	 

	public String toDisplay(){

                return super.toDisplay()+"|"+yr+"|"+md;
        }
}

class sedan extends car{
	int length;
	sedan(int l,int s,double r,String c)
	{
 	super(s,r,c);
 	length=l;
 
	}
 	public double getsaleprice(){
		
		return length>20 ? (0.95*rp) : (0.90*rp) ;
	}	

	public String toDisplay(){

                return super.toDisplay()+"|"+length;
        }
}

class w1d4e2{
	
	public static void main(String  args[]){
 		sedan s=new sedan(123,100,3400,"white");
 		ford f1=new ford(1996,500,200,3000,"yellow");
 		ford f2=new ford(1995,650,300,1400,"green");
 		car c=new car(200,3000,"red");
 		System.out.println(s.toDisplay()+"|"+s.getsaleprice());
 		System.out.println(f1.toDisplay()+"|"+f1.getsaleprice());
 		System.out.println(f2.toDisplay()+"|"+f2.getsaleprice());
 		System.out.println(c.toDisplay()+"|"+c.getsaleprice());

	}

}
