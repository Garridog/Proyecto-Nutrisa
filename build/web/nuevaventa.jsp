<%-- 
    Document   : nuevaventa
    Created on : 7/12/2020, 12:08:19 AM
    Author     : uriel
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Venta Generada</title>
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
        
        <%@page import="java.sql.*" %>
        <%@page import="conexion.ConectaEscuela" %>
        
        <% 
           
            //Declaracion y Asignacion de variables
            ConectaEscuela conexion = new ConectaEscuela("jdbc:oracle:thin:@127.0.0.1:1521:XE","ugarridobd","udl123");
            int idventa = Integer.parseInt(request.getParameter("idventa"));
            String nombre = request.getParameter("nombre");
            String apellido = request.getParameter("apellido");
            int cantidadventa = Integer.parseInt(request.getParameter("cantidadventa"));
            int precio = 70;
            int valorFinal = cantidadventa * precio;
            
            //Ejecucion de sentencia SQL para alta
            String queryAlta = "insert into ventas values ('"+idventa+"','"+nombre+"','"+apellido+"','"+cantidadventa+"','"+valorFinal+"')";
            int c = conexion.ejecutaSentenciaUpdate(queryAlta);
            
            if(c==1){ //inicia If
            
        %>
        
        <div class="container">
            <div class="jumbotron" style="background-color: white">
                <center><img src="https://seeklogo.com/images/N/NUTRISA-logo-96C8B5A078-seeklogo.com.png"/></center>
                <br>
                <div class="thumbnail">
                    <div class="aler alert-info"style="background-color: white">
                        <center>
                            <h2 style="color: #EF7F1A">Venta Generada</h2>
                            <hr>
                            <h3>Confirma los Datos</h3>
                            <hr>
                            <h4 style="color: #009846">ID Venta : <%= idventa%></h4>
                            <h4 style="color: #009846">Nombre : <%= nombre%></h4>
                            <h4 style="color: #009846">Apellido : <%= apellido%></h4>
                            <h4 style="color: #009846">Cantidad Promociones: <%= cantidadventa%></h4>
                            <h2 style="color: #EF7F1A">Precio Total : $<%= valorFinal %></h2>
                        </center>
                    </div>
                        <hr>
                        <h5>Fecha y Hora de Sistema <%= new java.util.Date() %></h5>
                        <hr>
                        <a href="NuevaVenta.html"><h5>Regresar a Formulario de Venta</h5></a>
                </div>
                        <% } else { %>
                        <hr>
                        <h2>*ERROR* No se inserto ningun registro!!!</h2>
                        <h5>Fecha y Hora de Sistema <%= new java.util.Date() %></h5>
                        <hr>
                        <% } //Termina IF %>
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
