import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;

class w2d34e4 {
    public static void main(String[] args) throws IOException {


        Scanner s = new Scanner(System.in);

	String word = s.next();

	 s  =  new Scanner (new BufferedReader(new FileReader("r.txt") ) );

	String main_str = "";

  	int line_no =0 , word_index;    


        while (s.hasNextLine()) {

		line_no++;

		

		StringTokenizer st = new StringTokenizer(s.nextLine());

		

		word_index = 0;

		String loc = "";		


		while(st.hasMoreTokens()){


			word_index++;

			if(st.nextToken().equals(word))

				loc += word_index+" ";



		}

		if(!loc.isEmpty()){

			main_str+= "\n"+line_no+":"+loc;
		}

       	}	

                s.close();

	

         FileWriter out = new FileWriter(word+".locations");

         out.write(main_str);

         s.close();
	
	  out.close();

         }

      }


