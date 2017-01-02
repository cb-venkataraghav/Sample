<%-- 
    Document   : add_addr
    Created on : Dec 28, 2016, 3:50:57 PM
    Author     : venkataraghav
--%>

<%@page import="java.sql.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Edit Details</title>
    </head>
    <body>
        <div id="header">
            <h1>Make your changes</h1>
            <a class="backButton" href="mainUserPage.jsp">Back</a>
        </div>
        <style>
        html{
                font-family: sans-serif; 
                font-variant: small-caps;
                
            }
        #header{
            
            background-color: rgb(0, 153, 153);
            height: 60px;
            font-variant: small-caps;
            
            
        }

        fieldset{
    
                    border-color: rgb(0, 153, 153);
                    height: 350px;
                    width: 250px;
                    margin-left: 150px;
                    margin-top: 50px;
                    border-radius: 10px;
                    background-color: white;
                    
        }
        
       
       
        h1{
            padding-left: 15px;
            padding-top: 15px;
            color: white;
            
        }
        
         
       .formButton {
            display: block;
            border-bottom-width: 2px;
            border-left-width: 2px;
            border-right-width: 2px;
            border-top-width: 2px;
            text-align: center;
            background: white;
            border-style: solid;
            border-color: rgb(0, 153, 153);
            border-radius: 16px;
            color: rgb(0, 153, 153);
            margin-left: 50px;
            padding-top: 4px;
            height: 33px;
            font-size: 14px;
            width: 115px;
            padding-left: 2px;
            padding-bottom: 2px;
            padding-right: 2px;
            padding-top: 2px;
            font-variant: small-caps;
            
         }
         
         table{
             text-align: center;
             
            
         }
         tr{
             background-color: rgba(158, 156, 156, 0.04);
             height: 74px;
             width: 150px;;
             
         }
         legend
        {
                background-color: rgb(0, 153, 153);
                padding-top: 4px;
                padding-bottom: 2px;
                height: 25px;
                width: 150px;
                padding-left: 9px;
                font-variant: small-caps;
                color: white;
                font-size: 20px;
    
        }
         .inputBox{
                
                height: 45px;
                width: 325px;
                font-size: 18px;
                color: rgb(158, 154, 154);
                
         }
         .backButton {
            display: block;
            text-decoration: none;
            border-style: solid;
            background: white;
            border-color: rgb(0, 153, 153);
            text-align: center;
            border-radius: 2px;
            color: rgb(0, 153, 153);
            margin-left: 20px;
            padding-top: 4px;
            height: 20px;
            width: 80px;
         } 
        
    </style>
        <%!
            Connection con;
            Statement st;
            ResultSet rs;
        %>
        <%
            Class.forName("com.mysql.jdbc.Driver");  
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/training_sample","root","");  
            st=con.createStatement();
            String fname="",lname="",mail="",pass="",addr="";
           
            
            try{
            String query = "select * from users where email like '"+session.getAttribute("uname")+"'";
            
            rs = st.executeQuery(query);
            
            if(rs.next()){
                fname = rs.getString("fname");
                lname = rs.getString("lname");
                mail = rs.getString("email");
            
                addr = rs.getString("addr");
            }
            
            con.close();
            }
            catch(Exception e){
            
                out.println(e.getLocalizedMessage());
                response.sendRedirect("http://localhost:8080/training_jsp/error.html");
            }
            
        %>
        <div>
        <fieldset>
            <legend>Details</legend>
            <form method="POST" action="updateInDB.jsp"  name="signupForm" onsubmit="return checkForm()">
                <table border="0">
                    <tr>
                        <td>
                            Name
                        </td>
                        <td>
                            <input class="inputBox" type="text" name="fname" required value="<%=fname%>">
                        </td>
                        <td>
                            <input type="text" class="inputBox" name="lname" required value="<%=lname%>">
                        </td>
                    </tr>
                    <tr>
                        <td>
                            Email
                        </td>
                        <td>
                            <input type="text" class="inputBox" name="mail" readonly="true" required value="<%=mail%>">
                        </td><td></td>
                    </tr>
                    <tr>
                        <td>
                         Address
                        </td>
                        <td>
                            <input type="text" class="inputBox" name="addr" required value="<%=addr%>">
                        </td><td></td>
                    </tr>
                    
                    <tr align = "center">
                        <td colspan="3">
                            <input type="submit" class="formButton" value="Save Changes">
                        </td>
                        <td></td>
                    </tr>
                </table>
                    
            </form>
                        
        </fieldset>
        </div>
    </body>
</html>
