import java.util.HashMap;
import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
 
class w2d34e1 {
 
   
    public static void main(String[] args) {
 
	w2d34e1 w  = new w2d34e1();

	w.searchDirectory("/Users/venkataraghav");


    }
 

    public void searchDirectory(String directory){
     
	   DirectoryStream<Path> directoryStream = null;
        
	   HashMap<String,Integer> hm = new HashMap<String,Integer>();

		try{

			String temp;
			            
			directoryStream = Files.newDirectoryStream(Paths.get(directory));
            
			for(Path path : directoryStream){
 
				temp = path.toString();

				if(temp.indexOf('.') != -1){

                			temp = temp.substring(temp.indexOf('.'));
		
					if( hm.get(temp) != null )

						hm.put(temp , hm.get(temp)+1 );

					else

						hm.put(temp,1);

					

            			}

			   }

   			
		
			directoryStream.close();
        
		}

		catch(IOException ioe){
            	
			ioe.printStackTrace();
        	}

		for (String key : hm.keySet()) {
 
			   System.out.println(key+" "+hm.get(key));
		}
        }
 }
 
 

