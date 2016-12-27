import java.io.*;
import java.util.Iterator;
import java.util.ArrayList;
import org.json.simple.parser.JSONParser;
import org.json.simple.JSONObject;
import org.json.simple.JSONArray;
import org.json.simple.parser.ParseException;

class Student{

	class Mark{

		String sub_name;
		long  mark;


	}

	String name,doj,id,std;
	ArrayList<Mark> m_al = new ArrayList<Mark>();

}
class Teacher{

	String name,doj,id;
	long sal;
	ArrayList<String> ct = new ArrayList<String>();
}


class w2d34e7 {
 
    
    public static void main(String[] args) {
    
	JSONParser parser = new JSONParser();
 
	try {
 
            Object obj = parser.parse(new FileReader("students-teachers.json"));
 
            JSONObject jsonObject = (JSONObject) obj;

	    JSONObject student = (JSONObject)jsonObject.get("Student");

	    Student s = new Student();

	    s.name = (String) student.get("Name");

	    s.std = (String) student.get("Std");
	  
   	    s.id = (String) student.get("ID");

	    s.doj = (String) student.get("Date Of Joining");

	    JSONArray arr = (JSONArray) student.get("Marks");

	    Iterator itr = arr.iterator();

	    while(itr.hasNext())
		{
			Student.Mark m = s.new Mark(); 

			JSONObject o = (JSONObject) itr.next();

			m.sub_name = (String) o.get("Subject");

			m.mark =(long) o.get("Mark");

		}		
	
	   JSONObject teacher = (JSONObject)jsonObject.get("Teacher");

	   Teacher t = new Teacher();

	    t.name = (String) teacher.get("Name");

            t.id = (String) teacher.get("ID");

            t.sal = (long) teacher.get("Salary");

            t.doj = (String) teacher.get("Date Of Joining");			
	    
	    arr = (JSONArray) teacher.get("Classes Taking Care Of");

	    itr = arr.iterator();

	    while(itr.hasNext()){


		(t.ct).add((String)itr.next());

	   }		
 
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
