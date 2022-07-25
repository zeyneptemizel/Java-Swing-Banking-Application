/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1306190045_zeyneptemizel;



import java.io.*;
import java.awt.GraphicsEnvironment;
import java.net.URISyntaxException;
public abstract class Console {
    
    public static void a() throws IOException, InterruptedException, URISyntaxException{
 try
        {  
         // We are running "dir" and "ping" command on cmd 
         Runtime.getRuntime().exec("cmd /c start cmd.exe /K \"echo acil durum protokoli başlatılıyor............\""); 
            
        } 
        catch (Exception e) 
        { 
            System.out.println(e); 
            e.printStackTrace(); 
        } 
    } 
}