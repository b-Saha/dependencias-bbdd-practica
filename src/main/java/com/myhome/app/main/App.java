package com.myhome.app.main;

import java.sql.SQLException;
import com.myhome.app.DATABASE.conexion;

/**
 * Hello world!
 *
 */
public class App 
{
     public static void main (String [] args) {

        try (var establecer_conexion = conexion.connect()) {
            System.out.println("Se ha establecido conexión con la base de datos");
        }catch(SQLException e) {
            System.err.println(e.getMessage());
        }
    }
}
