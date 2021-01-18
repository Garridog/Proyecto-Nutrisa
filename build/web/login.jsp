

<%@page import="java.sql.ResultSet"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Sistemas de Acceso NUTRISA</title>
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
    <body style="background-image: url(https://img4.goodfon.com/wallpaper/nbig/f/62/ice-cream-pattern-background-vector.jpg); font-family: 'Montserrat Alternates', sans-serif;">
        
        <!-- LIBRERIAS JSP PARA CONEXION A BD -->
        
        <%@page import = "java.sql.*" %>
        <%@page import = "conexion.ConectaEscuela" %>
    
               <!-- VARIABLES DE FORMULARIO DE ACCESO-->
        <%
           String usuarioAcceso = request.getParameter("usuario");
           String passAcceso = request.getParameter("password");
       %>
        
              <!-- LLAMADA DE LA CONEXION -->
       <%//scriplet esto es java
              ConectaEscuela conexion = new ConectaEscuela("jdbc:oracle:thin:@127.0.0.1:1521:XE","ugarridobd","udl123");
              ResultSet rs = conexion.ejecutaSentencia("SELECT * FROM TUSUARIOS");
              boolean error=true;
              while(rs.next()==true){//inicia while
        if(usuarioAcceso.equals(rs.getString("usuario"))&&passAcceso.equals(rs.getString("password"))){//inicia if
           error=false;    
       %>
        
       <div class="container">
           <br><br><br><br>
           <div class="thumbnail" style="border-radius: 20px">
                   <center>
                       <h1>Bienvenido a JUEVES 2X1</h1>
                       <h3><b>Usuario: <%= usuarioAcceso%></b></h3>
                       <hr>
                       <a href="index.html"><h3>Abrir Menu Principal del Sistema</h3></a>
                       <hr>
                       <h3><b>Administración y Gestión</b></h3>
                       <hr>
                       <h3>Fecha y Hora del Sistema: <%= new java.util.Date()%></h3>
                        <%
                            }//termina if
                                }//termina while
                                    if(error==true){//inicia if
                        %>  
                        <h2><i>ERROR USUARIO INVALIDO</i></h2>
                        <hr>
                        <h3>Fecha y Hora del Sistema: <%= new java.util.Date()%></h3>
                        
                        <a href="Login.html"><h4>Regresas a ventana del acceso</h4></a>
                        <%
                            }//termina if
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
