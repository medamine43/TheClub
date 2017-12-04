/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Mohamed
 */
public class SingletonConnection {
    private static Connection con;
    static{
        try {
            con = DriverManager.getConnection("jdbc:sqlserver://localhost\\DESKTOP-P21HP3C:1433;databaseName=stock;username=sa;password=jemapelamine-1");
        } catch (SQLException ex) {
            Logger.getLogger(SingletonConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
}
}
