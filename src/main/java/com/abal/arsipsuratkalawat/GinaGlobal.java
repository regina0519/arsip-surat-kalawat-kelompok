/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.abal.arsipsuratkalawat;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author regina
 */
public class GinaGlobal {
    private static Connection con;
    
    public static Connection setConnection(String host, String port, String db, String user, String pass){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://"+host+":"+port+"/"+db,user,pass);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(GinaGlobal.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(GinaGlobal.class.getName()).log(Level.SEVERE, null, ex);
        }
        return con;
    }
    
    public static Connection getConnection(){
        return con;
    }
}
