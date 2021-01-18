package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import conexion.ConectaEscuela;

public final class Consultaventas_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>JSP Consulta de Ventas</title>\n");
      out.write("                <!-----------------------------BOOTSTRAP----------------------------->\n");
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
      out.write("<!-- Bootstrap core CSS -->\n");
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
      out.write("<link rel=\"preconnect\" href=\"https://fonts.gstatic.com\">\n");
      out.write("<link href=\"https://fonts.googleapis.com/css2?family=Montserrat+Alternates&display=swap\" rel=\"stylesheet\">\n");
      out.write("    </head>\n");
      out.write("    <body style=\"background-image: url(https://image.freepik.com/free-vector/ice-cream-doodle-seamless-pattern_3865-362.jpg); font-family: 'Montserrat Alternates'\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"jumbotron\" style=\"background-color: white\">\n");
      out.write("                <center>\n");
      out.write("                    <img src=\"https://seeklogo.com/images/N/NUTRISA-logo-96C8B5A078-seeklogo.com.png\" />\n");
      out.write("                     <h1 style=\"color: #EF7F1A\">Consulta de Ventas</h1>\n");
      out.write("                             <table>\n");
      out.write("            <tr>\n");
      out.write("                \n");
      out.write("                \n");
      out.write("                \n");
      out.write("                ");
 
                    ConectaEscuela conexion = new ConectaEscuela("jdbc:oracle:thin:@127.0.0.1:1521:XE", "ugarridobd", "udl123");
                    String ConsultaSQL = "Select * from ventas";
                    ResultSet rs = conexion.ejecutaSentencia(ConsultaSQL);
                    
                    ResultSetMetaData rsmd = rs.getMetaData();
                    
                    int col = rsmd.getColumnCount();
                    for(int k = 1;k <= col;k++){
                
      out.write("\n");
      out.write("                \n");
      out.write("                <td style=\"border: solid gray 1px;margin: 1%\">");
      out.print( rsmd.getColumnName(k));
      out.write("</td>\n");
      out.write("                ");
 
                    } while (rs.next()) {
                
      out.write("\n");
      out.write("            <tr style=\"text-align: center\">\n");
      out.write("                <td style=\"border: solid gray 1px;margin: 1%; color: #009846\"> ");
      out.print( rs.getString(1) );
      out.write(" </td> \n");
      out.write("                <td style=\"border: solid gray 1px;margin: 1%; color: #009846\"> ");
      out.print( rs.getString(2) );
      out.write(" </td> \n");
      out.write("                <td style=\"border: solid gray 1px;margin: 1%; color: #009846\"> ");
      out.print( rs.getString(3) );
      out.write(" </td> \n");
      out.write("                <td style=\"border: solid gray 1px;margin: 1%; color: #009846\"> ");
      out.print( rs.getString(4) );
      out.write(" </td> \n");
      out.write("                ");
 } 
      out.write("\n");
      out.write("            </tr>\n");
      out.write("            </tr>\n");
      out.write("        </table>\n");
      out.write("            <br><br>\n");
      out.write("            <a href=\"index.html\"><h5>Volver al Menu Principal</h5></a>\n");
      out.write("                </center>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("       \n");
      out.write("   \n");
      out.write("            \n");
      out.write("            \n");
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
