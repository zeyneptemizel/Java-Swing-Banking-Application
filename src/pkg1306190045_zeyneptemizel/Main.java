/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1306190045_zeyneptemizel;

/**
 *
 * @author zeyne
 */
public class Main extends Music{ // soyut sınıfı extendliyor
    /**
     * @param args the command line arguments
     */
    
    public Main() {
        
       super();   // super kullanarak muzik classinin cons. cagirararak ordaki playMusic metodunu calistiriyrum.
    }

    public static void main(String[] args) {
        new Banka().setVisible(true);
        Main m = new Main();

    }
    
 
    
}
