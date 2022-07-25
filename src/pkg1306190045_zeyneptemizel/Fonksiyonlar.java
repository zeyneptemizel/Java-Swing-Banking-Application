/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1306190045_zeyneptemizel;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author zeyne
 */
public class Fonksiyonlar {
    interface Back{
    public void back();
    public void back(int a);
    }
    interface Kapa{
    public void kapa();
    }
    interface sql{
    public abstract Connection connectdb();
    }
    
    
    
    }
