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
    
    public String LabelTitleText(){
        
        String word;
        
        switch(getLanguage()){
            case SPANISH:
                word = "<html><b>Título</b></html>";
            break;
            case ENGLISH:
                word = "<html><b>Title</b></html>";
            break;
            default:
                word = "?";
            break;
        }
        
        return word;
    }
    
    public String LabelTitleTooltipText(){
        
        String word;
        
        switch(getLanguage()){
            case SPANISH:
                word = "<html><b>Título de la canción</i></html>";
            break;
            case ENGLISH:
                word = "<html><i>Song's title</i></html>";
            break;
            default:
                word = "?";
            break;
        }
        
        return word;
    }
    
    public String LabelArtistAlbumText(){
        
        String word;
        
        switch(getLanguage()){
            case SPANISH:
                word = "<html>Artista - <i>Álbum</i></html>";
            break;
            case ENGLISH:
                word = "<html>Artist - <i>Album</i></html>";
            break;
            default:
                word = "?";
            break;
        }
        
        return word;
    }
    
    public String LabelArtistAlbumTooltipText(){
        
        String word;
        
        switch(getLanguage()){
            case SPANISH:
                word = "<html><i>Artista y álbum referente de la canción</i></html>";
            break;
            case ENGLISH:
                word = "<html><i>Song's artist and album</i></html>";
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
    
    public String LabelBrandTooltipText(){
        
        String word;
        
        switch(getLanguage()){
            case SPANISH:
                word = "<html><i>Acerca de <b>Mvsic Player</b></i></html>";
            break;
            case ENGLISH:
                word = "<html><i>About <b>Mvsic Player</b></i></html>";
            break;
            default:
                word = "?";
            break;
        }
        
        return word;
    }
    
    // </editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc="Menu Items">
    
    public String MenuItemOpenFilesText(){
        
        String word;
        
        switch(getLanguage()){
            case SPANISH:
                word = "<html><b>Abrir Archivo(s)</b></html>";
            break;
            case ENGLISH:
                word = "<html><b>Open File(s)</b></html>";
            break;
            default:
                word = "?";
            break;
        }
        
        return word;
    }
    
    public String MenuItemOpenFilesTooltipText(){
        
        String word;
        
        switch(getLanguage()){
            case SPANISH:
                word = "<html><i>Seleccionar archivos de música para reproducir</i></html>";
            break;
            case ENGLISH:
                word = "<html><i>Select music files to play</i></html>";
            break;
            default:
                word = "?";
            break;
        }
        
        return word;
    }
    
    public String MenuItemOpenFolderText(){
        
        String word;
        
        switch(getLanguage()){
            case SPANISH:
                word = "<html><b>Abrir Carpeta</b></html>";
            break;
            case ENGLISH:
                word = "<html><b>Open Folder</b></html>";
            break;
            default:
                word = "?";
            break;
        }
        
        return word;
    }
    
    public String MenuItemOpenFolderTooltipText(){
        
        String word;
        
        switch(getLanguage()){
            case SPANISH:
                word = "<html><i>Seleccionar carpeta para reproducir archivos dentro de esta</i></html>";
            break;
            case ENGLISH:
                word = "<html><i>Select folder to play music files in it</i></html>";
            break;
            default:
                word = "?";
            break;
        }
        
        return word;
    }
    
    
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Menus">
    
    public String MenuFileText(){
        
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
    
    public String MenuFileTooltipText(){
        
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
    
    public String MenuPreferencesText(){
     
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
    
    public String MenuPreferencesTooltipText(){
        
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
    
    // <editor-fold defaultstate="collapsed" desc="Menu Buttons">
    
    public String ButtonSongsText(){
        
        String word;
        
        switch(getLanguage()){
            case SPANISH:
                word = "<html>Canciones</html>";
            break;
            case ENGLISH:
                word = "<html>Songs</html>";
            break;
            default:
                word = "?";
            break;
        }
        
        return word;
    }
    
    public String ButtonSongsTooltipText(){
        
        String word;
        
        switch(getLanguage()){
            case SPANISH:
                word = "<html><i>Mostrar las canciones cargadas</i></html>";
            break;
            case ENGLISH:
                word = "<html><i>Show load songs</i></html>";
            break;
            default:
                word = "?";
            break;
        }
        
        return word;
    }
    
    public String ButtonArtistsText(){
        
        String word;
        
        switch(getLanguage()){
            case SPANISH:
                word = "<html>Artistas</html>";
            break;
            case ENGLISH:
                word = "<html>Artists</html>";
            break;
            default:
                word = "?";
            break;
        }
        
        return word;
    }
    
    public String ButtonArtistsTooltipText(){
        
        String word;
        
        switch(getLanguage()){
            case SPANISH:
                word = "<html><i>Mostrar l@as artistas cargad@s</i></html>";
            break;
            case ENGLISH:
                word = "<html><i>Show load artist</i></html>";
            break;
            default:
                word = "?";
            break;
        }
        
        return word;
    }
    
    public String ButtonAlbumsText(){
        
        String word;
        
        switch(getLanguage()){
            case SPANISH:
                word = "<html>Álbumes</html>";
            break;
            case ENGLISH:
                word = "<html>Albums</html>";
            break;
            default:
                word = "?";
            break;
        }
        
        return word;
    }
    
    public String ButtonAlbumsTooltipText(){
        
        String word;
        
        switch(getLanguage()){
            case SPANISH:
                word = "<html><i>Mostrar los albumes cargados</i></html>";
            break;
            case ENGLISH:
                word = "<html><i>Show load albums</i></html>";
            break;
            default:
                word = "?";
            break;
        }
        
        return word;
    }
    
    public String ButtonGenresText(){
        
        String word;
        
        switch(getLanguage()){
            case SPANISH:
                word = "<html>Géneros</html>";
            break;
            case ENGLISH:
                word = "<html>Genres</html>";
            break;
            default:
                word = "?";
            break;
        }
        
        return word;
    }
    
    public String ButtonGenresTooltipText(){
        
        String word;
        
        switch(getLanguage()){
            case SPANISH:
                word = "<html><i>Mostrar los géneros cargados</i></html>";
            break;
            case ENGLISH:
                word = "<html><i>Show load genres</i></html>";
            break;
            default:
                word = "?";
            break;
        }
        
        return word;
    }
    
    public String ButtonPlaylistsText(){
        
        String word;
        
        switch(getLanguage()){
            case SPANISH:
                word = "<html>Listas</html>";
            break;
            case ENGLISH:
                word = "<html>Playlists</html>";
            break;
            default:
                word = "?";
            break;
        }
        
        return word;
    }
    
    public String ButtonPlaylistsTooltipText(){
        
        String word;
        
        switch(getLanguage()){
            case SPANISH:
                word = "<html><i>Mostrar las listas de reproducción</i></html>";
            break;
            case ENGLISH:
                word = "<html><i>Show playlists</i></html>";
            break;
            default:
                word = "?";
            break;
        }
        
        return word;
    }
    
    // </editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc="File Chooser">
    
    public String FileChooserDialogTitleText(){
        
        String word;
        
        switch(getLanguage()){
            case SPANISH:
                word = "Explorar Archivos";
            break;
            case ENGLISH:
                word = "Explore Files";
            break;
            default:
                word = "?";
            break;
        }
        
        return word;
    }
    
    public String FileChooserApproveButtonText(){
        
        String word;
        
        switch(getLanguage()){
            case SPANISH:
                word = "Seleccionar archivo(s) de música";
            break;
            case ENGLISH:
                word = "Select music file(s)";
            break;
            default:
                word = "?";
            break;
        }
        
        return word;
    }
    
    public String FileNameExtensionFilterText(){
        String word;
        
        switch(getLanguage()){
            case SPANISH:
                word = "Archivos de música";
            break;
            case ENGLISH:
                word = "Music Files";
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
