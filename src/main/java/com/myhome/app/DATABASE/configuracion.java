package com.myhome.app.DATABASE;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * Clase para cargar los datos del fichero en el
 * stream 
 * 
 * 
 */

public class configuracion {
    private static final Properties propiedades = new Properties();
    static {
        //se guarda en input todos los datos que se encuentren en el fichero db.properties
        try {
            InputStream input = configuracion.class.getClassLoader().getResourceAsStream("db.properties");
            if(input == null) {
                //si es null, no se han encontrado los datos en el fichero, y se sale del programa. El 1 indica un error no recuperable
                System.out.println("Ha ocurrido un error. Ha sido imposible encontrar el fichero db.properties");
                System.exit(1);
            }else {
                //si no es null, se cargan los datos en el objeto propiedades. Los interpreta como propiedades clave-valor
                propiedades.load(input);
            }

        }catch (IOException exception) {
            exception.printStackTrace();
        }
    }
    
    public static String getUrl() {
        return propiedades.getProperty("db.url");
    }

    public static String getUsername() {
        return propiedades.getProperty("db.username");
    }

    public static String getPassword() {
        return propiedades.getProperty("db.password");
    }
}
