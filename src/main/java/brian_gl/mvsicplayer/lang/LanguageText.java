/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package brian_gl.mvsicplayer.lang;

import static brian_gl.mvsicplayer.lang.Language.ENGLISH;
import static brian_gl.mvsicplayer.lang.Language.SPANISH;

/**
 *
 * @author LENOVO
 */
public class LanguageText {
    
    private Language _Language;
    
    public LanguageText(){}
    
    // <editor-fold defaultstate="collapsed" desc="Labels">
    
    public String LabelTitleAlbumText(){
        
        String word;
        
        switch(getLanguage()){
            case SPANISH:
                word = "<html><b>Título</b> - <i>Álbum</i></html>";
            break;
            case ENGLISH:
                word = "<html><b>Title</b> - <i>Album</i></html>";
            break;
            default:
                word = "?";
            break;
        }
        
        return word;
    }
    
    public String LabelTitleAlbumTooltipText(){
        
        String word;
        
        switch(getLanguage()){
            case SPANISH:
                word = "<html><b>Título y álbum de la canción</i></html>";
            break;
            case ENGLISH:
                word = "<html><i>Song's title and album</i></html>";
            break;
            default:
                word = "?";
            break;
        }
        
        return word;
    }
    
    public String LabelArtistText(){
        
        String word;
        
        switch(getLanguage()){
            case SPANISH:
                word = "<html>Artista</html>";
            break;
            case ENGLISH:
                word = "<html>Artist</html>";
            break;
            default:
                word = "?";
            break;
        }
        
        return word;
    }
    
    public String LabelArtistTooltipText(){
        
        String word;
        
        switch(getLanguage()){
            case SPANISH:
                word = "<html><i>Artista de la canción</i></html>";
            break;
            case ENGLISH:
                word = "<html><i>Song's artist</i></html>";
            break;
            default:
                word = "?";
            break;
        }
        
        return word;
    }
    
    public String LabelDurationProgressTooltipText(){
        
        String word;
        
        switch(getLanguage()){
            case SPANISH:
                word = "<html><i>Progreso y duración total de la canción</i></html>";
            break;
            case ENGLISH:
                word = "<html><i>Song's progress and total duration</i></html>";
            break;
            default:
                word = "?";
            break;
        }
        
        return word;
    }
    
    public String LabelPreviousTrackTooltipText(){
        
        String word;
        
        switch(getLanguage()){
            case SPANISH:
                word = "<html><b>Reproducir canción anterior</i></html>";
            break;
            case ENGLISH:
                word = "<html><i>Play previous track</i></html>";
            break;
            default:
                word = "?";
            break;
        }
        
        return word;
    }
    
    public String LabelNextTrackTooltipText(){
        
        String word;
        
        switch(getLanguage()){
            case SPANISH:
                word = "<html><b>Reproducir siguiente canción</i></html>";
            break;
            case ENGLISH:
                word = "<html><i>Play next track</i></html>";
            break;
            default:
                word = "?";
            break;
        }
        
        return word;
    }
    
    // </editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc="Menu Items">
    
    public String MenuItemFileText(){
        
        String word;
        
        switch(getLanguage()){
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
    
    public String MenuItemFileTooltipText(){
        
        String word;
        
        switch(getLanguage()){
            case SPANISH:
                word = "<html><i>Abrir archivo(s) para reproducir</i></html>";
            break;
            case ENGLISH:
                word = "<html><i>Open file(s) to play</i></html>";
            break;
            default:
                word = "?";
            break;
        }
        
        return word;
    }
    
    public String MenuItemPreferencesText(){
     
        String word;
        
        switch(getLanguage()){
            case SPANISH:
                word = "<html><b>Preferencias</b></html>";
            break;
            case ENGLISH:
                word = "<html><b>Preferences</b></html>";
            break;
            default:
                word = "?";
            break;
        }
        
        return word;
    }
    
    public String MenuItemPreferencesTooltipText(){
        
        String word;
        
        switch(getLanguage()){
            case SPANISH:
                word = "<html><i>Mis preferencias de customización del reproductor</i></html>";
            break;
            case ENGLISH:
                word = "<html><i>My player customization preferences</i></html>";
            break;
            default:
                word = "?";
            break;
        }
        
        return word;
    }
    
    
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Menus">
    
    public String MenuLanguageText(){
        
        String word;
        
        switch(getLanguage()){
            case SPANISH:
                word = "<html><b>Idioma</b></html>";
            break;
            case ENGLISH:
                word = "<html><b>Language</b></html>";
            break;
            default:
                word = "?";
            break;
        }
        
        return word;
    }
    
    public String MenuLanguageTooltipText(){
        
        String word;
        
        switch(getLanguage()){
            case SPANISH:
                word = "<html><i>Seleccionar/cambiar idioma</i></html>";
            break;
            case ENGLISH:
                word = "<html><i>Select/change language</i></html>";
            break;
            default:
                word = "?";
            break;
        }
        
        return word;
    }
    
    public String MenuFontText(){
        
        String word;
        
        switch(getLanguage()){
            case SPANISH:
                word = "<html><b>Fuente</b></html>";
            break;
            case ENGLISH:
                word = "<html><b>Font</b></html>";
            break;
            default:
                word = "?";
            break;
        }
        
        return word;
    }
    
    public String MenuFontTooltipText(){
        
        String word;
        
        switch(getLanguage()){
            case SPANISH:
                word = "<html><i>Seleccionar/cambiar fuente</i></html>";
            break;
            case ENGLISH:
                word = "<html><i>Select/change font</i></html>";
            break;
            default:
                word = "?";
            break;
        }
        
        return word;
    }
    
    
    // </editor-fold>
    
    
    /**
     * @return the actual language
     */
    public Language getLanguage() {
        return _Language;
    }

    /**
     * @param _Language the language to set
     */
    public void setLanguage(Language _Language) {
        this._Language = _Language;
    }
}
