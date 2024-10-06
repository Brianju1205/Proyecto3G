/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;
import java.sql.*;
/**
 *
 * @author juare
 */
public class JavaPostgreSQLBasic {
     /**
     * We establish the connection with the database <b>customerdb</b>.
     * Establecemos la conexión con la base de datos <b>customerdb</b>.
     */
    public void connectDatabase() {
        try {
            // We register the PostgreSQL driver
            // Registramos el driver de PostgresSQL
            try { 
                Class.forName("org.postgresql.Driver");
            } catch (ClassNotFoundException ex) {
                System.out.println("Error al registrar el driver de PostgreSQL: " + ex);
            }
            Connection connection = null;
            // Database connect
            // Conectamos con la base de datos
            connection = DriverManager.getConnection(
                    "jdbc:postgresql://192.168.0.26:5432/customerdb",
                    "xulescode", "1234");
 
            boolean valid = connection.isValid(50000);
            System.out.println(valid ? "TEST OK" : "TEST FAIL");
        } catch (java.sql.SQLException sqle) {
            System.out.println("Error: " + sqle);
        }
    } 
    /**
     * Testing Java PostgreSQL connection with host and port
     * Probando la conexión en Java a PostgreSQL especificando el host y el puerto.
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JavaPostgreSQLBasic javaPostgreSQLBasic = new JavaPostgreSQLBasic();
        javaPostgreSQLBasic.connectDatabase(); 
    }
}
