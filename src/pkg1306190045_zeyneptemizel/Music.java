/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1306190045_zeyneptemizel;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import javax.swing.JOptionPane;
import sun.audio.AudioPlayer;
import sun.audio.AudioStream;

/**
 *
 * @author zeyne
 */
public class Music {
     static String musicpath;

    public Music () {
playMusic("a.wav");   
    }
public static void main (String [] args) {

    System.out.println(musicpath);

}
    
    
    public static void playMusic(String filepath){
    InputStream music;
    try{
    music = new FileInputStream(new File(filepath));
    AudioStream as = new AudioStream(music);
        AudioPlayer.player.start(as);
    
    }catch(Exception e)
    {
        JOptionPane.showMessageDialog(null,e);
    
    }
    }
}
