<%-- 
    Document   : editChanges
    Created on : Dec 28, 2016, 4:12:56 PM
    Author     : venkataraghav
--%>

<%@page import="java.sql.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Editing the changes</title>
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
            String fname,lname,addr;
            fname = request.getParameter("fname");
            lname = request.getParameter("lname");
            addr = request.getParameter("addr");
            
           
            
            try{
                String query = "update users set fname='"+fname+"', lname='"+lname+"',addr='"+addr+"' where email like '"+session.getAttribute("uname")+"'";
                st.executeUpdate(query);
                con.close();
                session.setAttribute("fname",fname);
                session.setAttribute("lname",lname);
                response.sendRedirect("http://localhost:8080/training_jsp/editUserDetails.jsp");
            }
            catch(Exception e){
            
                e.printStackTrace();
                response.sendRedirect("http://localhost:8080/training_jsp/error.html");
            }
            
        %>
    </body>
</html>
