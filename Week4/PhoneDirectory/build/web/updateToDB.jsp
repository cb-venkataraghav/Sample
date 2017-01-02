<%-- 
    Document   : updateToDB
    Created on : Dec 30, 2016, 4:50:18 PM
    Author     : venkataraghav
--%>

<%@page import="java.sql.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>UpdateDB</title>
    </head>
    <body>
          <%!
            Connection con;
            Statement st;
            
        %>
        <%
            Class.forName("com.mysql.jdbc.Driver");  
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/contact_db","root","");  
            st=con.createStatement();
            
           
            
            try{
            String query = "update contact_table set name='"+request.getParameter("name")+"', addr='"+request.getParameter("addr")+"', mob='"+request.getParameter("mob")+"', home='"+request.getParameter("home")+"', work='"+request.getParameter("work")+"' where id="+request.getParameter("id");
            
            st.executeUpdate(query);
            
            
            con.close();
                response.sendRedirect("http://localhost:8080/PhoneDirectory/viewAll.jsp");
            
            }
            catch(Exception e){
            
                e.printStackTrace();
                response.sendRedirect("http://localhost:8080/PhoneDirectory/error.html");
            }
            
        %>
    </body>
</html>
