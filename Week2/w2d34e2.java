/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package training;

/**
 *
 * @author venkataraghav
 */
import java.io.File;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import org.apache.commons.io.FileUtils;


class w2d34e2 {
    
    
    public static void main(String[] args) {
        
        
        final String srcDirPath = "/Users/venkataraghav/Work/training/Sample/Week2/source";
        final String desDirPath = "/Users/venkataraghav/Work/training/Sample/Week2/destination";
        
        DirectoryStream<Path> directoryStream = null;
        
        
        
        
        try{
            
            
            
            directoryStream = Files.newDirectoryStream(Paths.get(srcDirPath));
            
            File f = null;
            
            for(Path filePath : directoryStream){
                
                String fName =  filePath.getFileName().toString();
                
                f = new File(desDirPath+"/"+fName);
                
                int i=0;
                
                while(f.exists()){
                    
                    i++;
                    
                    String name = fName.substring(0,fName.indexOf('.'));
                    
                    String extension = fName.substring(fName.indexOf('.'));
                    
                    
                    
                    f = new File(desDirPath+"/"+name+"-"+i+extension);
                    
                    
                }
                
                FileUtils.copyFile(filePath.toFile(), f);
            }
            
            
            
            directoryStream.close();
            
        }
        
        catch(IOException ioe){
            
            ioe.printStackTrace();
        }
        
        
    }
}






