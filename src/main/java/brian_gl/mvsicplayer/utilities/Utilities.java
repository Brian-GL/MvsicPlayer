/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Singleton.java to edit this template
 */
package brian_gl.mvsicplayer.utilities;

import com.sun.jna.platform.win32.Shell32;
import com.sun.jna.platform.win32.ShlObj;
import com.sun.jna.platform.win32.WinDef;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import net.coobird.thumbnailator.Thumbnails;

/**
 *
 * @author LENOVO
 */
public class Utilities {
    
    private Utilities() {
    }
    
    public static Utilities getInstance() {
        return UtilitiesHolder.INSTANCE;
    }
    
    private static class UtilitiesHolder {

        private static final Utilities INSTANCE = new Utilities();
    }
    
    public static String getMusicPath(){
        char[] pszPath = new char[WinDef.MAX_PATH];
        Shell32.INSTANCE.SHGetFolderPath(null, ShlObj.CSIDL_MYMUSIC, null, ShlObj.SHGFP_TYPE_CURRENT, pszPath);
        File musicPath = new File(String.valueOf(pszPath).trim());
        
        return musicPath.getAbsolutePath();
    }
    
    public static String secondsFomat(int value) {
        int absolute = Math.abs(value / 1000);
        int hours = (absolute / 3600);
        int minutes = ((absolute % 3600) / 60);
        int seconds = (absolute % 60);
        String format = String.format("%02d:%02d:%02d", hours, minutes, seconds);
        return concat("<html><b><i>", format, "</i><b></html>");
    }
    
    public static String bHtml(String value){
        return value != null && !value.isBlank() ? concat("<html><b>", value, "</b></html>") : "<html><b>?</b></html>";
    }
    
    public static String iHtml(String value){
        return value != null && !value.isBlank() ? concat("<html><i>", value, "</i></html>") : "<html><i>?</i></html>";
    }
    
    public static String concat(String cadena, String... args) {
        StringBuilder constructor_Cadena = new StringBuilder(cadena);
        for (String arg : args) {
            constructor_Cadena.append(arg);
        }
        return constructor_Cadena.toString();
    }
    
    public static BufferedImage resize(BufferedImage img, int newW, int newH) {
        try {
            return Thumbnails.of(img).forceSize(newW, newH).asBufferedImage();
        } catch (IOException ex) {
            //ERROR MESSAGE
        }
        
        return null;
    }
    
}
