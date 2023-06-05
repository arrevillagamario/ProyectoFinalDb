/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto_bd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author USER
 */
public class conexion 
{  
    static Connection conn = null;
    public static Connection conectar() 
    {
        String url = "jdbc:sqlserver://localhost:1433;databaseName=bd_prueba;";
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            JOptionPane.showMessageDialog(null,"CONEXION A SQL SERVER EXITOSA");

        } catch (ClassNotFoundException e) {
            System.out.println("ERROR DE SQL" + e.getMessage());
        }
        try {
            conn = DriverManager.getConnection(url, "usersql", "123");
            System.out.println("CONEXION DEL DRIVER EXITOSA");

        } catch (SQLException e) {
            System.err.println("ERROR DE CONEXION DEL DRIVER " + e.getMessage());
        }
        return conn;
    }      
}
