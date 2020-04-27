/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.abal.arsipsuratkalawat;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author regina
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        // KONEKSI DATABASE (JANGAN KORE)
        GinaGlobal.setConnection("remotemysql.com", "3306","8vbZvACR5B","8vbZvACR5B", "N01E4WgIFN");
        //================================
        
        
        new GinaFormTes().setVisible(true);
        
    }
    
}
