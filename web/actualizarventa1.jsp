<%-- 
    Document   : actualizarventa1
    Created on : 7/12/2020, 04:19:04 PM
    Author     : uriel
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Actualizar Venta</title>
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
        <!-- LIBRERIAS JSP PARA CONEXION A BD -->
        <%@page import="java.sql.*" %>
        <%@page import="conexion.ConectaEscuela" %>
        
        <!-- LLAMADA A LA CONEXION -->
        <% 
            ConectaEscuela conexion = new ConectaEscuela("jdbc:oracle:thin:@127.0.0.1:1521:XE","ugarridobd","udl123");
            String numero = request.getParameter("idventa");
            int IDventa = Integer.parseInt(numero);
            session.setAttribute("num", numero);
            
            String consultaBusqueda = "SELECT * from ventas where idventa = '"+IDventa+"'";
            ResultSet rs = conexion.ejecutaSentencia(consultaBusqueda);
            if (rs.next()) {
        %>
        
        <div class="container">
            <div class="jumbotron" style="background-color: white">
                <div class="thumbnail" style="border: solid black 0px">
                    <center>
                        <img src="https://seeklogo.com/images/N/NUTRISA-logo-96C8B5A078-seeklogo.com.png" />
                        <h1 style="color: #EF7F1A">Formulario para modificar registro de ventas</h1>
                        <h3><i>(Cambia la informacion de las campos seleccionados)</i></h3>
                        
                        <form method="post" action="actualizarventa2.jsp">
                            <div class="form-group" style="background-color: white">
                                <h3 style="color: #009846">Nombre: </h3>
                                <input type="text" name="nombre" class="form-control" value="<%= rs.getString(2)%>" />
                                <h3 style="color: #009846">Apellido: </h3>
                                <input type="text" name="apellido" class="form-control" value="<%= rs.getString(3)%>" />
                                <br>
                                <input type="submit" class="btn btn-info btn-success" value="Modificar datos"/>
                            </div>
                        </form>
                        <hr>
                        <a href="index.html"><h4>Regresar a Menu Principal</h4></a>
                        <%
                            } else {
                        %>
                        <h1>ERROR</h1>
                        <hr>
                        <h3>Fecha y Hora del Sistema: <%= new java.util.Date()%> </h3>
                        <a href="index.html"><h4>Regresar a Menu Principal</h4></a>
                        <%
                            }
                        %>
                    </center>
                </div>
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
