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
                word = "Archivo";
            break;
            case ENGLISH:
                word = "File";
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
                word = "Abrir archivo(s) para reproductir";
            break;
            case ENGLISH:
                word = "Open file(s) to play";
            break;
            default:
                word = "?";
            break;
        }
        
        return word;
        
    }
    
}
