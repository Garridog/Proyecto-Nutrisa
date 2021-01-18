package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import java.sql.*;
import conexion.ConectaEscuela;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Sistemas de Acceso NUTRISA</title>\n");
      out.write("                  <!-----------------------------BOOTSTRAP----------------------------->\n");
      out.write("<!--Icono-->\n");
      out.write("<link rel=\"Icon\" type=\"img/png\" href=\"img/logoicono.png\">\n");
      out.write("\t\t<!-- Google font -->\n");
      out.write("<link href=\"https://fonts.googleapis.com/css?family=Montserrat:400,500,700\" rel=\"stylesheet\">\n");
      out.write("\t\t<!-- Bootstrap -->\n");
      out.write("<link type=\"text/css\" rel=\"stylesheet\" href=\"css/bootstrap.min.css\"/>\n");
      out.write("\t\t<!-- Slick -->\n");
      out.write("<link type=\"text/css\" rel=\"stylesheet\" href=\"css/slick.css\"/>\n");
      out.write("<link type=\"text/css\" rel=\"stylesheet\" href=\"css/slick-theme.css\"/>\n");
      out.write("\t\t<!-- nouislider -->\n");
      out.write("<link type=\"text/css\" rel=\"stylesheet\" href=\"css/nouislider.min.css\"/>\n");
      out.write("\t\t<!-- Font Awesome Icon -->\n");
      out.write("<link rel=\"stylesheet\" href=\"css/font-awesome.min.css\">\n");
      out.write("\t\t<!-- Custom stlylesheet -->\n");
      out.write("<link type=\"text/css\" rel=\"stylesheet\" href=\"css/style.css\"/>\n");
      out.write("\t\t<!--Ventanas emergentes-->\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"css/ventanas.css\">\n");
      out.write("<link rel=\"stylesheet\" href=\"style.css\">\n");
      out.write("     <!-- Bootstrap core CSS -->\n");
      out.write("<link href=\"css/bootstrap.min.css\" rel=\"stylesheet\" media=\"screen\">\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"css/bootstrap.css\">\n");
      out.write("<link href=\"css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("<link href=\"css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("<link href=\"css/bootstrap-responsive.min.css\" rel=\"stylesheet\" media=\"screen\">\n");
      out.write("<link href=\"css/ie10-viewport-bug-workaround.css\" rel=\"stylesheet\">\n");
      out.write("<link ref=\"stylesheet\" type=\"text/css\" href=\"css/bootstrap.css\">\n");
      out.write("<link href=\"css/navbar.css\" rel=\"stylesheet\">\n");
      out.write("<link href=\"css/main.css\" rel=\"stylesheet\">\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"css/geolocation.css\">\n");
      out.write("<link type=\"text/css\" rel=\"stylesheet\" href=\"demobar_files/bootstrap.css\">\n");
      out.write("<script type=\"text/javascript\" src=\"demobar_files/jquery-latest.min.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"demobar_files/jquery.min.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"demobar_files/bootstrap.js\"></script>\n");
      out.write("<script src=\"js/ie-emulation-modes-warning.js\"> </script>\n");
      out.write("<link href=\"css/bootstrap.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\" />\n");
      out.write("<link href=\"css/style.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\" />\n");
      out.write("<script type=\"text/javascript\" src=\"js/jquery-1.8.0.min.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"js/bootstrap.min.js\"></script>\n");
      out.write("<link rel=\"stylesheet\" href=\"http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css\">\n");
      out.write("<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/1.12.0/jquery.min.js\"></script>\n");
      out.write("<script src=\"http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js\"></script>\n");
      out.write("<!-----------------------------/BOOTSTRAP----------------------------->\n");
      out.write(" \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <center><h1>Sistema de Control NUTRISA</h1></center>\n");
      out.write("        <hr>\n");
      out.write("        \n");
      out.write("        <!-- LIBRERIAS JSP PARA CONEXION A BD -->\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("    \n");
      out.write("               <!-- VARIABLES DE FORMULARIO DE ACCESO-->\n");
      out.write("        ");

           String usuarioAcceso = request.getParameter("usuario");
           String passAcceso = request.getParameter("password");
       
      out.write("\n");
      out.write("        \n");
      out.write("              <!-- LLAMADA DE LA CONEXION -->\n");
      out.write("       ");
//scriplet esto es java
              ConectaEscuela conexion = new ConectaEscuela("jdbc:oracle:thin:@127.0.0.1:1521:XE","ugarridobd","udl123");
              ResultSet rs = conexion.ejecutaSentencia("SELECT * FROM TUSUARIOS");
              boolean error=true;
              while(rs.next()==true){//inicia while
        if(usuarioAcceso.equals(rs.getString("usuario"))&&passAcceso.equals(rs.getString("password"))){//inicia if
           error=false;    
       
      out.write("\n");
      out.write("        \n");
      out.write("       <div class=\"container\">\n");
      out.write("           <div class=\"jumbotron\">\n");
      out.write("               <center><h2>Sistema de Control NUTRISA</h2></center>\n");
      out.write("               <hr>\n");
      out.write("               <div class=\"thumbnail\">\n");
      out.write("                   <center>\n");
      out.write("                       <h1>Bienvenido a Sistema NUTRISA</h1>\n");
      out.write("                       <h3><i>Usuario: ");
      out.print( usuarioAcceso);
      out.write("</i></h3>\n");
      out.write("                       <hr>\n");
      out.write("                       <a href=\"index.html\"><h3>Abrir Menu Principal del Sistema</h3></a>\n");
      out.write("                       <hr>\n");
      out.write("                       <h3><i>Administracion y Gestion</i></h3>\n");
      out.write("                       <hr>\n");
      out.write("                       <h3>Fecha y Hora del Sistema: ");
      out.print( new java.util.Date());
      out.write("</h3>\n");
      out.write("                        ");

                            }//termina if
                                }//termina while
                                    if(error==true){//inicia if
                        
      out.write("  \n");
      out.write("                        <h2><i>ERROR USUARIO INVALIDO</i></h2>\n");
      out.write("                        <hr>\n");
      out.write("                        <h3>Fecha y Hora del Sistema: ");
      out.print( new java.util.Date());
      out.write("</h3>\n");
      out.write("                        \n");
      out.write("                        <a href=\"Login.html\"><h4>Regresas a ventana del acceso</h4></a>\n");
      out.write("                        ");

                            }//termina if
                        
      out.write("  \n");
      out.write("                   </center>\n");
      out.write("               </div>\n");
      out.write("           </div>\n");
      out.write("       </div>\n");
      out.write("<script src=\"js/jquery.min.js\"></script>\n");
      out.write("<script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("<script src=\"js/slick.min.js\"></script>\n");
      out.write("<script src=\"js/nouislider.min.js\"></script>\n");
      out.write("<script src=\"js/jquery.zoom.min.js\"></script>\n");
      out.write("<script src=\"js/main.js\"></script>\n");
      out.write("<script type=\"js/jquery-1.8.0.min\"></script>        \n");
      out.write("<script src=\"js/bootstrap.js\"></script>\n");
      out.write("<script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
