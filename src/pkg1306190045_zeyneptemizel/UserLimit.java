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
public class UserLimit {
    private String isim;
    private int limit;
    
    public UserLimit(int limit,String isim){
    this.limit=limit;
    this.isim=isim;
    }
    public String getisim(){
    return isim;
    }
    public int getlimit(){
    return limit;}
}
