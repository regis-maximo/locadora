/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connection;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author regis
 */
public class ConnectionFactory {

    String user = "root";
    String pass = "";
    String driver = "com.mysql.jdbc.Driver";
    String url = "jdbc:mysql://localhost:3306/locadora";
    Connection con = null;

    public Connection conecta() {

        try {
            Class.forName(driver);

        } catch (ClassNotFoundException ex) {
            System.err.println("Driver não encontrado: " + ex.getMessage());
        }
        try {
            con = DriverManager.getConnection(url, user, pass);
            

        } catch (SQLException ex) {
            System.out.println("Erro na conexão: " + ex.getMessage());
        }
        return con;
    }
    
    public static void desconecta(Connection con, PreparedStatement ps) {
        try {
            con.close();
            ps.close();
            
        } catch (HeadlessException | SQLException e) {
            System.err.println("Driver não encontrado: " + e.getMessage());
        }
    }
}

