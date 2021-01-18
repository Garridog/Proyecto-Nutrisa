<%-- 
    Document   : Consultaventas
    Created on : 7/12/2020, 10:38:38 PM
    Author     : uriel
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Consulta de Ventas</title>
                <!-----------------------------BOOTSTRAP----------------------------->
<!--Icono-->
<link rel="Icon" type="img/png" href="img/logoicono.png">
<!-- Google font -->
<link href="https://fonts.googleapis.com/css?family=Montserrat:400,500,700" rel="stylesheet">
<!-- Bootstrap -->
<link type="text/css" rel="stylesheet" href="css/bootstrap.min.css"/>
<!-- Slick -->
<link type="text/css" rel="stylesheet" href="css/slick.css"/>
<link type="text/css" rel="stylesheet" href="css/slick-theme.css"/>
<!-- nouislider -->
<link type="text/css" rel="stylesheet" href="css/nouislider.min.css"/>
<!-- Font Awesome Icon -->
<link rel="stylesheet" href="css/font-awesome.min.css">
<!-- Custom stlylesheet -->
<link type="text/css" rel="stylesheet" href="css/style.css"/>
<!--Ventanas emergentes-->
<link rel="stylesheet" type="text/css" href="css/ventanas.css">
<link rel="stylesheet" href="style.css">
<!-- Bootstrap core CSS -->
<link href="css/bootstrap.min.css" rel="stylesheet" media="screen">
<link rel="stylesheet" type="text/css" href="css/bootstrap.css">
<link href="css/bootstrap.min.css" rel="stylesheet">
<link href="css/bootstrap.min.css" rel="stylesheet">
<link href="css/bootstrap-responsive.min.css" rel="stylesheet" media="screen">
<link href="css/ie10-viewport-bug-workaround.css" rel="stylesheet">
<link ref="stylesheet" type="text/css" href="css/bootstrap.css">
<link href="css/navbar.css" rel="stylesheet">
<link href="css/main.css" rel="stylesheet">
<link rel="stylesheet" type="text/css" href="css/geolocation.css">
<link type="text/css" rel="stylesheet" href="demobar_files/bootstrap.css">
<script type="text/javascript" src="demobar_files/jquery-latest.min.js"></script>
<script type="text/javascript" src="demobar_files/jquery.min.js"></script>
<script type="text/javascript" src="demobar_files/bootstrap.js"></script>
<script src="js/ie-emulation-modes-warning.js"> </script>
<link href="css/bootstrap.css" rel="stylesheet" type="text/css" media="all" />
<link href="css/style.css" rel="stylesheet" type="text/css" media="all" />
<script type="text/javascript" src="js/jquery-1.8.0.min.js"></script>
<script type="text/javascript" src="js/bootstrap.min.js"></script>
<link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.0/jquery.min.js"></script>
<script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
<!-----------------------------/BOOTSTRAP----------------------------->
<link rel="preconnect" href="https://fonts.gstatic.com">
<link href="https://fonts.googleapis.com/css2?family=Montserrat+Alternates&display=swap" rel="stylesheet">
    </head>
    <body style="background-image: url(https://image.freepik.com/free-vector/ice-cream-doodle-seamless-pattern_3865-362.jpg); font-family: 'Montserrat Alternates'">
        <div class="container">
            <div class="jumbotron" style="background-color: white">
                <center>
                    <img src="https://seeklogo.com/images/N/NUTRISA-logo-96C8B5A078-seeklogo.com.png" />
                     <h1 style="color: #EF7F1A">Consulta de Ventas</h1>
                             <table>
            <tr>
                <%@page import = "java.sql.*" %>
                <%@page import = "conexion.ConectaEscuela" %>
                
                <% 
                    ConectaEscuela conexion = new ConectaEscuela("jdbc:oracle:thin:@127.0.0.1:1521:XE", "ugarridobd", "udl123");
                    String ConsultaSQL = "Select * from ventas";
                    ResultSet rs = conexion.ejecutaSentencia(ConsultaSQL);
                    
                    ResultSetMetaData rsmd = rs.getMetaData();
                    
                    int col = rsmd.getColumnCount();
                    for(int k = 1;k <= col;k++){
                %>
                
                <td style="border: solid gray 1px;margin: 1%"><%= rsmd.getColumnName(k)%></td>
                <% 
                    } while (rs.next()) {
                %>
            <tr style="text-align: center">
                <td style="border: solid gray 1px;margin: 1%; color: #009846"> <%= rs.getString(1) %> </td> 
                <td style="border: solid gray 1px;margin: 1%; color: #009846"> <%= rs.getString(2) %> </td> 
                <td style="border: solid gray 1px;margin: 1%; color: #009846"> <%= rs.getString(3) %> </td> 
                <td style="border: solid gray 1px;margin: 1%; color: #009846"> <%= rs.getString(4) %> </td> 
                <td style="border: solid gray 1px;margin: 1%; color: #009846"> $<%= rs.getString(5) %> </td> 
                <% } %>
            </tr>
            </tr>
        </table>
            <br><br>
            <a href="index.html"><h5>Volver al Menu Principal</h5></a>
                </center>
            </div>
        </div>
       
   
            
            
<script src="js/jquery.min.js"></script>
<script src="js/bootstrap.min.js"></script>
<script src="js/slick.min.js"></script>
<script src="js/nouislider.min.js"></script>
<script src="js/jquery.zoom.min.js"></script>
<script src="js/main.js"></script>
<script type="js/jquery-1.8.0.min"></script>        
<script src="js/bootstrap.js"></script>
<script src="js/bootstrap.min.js"></script> 
    </body>
</html>
