<%-- 
    Document   : check
    Created on : Dec 28, 2016, 11:08:46 AM
    Author     : venkataraghav
--%>

<%@page import="java.sql.*"%>
<%@page import="java.lang.String"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Validating</title>
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
            String uname,pass;
            uname = request.getParameter("uname");
            pass = request.getParameter("pass");
            
            
            try{
            String query = "select * from users where email like '"+uname+"'";
            String retrieved_pass="";
            
            rs = st.executeQuery(query);
            
            if(rs.next()) {
                
                retrieved_pass = rs.getString(4);
                
            
                if(retrieved_pass.equals(pass)){
             
                session.setAttribute("fname",rs.getString("fname"));
                session.setAttribute("lname",rs.getString("lname"));
                session.setAttribute("uname", uname);
                con.close();
                response.sendRedirect("http://localhost:8080/training_jsp/mainUserPage.jsp");
                }
            
                else{
                    
                    con.close();
                    response.sendRedirect("http://localhost:8080/training_jsp/index.html?msg=Invalid%20Password");
                }
                
            }
            else
            {
                    response.sendRedirect("http://localhost:8080/training_jsp/index.html?msg=Invalid%20username");
            
            }
            
            
            }
            catch(Exception e){
            
                e.printStackTrace();
                response.sendRedirect("http://localhost:8080/training_jsp/error.html");
            }
            
        %>
    </body>
</html>
