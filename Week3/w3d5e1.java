/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package training;


import java.sql.*;
import java.util.Scanner;
/**
 *
 * @author venkataraghav
 */
public class w3d5e1 {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner snr = new Scanner(System.in);
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/contact_db","root","");
            Statement st = con.createStatement();
            
            ResultSet rs;
            System.out.println("Do you want to add record from csv file? y/n");
            if(snr.nextLine().charAt(0) == 'y'){
                
                System.out.println("Enter the path of csv file: ");
                String path = snr.nextLine();
                st.executeQuery("LOAD DATA LOCAL INFILE '"+path+"' INTO TABLE contact_table " +
                                "FIELDS TERMINATED BY ',' " +
                                "ENCLOSED BY '\"' " +
                                "LINES TERMINATED BY '\\n'"
                                );
            }
            
            
            System.out.println("Search by 1.Name 2.Number \n3.Add \nUpdate by 4.Name 5.Number");
            
            String test_word,selection;
            
            switch(snr.nextInt()){
                    
                case 1:
                    
                    snr.nextLine();
                    
                    System.out.println("Enter phrase or full name: ");
                    
                    test_word = snr.nextLine();
                    
                    String contact_name;
                    
                    rs = st.executeQuery("select * from contact_table");
                    
                    while(rs.next()) {
                        
                        contact_name = rs.getString(1);
                        
                        if ( contact_name.toLowerCase().contains(test_word.toLowerCase()) ){
                            
                            System.out.println(rs.getString(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3)+"\t"+rs.getString(4)+"\t"+rs.getString(5));
                            
                            
                        }
                    }
                    
                    break;
                    
                case 2:
                    
                    snr.nextLine();
                    
                    System.out.println("Enter number: ");
                    
                    test_word = snr.nextLine();
                    
                    rs = st.executeQuery("select * from contact_table");
                    
                    while(rs.next()){
                        
                        if ( ( rs.getString(3).contains(test_word) ) || ( rs.getString(4).contains(test_word) ) || ( rs.getString(5).contains(test_word) ) ){
                            
                            System.out.println(rs.getString(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3)+"\t"+rs.getString(4)+"\t"+rs.getString(5));
                        }
                    }
                    
                    break;
                    
                case 3:
                    
                    snr.nextLine();
                    
                    System.out.println("Enter name...");
                    
                    String name = snr.nextLine();
                    
                    System.out.println("Enter address...");
                    
                    String addr = snr.nextLine();
                    
                    System.out.println("Enter mobile...");
                    
                    String mob = snr.nextLine();
                    
                    System.out.println("Enter home...");
                    
                    String home = snr.nextLine();
                    
                    System.out.println("Enter work...");
                    
                    String work = snr.nextLine();
                    
                    st.executeUpdate("insert into contact_table values('"+name+"','"+addr+"','"+mob+"','"+home+"','"+work+"')");
                    
                    break;
                    
                case 4:
                    
                    snr.nextLine();
                    
                    System.out.println("Enter name whose details to be modified...");
                    
                    String m_name = snr.nextLine();
                    
                    System.out.println("Enter the item to be modified...1.Address 2.Mobile 3.Home 4.Work");
                    
                    selection="";
                    
                    switch(snr.nextInt()){
                            
                        case 1:
                            selection = "addr";
                            break;
                            
                        case 2:
                            selection = "mob";
                            break;
                            
                        case 3:
                            selection = "home";
                            break;
                            
                        case 4:
                            selection = "work";
                            break;
                            
                    }
                    
                    System.out.println("Enter the new value for "+selection+"...");
                    
                    snr.nextLine();
                    
                    st.executeUpdate("update contact_table set "+selection+"='"+snr.nextLine()+"' where name='"+m_name+"'");
                    
                    break;
                    
                case 5:
                    
                    snr.nextLine();
                    
                    System.out.println("Enter mobile whose details to be modified...");
                    
                    String m_mob = snr.nextLine();
                    
                    System.out.println("Enter the item to be modified...1.Name 2.Address 3.Home 4.Work");
                    
                    selection="";
                    
                    switch(snr.nextInt()){
                            
                        case 1:
                            selection = "name";
                            break;
                            
                        case 2:
                            selection = "addr";
                            break;
                            
                        case 3:
                            selection = "home";
                            break;
                            
                        case 4:
                            selection = "work";
                            break;
                            
                    }
                    
                    System.out.println("Enter the new value for "+selection+"...");
                    
                    snr.nextLine();
                    
                    st.executeUpdate("update contact_table set "+selection+"='"+snr.nextLine()+"' where mob='"+m_mob+"'");
                    
                    break;
            }
            
            con.close();
            
        }
        
        catch(Exception e){
            
            System.out.println(e.getLocalizedMessage());
            
        }
    }
    
}


