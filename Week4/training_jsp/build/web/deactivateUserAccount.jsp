<%-- 
    Document   : deactivate
    Created on : Dec 28, 2016, 4:31:42 PM
    Author     : venkataraghav
--%>

<%@page import="java.sql.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Deactivating</title>
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
            
            
           
            
            try{
                String query = "delete from users where email like '"+session.getAttribute("uname")+"'";
                st.executeUpdate(query);
                con.close();
                response.sendRedirect("http://localhost:8080/training_jsp/index.html");
            }
            catch(Exception e){
            
                out.println(e.getLocalizedMessage());
                response.sendRedirect("http://localhost:8080/training_jsp/error.html");
            }
            
        %>
    </body>
</html>
