import java.io.*;
import java.util.Iterator;
import java.util.ArrayList;
import org.json.simple.parser.JSONParser;
import org.json.simple.JSONObject;
import org.json.simple.JSONArray;


class Student{
    
    class Mark{
        
        private String sub_name;
        private long  mark;
        void setMark(long mark){
            this.mark=mark;
        }
        void setSubName(String sub_name){
            this.sub_name=sub_name;
        }
        
        long getMark(){
            return mark;
        }
        String getSubName(){
            return sub_name;
        }
    }
    private Mark markObj;
    private String name,doj,id,std;
    private ArrayList<Mark> m_al;
    
    void setName(String name){
        this.name = name;
    }
    void setDoj(String doj){
        this.doj = doj;
    }
    void setId(String id){
        this.id = id;
    }
    void setStd(String std){
        this.std = std;
    }
    void setMarks(ArrayList<Mark> std){
        this.m_al=m_al;
    }
    
    
    String getName(){
        return name;
    }
    String getDoj(){
        return doj;
    }
    String getId(){
        return id;
    }
    String getStd(){
        return std;
    }
    ArrayList<Mark> getMarks(){
        return m_al;
    }
    Mark getMarkObject(){
        return markObj;
    }
    
}
class Teacher{
    
    private String name,doj,id;
    private long sal;
    private ArrayList<String> std;
    
    
    void setName(String name){
        this.name = name;
    }
    void setDoj(String doj){
        this.doj = doj;
    }
    void setId(String id){
        this.id = id;
    }
    void setSal(long sal){
        this.sal=sal;
    }
    void setStd(ArrayList<String> std){
        this.std=std;
    }
    
    
    String getName(){
        return name;
    }
    String getDoj(){
        return doj;
    }
    String getId(){
        return id;
    }
    long getSal(){
        return sal;
    }
    ArrayList<String> getStd(){
        return std;
    }
    
    
}


class w2d34e7 {
    
    
    public static void main(String[] args) {
        
        JSONParser parser = new JSONParser();
        
        try {
            
            Object obj = parser.parse(new FileReader("students-teachers.json"));
            
            JSONObject jsonObject = (JSONObject) obj;
            
            JSONObject student = (JSONObject)jsonObject.get("Student");
            
            Student s = new Student();
            
            s.setName( (String) student.get("Name") );
            
            s.setStd ( (String) student.get("Std") );
            
            s.setId ( (String) student.get("ID") );
            
            s.setDoj ( (String) student.get("Date Of Joining") );
            
            JSONArray arr = (JSONArray) student.get("Marks");
            
            Iterator itr = arr.iterator();
            
            ArrayList<Student.Mark> m_al = new ArrayList();
            
            while(itr.hasNext())
            {
                
                Student.Mark m = s.getMarkObject();
                
                JSONObject o = (JSONObject) itr.next();
                
                m.setSubName ((String) o.get("Subject"));
                
                m.setMark ((long) o.get("Mark"));
                
            }
            
            JSONObject teacher = (JSONObject)jsonObject.get("Teacher");
            
            Teacher t = new Teacher();
            
            t.setName ((String) teacher.get("Name") );
            
            t.setId ( (String) teacher.get("ID") );
            
            t.setSal ((long) teacher.get("Salary") );
            
            t.setDoj ( (String) teacher.get("Date Of Joining") );
            
            arr = (JSONArray) teacher.get("Classes Taking Care Of");
            
            itr = arr.iterator();
            
            ArrayList<String> std = new ArrayList();
            
            while(itr.hasNext()){
                
                
                std.add((String)itr.next());
                
            }	
            
            t.setStd(std);
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
