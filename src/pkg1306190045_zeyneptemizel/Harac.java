/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1306190045_zeyneptemizel;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import static pkg1306190045_zeyneptemizel.Musteri.username;

/**
 *
 * @author zeyne
 */
public   class Harac {
    
    public void method(){
           int fatura=0;
           int harac =10;
            String query= "SELECT fatura FROM logintable WHERE username= '" + username + "'";

      
        {
            Connection con;
        try {
            con = DriverManager.getConnection("jdbc:derby://localhost:1527/logindb","login","login" );
            Statement stmt1 = con.createStatement();
            ResultSet rs1 = stmt1.executeQuery(query);
            while(rs1.next()){
            fatura = rs1.getInt(1);
           }
            int guncel_fatura = fatura + harac;
            String query2= "UPDATE logintable SET fatura=" +guncel_fatura + " WHERE username='" + username + "'";
            stmt1.executeUpdate(query2);
                    
        } catch (SQLException ex) {
            Logger.getLogger(Harac.class.getName()).log(Level.SEVERE, null, ex);
        }
            
            
            
    
    
}
}
}
