<%-- 
    Document   : details
    Created on : Dec 28, 2016, 3:15:45 PM
    Author     : venkataraghav
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Details</title>
    </head>
    <style>
        html{
                font-family: sans-serif; 
                font-variant: small-caps;
                color: white;
            }
        div{
            
            background-color: rgb(0, 153, 153);
            
        }

        fieldset{
    
                    border-color: rgb(0, 153, 153);
                    height: 130px;
                    width: 300px;
                    margin-left: 100px;
                    border-radius: 10px;
                    background-color: white;
        }
        legend
        {
                background-color: rgb(0, 153, 153);
                padding-top: 4px;
                padding-bottom: 2px;
                height: 25px;
                width: 70px;
                padding-left: 9px;
                font-variant: small-caps;
    
        }
       
        h2{
            padding-left: 11px;
            padding-top: 7px;
            color: white;
        }
        
        .logOutButton {
            display: block;
            text-decoration: none;
            
            background: white;
            
            text-align: center;
            border-radius: 2px;
            color: rgb(0, 153, 153);
            margin-left: 1150px;
            padding-top: 4px;
            height: 20px;
            width: 80px;
         }   
         
         .button {
            display: block;
            text-decoration: none;
            text-align: center;
            background: white;
            border-style: solid;
            border-color: rgb(0, 153, 153);
            border-radius: 16px;
            color: rgb(0, 153, 153);
            margin-left: 50px;
            padding-top: 4px;
            height: 20px;
            width: 180px;
         }
        
        
    </style>
    <body>
        <div>
        <h2>Hi  <%=session.getAttribute("fname")+" "+session.getAttribute("lname")%> !!!</h2>
        <h4><a class="logOutButton" href="index.html">Log out</a></h4>
         </div>                                                               
        <fieldset>
            <legend>Choose</legend>
        <table border="0" width="150px">
        <tr><td><a class="button" href="editUserDetails.jsp">Edit detail</a></td></tr>
        <tr><td><a class="button" href="deactivateUserAccount.jsp">Deactivate Account</a></td></tr>
        </table>
        </fieldset>
    </body>
</html>
