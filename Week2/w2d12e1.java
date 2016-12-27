import java.util.*;

class hash_map_demo {

	HashMap<Integer,String> hm = new HashMap<Integer,String>();
	
	hash_map_demo(String[] words){

		for(String w : words){

			hm.put(w.length(),w);		
	
		}
	

	}

	String toDisplay(){
	
		String str="";
		
		for(Integer key : hm.keySet())
		
			str+="\n"+hm.get(key)+" "+key;

		return str;
	}
}

class w2d12e1{

	public static void main(String [] args){

		String words[] = {"Hello","hi","Seen","You"};

		hash_map_demo hmd = new hash_map_demo(words);

		System.out.println(hmd.toDisplay());

	}

	

}
