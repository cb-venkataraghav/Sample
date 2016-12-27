import java.util.*;

class hash_map_demo {

        HashMap< String, ArrayList<String> > hm = new HashMap< String,ArrayList<String> >();

	ArrayList<String> al_temp;

	String prefix;

        hash_map_demo(String[] words){

                for(String w : words){

			prefix = w.substring(0,3);

                        if(hm.containsKey(prefix)){
				
				al_temp = hm.get(prefix);

				al_temp.add(w);

				hm.put(prefix,al_temp);

			}

			else{
				ArrayList<String> al_new = new ArrayList<String>();
				
				al_new.add(w);
				
				hm.put(prefix,al_new);

			}

                }


        }

        String toDisplay(){

                String str="";

                for(String  prefix : hm.keySet()){

			al_temp = hm.get(prefix);

			 Collections.sort(al_temp);

			 str+="\n"+prefix+"-";

                         for(int i=0; i < al_temp.size(); i++)
		
				str+="\t"+al_temp.get(i);

		}

                return str;
        }
}

class w2d12e2{

        public static void main(String [] args){

                String words[] = {"predicate","prepare","prepone","perceive","perform"};

                hash_map_demo hmd = new hash_map_demo(words);

                System.out.println(hmd.toDisplay());

        }


}
