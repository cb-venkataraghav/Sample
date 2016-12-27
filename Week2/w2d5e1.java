import java.io.*;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import org.apache.commons.csv.CSVPrinter;
import org.json.simple.parser.JSONParser;
import org.json.simple.JSONObject;


class w2d5e1{
    
    
    public static void main(String[] args) throws org.json.simple.parser.ParseException{
        
        
        try{
            
            String[] input_header = {"Customer Id","Subscription Id","Invoice Number","Invoice Date","Start Date","Amount","Status","Paid On","Next Retry","Refunded Amount","Recurring","First Invoice","Customer First Name","Customer Last Name","Customer Email","Customer Company","Tax Total"};
            
            FileReader fr_csv,fr_json;
            
            
            
            fr_csv = new FileReader("//Users//venkataraghav//Work//training//Sample//input.csv");
            
            fr_json = new FileReader("//Users//venkataraghav//Work//training//Sample//config.json");
            
            
            
            Object obj;
            
            List<CSVRecord> list;
            
            CSVParser parser;
            
            JSONParser p;
            
            
            
            
            
            parser = new CSVParser(fr_csv,CSVFormat.DEFAULT.withHeader(input_header));
            
            p = new JSONParser();
            
            
            
            
            obj = p.parse(fr_json);
            
            list = parser.getRecords();
            
            
            FileWriter fw = new FileWriter("/Users/venkataraghav/Work/training/Sample/output.csv");
            
            String[] output_header = {"Customer Id","Subscription Id","Invoice Number","Invoice Date","Start Date","Amount","Status","Paid On","Next Retry","Refunded Amount","Recurring","First Invoice","Tax Total","Customer Details"};
            
            
            CSVPrinter printer = new CSVPrinter(fw,CSVFormat.DEFAULT.withHeader(output_header));
            
            JSONObject jsonObject = (JSONObject) obj;
            
            JSONObject jsonObject_key = new JSONObject();
            
            JSONObject temp;
            
            boolean flag = false;
            
            int change;
            
            for(int j = 1 ; j < list.size() ; j++){
                
                CSVRecord rec = list.get(j);
                
                for(int key=0 ; key < input_header.length; key++){
                    
                    temp = (JSONObject)jsonObject.get(input_header[key]);
                    
                    change = (int) (long) temp.get("change");
                    
                    
                    
                    switch(change){
                            
                        case 1:
                            printer.print( Double.parseDouble( rec.get(input_header[key])) / (long) temp.get("value"));
                            
                            break;
                            
                        case 2:
                            flag = true;
                            
                            jsonObject_key.put( input_header[key] , rec.get(input_header[key]) );
                            
                            break;
                        case 3:
                            
                            try{
                                if(rec.get(input_header[key]).length()>0)
                                {
                                    String dateStr = rec.get(input_header[key]);
                                    
                                    
                                    
                                    DateFormat srcDf = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
                                    
                                    Date date = srcDf.parse(dateStr);
                                    
                                    
                                    DateFormat destDf = new SimpleDateFormat((String) temp.get("format"));
                                    
                                    dateStr = destDf.format(date);
                                    
                                    printer.print(  dateStr);
                                }
                            }
                            
                            catch( ParseException pe) {
                                
                                System.out.println("Parsing date"+pe.toString());
                                
                            }
                            
                            break;
                            
                        default:
                            
                            printer.print(rec.get(input_header[key]));
                            
                            
                    }
                    
                    
                    
                }
                
                if(flag)
                    
                    printer.print(jsonObject_key);
                
                
                printer.println();
                
                flag = false;
            }
            
            fr_csv.close();
            
            fr_json.close();
            
            fw.close();
            
            parser.close();
            
            printer.close();
            
        }
        
        catch(IOException i){
            
            System.out.println("asdfa"+i.toString());
            
        }
        
        
    }
    
}

