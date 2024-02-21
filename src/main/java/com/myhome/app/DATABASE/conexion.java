package com.myhome.app.DATABASE;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Esta clase sirve para establecer conexión con la base de datos
 * @author Saha
 * @version 0.0
 */

public class conexion {
        //creamos una función que devuelve una conexión
        public static Connection connect() throws SQLException{
                try{
                        //obtenemos los datos para conectarnos a la base de datos desde la clase configuracion
                        var url = configuracion.getUrl();
                        var user = configuracion.getUsername();
                        var password = configuracion.getPassword();

                        //abrimos y devolvemos la conexion con driverManager
                        return DriverManager.getConnection(url, user, password);

                }catch(SQLException exception) {
                        System.err.println(exception.getMessage());
                        return null;
                }
        }
}
