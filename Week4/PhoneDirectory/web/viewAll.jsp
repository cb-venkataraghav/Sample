<%-- 
    Document   : viewAll
    Created on : Dec 30, 2016, 1:48:56 PM
    Author     : venkataraghav
--%>

<%@page import="java.sql.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>View Contacts</title>
    </head>
    <body>
        <div>
            <h1>All Contacts</h1>
            <a href="index.html" class="backButton">Back</a>
        </div>
        <style>
        html{
                font-family: -webkit-pictograph;
                font-variant: small-caps;
                color: white;
                
            }
        div{
            
            background-color: #f6755e;
            height: 60px;
            font-variant: small-caps;
            
        }

        th
        {
                background-color: #f6755e;
                
                height: 20px;
                width: 70px;
                padding-left: 9px;
                font-size: 20px;
                font-variant: small-caps;
                color: white;
    
        }
       
        h1{
            padding-left: 11px;
            padding-top: 15px;
            color: white;
            
        }
     
         
         table{
             text-align: center;
             margin-left: 100px;
             margin-top: 80px;
             width: 900px;
             height: 500px;
             font-size: medium;
            
         }
         
         tr{
             background-color:  aliceblue;
             height: 50px;
             width: 125px;
             color:black;
             font-size: 20px;
             
         }
         .even{
             background-color: #fefffe;   
         }
         
         
         .backButton {
            display: block;
            text-decoration: none;
            border-style: solid;
            background: white;
            border-color: #f6755e;
            text-align: center;
            border-radius: 2px;
            color: #f6755e;
            margin-left: 20px;
            padding-top: 4px;
            height: 20px;
            width: 80px;
            cursor: pointer;
         } 
        
    </style>
    <%!
            Connection con;
            Statement st;
            ResultSet rs;
        %>
        <%
            Class.forName("com.mysql.jdbc.Driver");  
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/contact_db","root","");  
            st=con.createStatement();
            
           try{
                String query = "select * from contact_table";
                rs = st.executeQuery(query);
         %>       
                
         <table>
             <tr>
                 <th>Name</th> 
                 <th>Address</th> 
                 <th>Mobile</th> 
                 <th>Home</th> 
                 <th>Work</th> 
             </tr>
             <%
                 int rownum = 0;
                 
                 while(rs.next()){
                     
                   String  strClass="";  
                   if(rownum%2==0)
                       strClass = " class=even ";
                   
                   out.println("<tr"+strClass+">"
                           + "<td><a href=\"editInDB.jsp?id="+rs.getString("id")+"\">"+rs.getString("name")+"</a></td>"
                           + "<td>"+rs.getString("addr")+"</td>"
                           + "<td>"+rs.getString("mob")+"</td>"
                           + "<td>"+rs.getString("home")+"</td>"
                           + "<td>"+rs.getString("work")+"</td>"
                           + "</tr>"); 
                
                   rownum++;
                }%>
         </table>
         <%       con.close();
                
            }
            catch(Exception e){
            
                e.printStackTrace();
                response.sendRedirect("http://localhost:8080/PhoneDirectory/error.html");
            }
            
        %>
    </body>
</html>
