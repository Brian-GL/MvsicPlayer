/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Singleton.java to edit this template
 */
package utilities;

import com.sun.jna.platform.win32.Shell32;
import com.sun.jna.platform.win32.ShlObj;
import com.sun.jna.platform.win32.WinDef;
import java.io.File;

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
}
