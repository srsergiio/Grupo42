/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package accesoDatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {

    private final String URL;
    private final String DB;
    private final String USUARIO;
    private static String PASSWORD;
    private static Connection connection;

    public Conexion(String URL, String DB, String USUARIO, String PASSWORD) {
        this.URL = URL;
        this.DB = DB;
        this.USUARIO = USUARIO;
        Conexion.PASSWORD = PASSWORD;
        Conexion.connection = getConexion();
    }

    public static Connection getConexion() {
        try {
            if (connection == null || connection.isClosed()) {
                connection = DriverManager.getConnection(URL, USUARIO, PASSWORD);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }
}
