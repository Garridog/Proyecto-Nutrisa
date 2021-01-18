package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import conexion.ConectaEscuela;

public final class actualizarventa1_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Actualizar Venta</title>\n");
      out.write("                                 <!-----------------------------BOOTSTRAP----------------------------->\n");
      out.write("<!--Icono-->\n");
      out.write("<link rel=\"Icon\" type=\"img/png\" href=\"img/logoicono.png\">\n");
      out.write("<!-- Google font -->\n");
      out.write("<link href=\"https://fonts.googleapis.com/css?family=Montserrat:400,500,700\" rel=\"stylesheet\">\n");
      out.write("<!-- Bootstrap -->\n");
      out.write("<link type=\"text/css\" rel=\"stylesheet\" href=\"css/bootstrap.min.css\"/>\n");
      out.write("<!-- Slick -->\n");
      out.write("<link type=\"text/css\" rel=\"stylesheet\" href=\"css/slick.css\"/>\n");
      out.write("<link type=\"text/css\" rel=\"stylesheet\" href=\"css/slick-theme.css\"/>\n");
      out.write("<!-- nouislider -->\n");
      out.write("<link type=\"text/css\" rel=\"stylesheet\" href=\"css/nouislider.min.css\"/>\n");
      out.write("<!-- Font Awesome Icon -->\n");
      out.write("<link rel=\"stylesheet\" href=\"css/font-awesome.min.css\">\n");
      out.write("<!-- Custom stlylesheet -->\n");
      out.write("<link type=\"text/css\" rel=\"stylesheet\" href=\"css/style.css\"/>\n");
      out.write("<!--Ventanas emergentes-->\n");
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
      out.write("<!-----------------------------/BOOTSTRAP----------------------------->   \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("    <center><h1>Sistema de Actualizaciones</h1></center>\n");
      out.write("    <hr>\n");
      out.write("        <!-- LIBRERIAS JSP PARA CONEXION A BD -->\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        <!-- LLAMADA A LA CONEXION -->\n");
      out.write("        ");
 
            ConectaEscuela conexion = new ConectaEscuela("jdbc:mysql://localhost/bdescuelajs","ugarridobd", "udl123");
            String numero = request.getParameter("idventa");
            int IDventa = Integer.parseInt(numero);
            session.setAttribute("num", numero);
            
            String consultaBusqueda = "SELECT * from ventas where idventa = '"+IDventa+"'";
            ResultSet rs = conexion.ejecutaSentencia(consultaBusqueda);
            if (rs.next()) {
        
      out.write("\n");
      out.write("        \n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"jumbotron\">\n");
      out.write("                <center><h2>Sistema de Actualizacion de Datos</h2></center>\n");
      out.write("                <hr>\n");
      out.write("                <div class=\"thumbnail\">\n");
      out.write("                    <center>\n");
      out.write("                        <h1>Formulario para modificar registro de ventas</h1>\n");
      out.write("                        <h3><i>(Cambia la informacion de las campos seleccionados)</i></h3>\n");
      out.write("                        <hr>\n");
      out.write("                        <form method=\"post\" action=\"actualizar2.jsp\">\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <h3>Nombre: </h3>\n");
      out.write("                                <input type=\"text\" name=\"nombre\" class=\"form-control\" value=\"");
      out.print( rs.getString(2));
      out.write("\" />\n");
      out.write("                                <h3>Apellido: </h3>\n");
      out.write("                                <input type=\"text\" name=\"apellido\" class=\"form-control\" value=\"");
      out.print( rs.getString(3));
      out.write("\" />\n");
      out.write("                                <br>\n");
      out.write("                                <input type=\"submit\" class=\"btn btn-info btn-block\" value=\"Modificar datos\"/>\n");
      out.write("                            </div>\n");
      out.write("                        </form>\n");
      out.write("                        <hr>\n");
      out.write("                        ");

                            } else {
                        
      out.write("\n");
      out.write("                        <h1>ERROR</h1>\n");
      out.write("                        <hr>\n");
      out.write("                        <h3>Fecha y Hora del Sistema: ");
      out.print( new java.util.Date());
      out.write(" </h3>\n");
      out.write("                        <a href=\"index.html\"><h4>Regresar a Menu Principal</h4></a>\n");
      out.write("                        ");

                            }
                        
      out.write("\n");
      out.write("                    </center>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("<script src=\"js/jquery.min.js\"></script>\n");
      out.write("<script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("<script src=\"js/slick.min.js\"></script>\n");
      out.write("<script src=\"js/nouislider.min.js\"></script>\n");
      out.write("<script src=\"js/jquery.zoom.min.js\"></script>\n");
      out.write("<script src=\"js/main.js\"></script>\n");
      out.write("<script type=\"js/jquery-1.8.0.min\"></script>        \n");
      out.write("<script src=\"js/bootstrap.js\"></script>\n");
      out.write("<script src=\"js/bootstrap.min.js\"></script> \n");
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
