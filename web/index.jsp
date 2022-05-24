<%-- 
    Document   : index
    Created on : 17-may-2022, 9:49:11
    Author     : ITCA
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="resivir" method="POST">        
        <h1>Registro de persona</h1>
        <table border = " 10 ">
            <tr>
             <td> dui:</td><td><input type="text" name="texteDui" value="" /><br> </td>
            </tr>
             <tr>
             <td>apellido:</td><td><input type="text" name="txtapellido" value="" /><br></td>
              </tr>
               <tr>
             <td>nombre:</td><td><input type="text" name="txtnombre" value="" /><br>  </td>  
              </tr>
               <tr>
             <td> registrar nuevapersona:</td><td><input type="submit" value="registrar nuevapersona" /> </td>
              </tr>
        
        </table>  
    </form>
    </body>
</html>
