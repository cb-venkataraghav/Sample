<%-- 
    Document   : newUser
    Created on : Dec 28, 2016, 1:11:36 PM
    Author     : venkataraghav
--%>

<%@page import="java.sql.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Signing Up</title>
    </head>
    <body>
        <%!
            Connection con;
            Statement st;
            ResultSet rs;
        %>
        <%
            Class.forName("com.mysql.jdbc.Driver");  
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/training_sample","root","");  
            st=con.createStatement();
            String fname,lname,mail,pass;
            fname = request.getParameter("fname");
            lname = request.getParameter("lname");
            mail = request.getParameter("mailId");
            pass = request.getParameter("pass");
            
            try{
                
            String query = "select * from users where email like '"+mail+"'";
            
            rs = st.executeQuery(query);
            
            if(rs.next()){
                
                con.close();
                response.sendRedirect("http://localhost:8080/training_jsp/signup.html?msg=MailID%20exists"); //if ID already exists
               
            }
            
            else{
                    
                query = "insert into users values('"+fname+"','"+lname+"','"+mail+"','"+pass+"','')";
            
                st.executeUpdate(query);
            
                con.close();
            
                response.sendRedirect("http://localhost:8080/training_jsp/index.html?msg=Successfully%20signedup");
            }
            }
            catch(SQLException e){
            
                e.printStackTrace();
                response.sendRedirect("http://localhost:8080/training_jsp/error.html");
            }
            
        %>
        Redirecting...
        
    </body>
</html>
