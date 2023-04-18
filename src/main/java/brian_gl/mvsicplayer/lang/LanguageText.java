/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package brian_gl.mvsicplayer.lang;

/**
 *
 * @author LENOVO
 */
public class LanguageText {
    
    
    private Language _Language;
    
    public LanguageText(Language usedLanguage){ this._Language = usedLanguage; }
    
    public String MenuItemFiles(){
        
        String word;
        
        switch(_Language){
            case SPANISH:
                word = "<html><b>Archivo</b></html>";
            break;
            case ENGLISH:
                word = "<html><b>File</b></html>";
            break;
            default:
                word = "?";
            break;
        }
        
        return word;
    }
    
    public String MenuItemFilesTooltip(){
        
        String word;
        
        switch(_Language){
            case SPANISH:
                word = "<html><u>Abrir archivo(s) para reproducir</u></html>";
            break;
            case ENGLISH:
                word = "<html><u>Open file(s) to play</u></html>";
            break;
            default:
                word = "?";
            break;
        }
        
        return word;
        
    }
    
}
