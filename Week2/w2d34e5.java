
import java.io.*; 
import java.util.*; 
import org.apache.commons.csv.*; 


class w2d34e5{


	public static void main(String[] args){


		try{

		String temp;

		FileReader fr = new FileReader("read.csv");

		CSVParser parser = new CSVParser(fr,CSVFormat.EXCEL);

		List<CSVRecord> list = parser.getRecords();

		Set<String> s = new HashSet<String>();

		FileWriter fw = new FileWriter("write.csv");


		CSVPrinter printer = new CSVPrinter(fw,CSVFormat.EXCEL);

		for(CSVRecord rec : list){


			temp = rec.get(0).toString()+rec.get(1).toString();

			System.out.println(temp);			

			if(!s.contains(temp)){

				printer.printRecord(rec.get(0).toString(),rec.get(1).toString());

				s.add(temp);
			}
		}

		fr.close();

		fw.close();

		parser.close();

		printer.close();
		
		}

		catch(IOException ie){

			System.out.println(ie.getMessage());

		}
		
		
	}

}
