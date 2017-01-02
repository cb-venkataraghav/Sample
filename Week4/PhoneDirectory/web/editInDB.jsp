<%-- 
    Document   : editInDB
    Created on : Dec 30, 2016, 4:26:11 PM
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
            <a class="backButton" href="viewAll.jsp">Back</a>
        </div>
        <style>
        html{
                font-family: -webkit-pictograph;
                font-variant: small-caps;
                color: white;
                
            }
             fieldset{
    
                    border-color: #f6755e;
                    border-style: solid;
                    height: 620px;
                    width: 800px;
                    margin-left: 120px;
                    border-radius: 10px;
                    background-color: white;
                    margin-top: 60px;
        }
        #header{
            
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
           
             width: 800px;
             height: 600px;
             font-size: medium;
            
         }
         
         tr{
             background-color: rgba(246, 117, 94, 0.07);  
  
                 height: 80px;
             width: 125px;
             color:black;
             font-size: 20px;
             
         }
         
       .formButton {
            display: block;
            border-bottom-width: 2px;
            border-left-width: 2px;
            border-right-width: 2px;
            border-top-width: 2px;
            text-align: center;
            background: #f6755e;
            border-style: solid;
            border-color: #f6755e;
            border-radius: 16px;
            color:white;
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
         
         
         legend
        {
                background-color: #f6755e;
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
            String name="",addr="",mob="",home="",work="",id="";
           
            
            try{
            String query = "select * from contact_table where id="+request.getParameter("id");
            
            rs = st.executeQuery(query);
            
            if(rs.next()){
                name = rs.getString("name");
                addr = rs.getString("addr");
                mob = rs.getString("mob");
                home = rs.getString("home");
                work = rs.getString("work");
                id=rs.getString("id");
            }
            
            con.close();
            }
            catch(Exception e){
            
                e.printStackTrace();
                response.sendRedirect("http://localhost:8080/PhoneDirectory/error.html");
            }
            
        %>
        <div>
        <fieldset>
            <legend>Details</legend>
            <form method="POST" action="updateToDB.jsp?id=<%=id%>">
                <table border="0">
                    <tr>
                        <td>
                            Name
                        </td>
                        <td>
                            <input class="inputBox" type="text" name="name" required value="<%=name%>">
                        </td>
                        
                    </tr>
                    <tr>
                        <td>
                            Address
                        </td>
                        <td>
                            <input type="text" class="inputBox" name="addr"  required value="<%=addr%>">
                        </td>
                    </tr>
                    <tr>
                        <td>
                            Phone(Mobile)
                        </td>
                        <td>
                            <input type="text" class="inputBox" name="mob"  pattern="[0-9]*" required value="<%=mob%>">
                        </td>
                    </tr>
                    <tr>
                        <td>
                         Phone(Home)
                        </td>
                        <td>
                            <input type="text" class="inputBox" name="home" required pattern="[0-9]*" value="<%=home%>">
                        </td>
                    </tr>
                    <tr>
                        <td>
                         Phone(Work)
                        </td>
                        <td>
                            <input type="text" class="inputBox" name="work" required pattern="[0-9]*" value="<%=work%>">
                        </td>
                    </tr>
                    
                    <tr align = "center">
                        <td colspan="2">
                            <input type="submit" class="formButton" value="Save Changes">
                        </td>
                        
                    </tr>
                </table>
                    
            </form>
                        
        </fieldset>
        </div>
    </body>
</html>
