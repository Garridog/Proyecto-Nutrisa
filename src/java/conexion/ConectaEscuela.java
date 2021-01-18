//claseconexion para todas las clasesdinamicas 
package conexion;

import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException; 


public class ConectaEscuela {

    private Connection cn;
    private Statement stmt;
    private ResultSet rs;
    
    //constructor
    public ConectaEscuela(String urlBd, String usuarioBd, String passwordBd)throws SQLException{
        DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
        cn=DriverManager.getConnection(urlBd, usuarioBd, passwordBd);
        stmt=cn.createStatement();
    }
    
    //Metodo para la sentencia SQL (consultas)
    public ResultSet ejecutaSentencia(String query)throws SQLException{
        rs=stmt.executeQuery(query);
        return rs;
    }
    
    //Metodo para la sentencia SQL (Actualizacion)
    public int ejecutaSentenciaUpdate(String SQL)throws SQLException{
        int cambios=stmt.executeUpdate(SQL);
        return cambios;
    }
}
