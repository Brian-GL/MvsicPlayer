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
        return switch (getLanguage()) {
            case SPANISH -> "<html><b>Título</b></html>";
            case ENGLISH -> "<html><b>Title</b></html>";
            default -> "?";
        };
    }
    
    public String LabelTitleTooltipText(){
        return switch (getLanguage()) {
            case SPANISH -> "<html><b>Título de la canción</i></html>";
            case ENGLISH -> "<html><i>Song's title</i></html>";
            default -> "?";
        };
    }
    
    public String LabelArtistAlbumText(){
        return switch (getLanguage()) {
            case SPANISH -> "<html>Artista - <i>Álbum</i></html>";
            case ENGLISH -> "<html>Artist - <i>Album</i></html>";
            default -> "?";
        };
    }
    
    public String LabelArtistAlbumTooltipText(){
        return switch (getLanguage()) {
            case SPANISH -> "<html><i>Artista y álbum referente de la canción</i></html>";
            case ENGLISH -> "<html><i>Song's artist and album</i></html>";
            default -> "?";
        };
    }
    
    public String LabelProgressTooltipText(){
        return switch (getLanguage()) {
            case SPANISH -> "<html><i>Progreso de la canción</i></html>";
            case ENGLISH -> "<html><i>Song's progress</i></html>";
            default -> "?";
        };
    }
    
    public String LabelDurationTooltipText(){
        return switch (getLanguage()) {
            case SPANISH -> "<html><i>Duración total de la canción</i></html>";
            case ENGLISH -> "<html><i>Song's total duration</i></html>";
            default -> "?";
        };
    }
    
    public String LabelPreviousTrackTooltipText(){
        return switch (getLanguage()) {
            case SPANISH -> "<html><b>Reproducir canción anterior</i></html>";
            case ENGLISH -> "<html><i>Play previous track</i></html>";
            default -> "?";
        };
    }
    
    public String LabelNextTrackTooltipText(){
        return switch (getLanguage()) {
            case SPANISH -> "<html><b>Reproducir siguiente canción</i></html>";
            case ENGLISH -> "<html><i>Play next track</i></html>";
            default -> "?";
        };
    }
    
    public String LabelBrandTooltipText(){
        return switch (getLanguage()) {
            case SPANISH -> "<html><i>Acerca de <b>Mvsic Player</b></i></html>";
            case ENGLISH -> "<html><i>About <b>Mvsic Player</b></i></html>";
            default -> "?";
        };
    }
    
    public String LabelPlayPauseTooltipText(){
        return switch (getLanguage()) {
            case SPANISH -> "<html><b>Reproducir / Pausar</i></html>";
            case ENGLISH -> "<html><i>Play / Pause</i></html>";
            default -> "?";
        };
    }
    
    public String LabelStopTooltipText(){
        return switch (getLanguage()) {
            case SPANISH -> "<html><b>Detener reproducción</i></html>";
            case ENGLISH -> "<html><i>Stop player</i></html>";
            default -> "?";
        };
    }
    
    public String LabelMenuTooltipText(){
        return switch (getLanguage()) {
            case SPANISH -> "<html><b>Mostrar/Ocultar opciones del menú</i></html>";
            case ENGLISH -> "<html><i>Show/Hide menu options</i></html>";
            default -> "?";
        };
    }
    
    public String LabelInterfacePlayerTooltipText(){
        return switch (getLanguage()) {
            case SPANISH -> "<html><b>Mostrar/Ocultar opciones del reproductor de música</i></html>";
            case ENGLISH -> "<html><i>Show/Hide music player options</i></html>";
            default -> "?";
        };
    }
    
    public String LabelGenreText(){
        return switch (getLanguage()) {
            case SPANISH -> "<html><b>Género</b></html>";
            case ENGLISH -> "<html><b>Genre</b></html>";
            default -> "?";
        };
    }
    
    public String LabelGenreTooltipText(){
        return switch (getLanguage()) {
            case SPANISH -> "<html><b>Género de la canción</i></html>";
            case ENGLISH -> "<html><i>Song's genre</i></html>";
            default -> "?";
        };
    }
    
    public String LabelYearText(){
        return switch (getLanguage()) {
            case SPANISH -> "<html><b>Año</b></html>";
            case ENGLISH -> "<html><b>Year</b></html>";
            default -> "?";
        };
    }
    
    public String LabelYearTooltipText(){
        return switch (getLanguage()) {
            case SPANISH -> "<html><b>Año de lanzamiento de la canción</i></html>";
            case ENGLISH -> "<html><i>Song's release year</i></html>";
            default -> "?";
        };
    }
    
    public String LabelTrackCountTooltipText(){
        return switch (getLanguage()) {
            case SPANISH -> "<html><b>Índice actual de reproducción vs total de canciones importadas</i></html>";
            case ENGLISH -> "<html><i>Current play rate vs total imported songs</i></html>";
            default -> "?";
        };
    }
    
    // </editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc="Menu Items">
    
    public String MenuItemOpenFilesText(){
        return switch (getLanguage()) {
            case SPANISH -> "<html><b>Abrir Archivo(s)</b></html>";
            case ENGLISH -> "<html><b>Open File(s)</b></html>";
            default -> "?";
        };
    }
    
    public String MenuItemOpenFilesTooltipText(){
        return switch (getLanguage()) {
            case SPANISH -> "<html><i>Seleccionar archivos de música para reproducir</i></html>";
            case ENGLISH -> "<html><i>Select music files to play</i></html>";
            default -> "?";
        };
    }
    
    public String MenuItemOpenFolderText(){
        return switch (getLanguage()) {
            case SPANISH -> "<html><b>Abrir Carpeta</b></html>";
            case ENGLISH -> "<html><b>Open Folder</b></html>";
            default -> "?";
        };
    }
    
    public String MenuItemOpenFolderTooltipText(){
        return switch (getLanguage()) {
            case SPANISH -> "<html><i>Seleccionar carpeta para reproducir archivos dentro de esta</i></html>";
            case ENGLISH -> "<html><i>Select folder to play music files in it</i></html>";
            default -> "?";
        };
    }
    
    
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Menus">
    
    public String MenuFileText(){
        return switch (getLanguage()) {
            case SPANISH -> "<html><b>Archivo</b></html>";
            case ENGLISH -> "<html><b>File</b></html>";
            default -> "?";
        };
    }
    
    public String MenuFileTooltipText(){
        return switch (getLanguage()) {
            case SPANISH -> "<html><i>Abrir archivo(s) para reproducir</i></html>";
            case ENGLISH -> "<html><i>Open file(s) to play</i></html>";
            default -> "?";
        };
    }
    
    public String MenuPreferencesText(){
        return switch (getLanguage()) {
            case SPANISH -> "<html><b>Preferencias</b></html>";
            case ENGLISH -> "<html><b>Preferences</b></html>";
            default -> "?";
        };
    }
    
    public String MenuPreferencesTooltipText(){
        return switch (getLanguage()) {
            case SPANISH -> "<html><i>Mis preferencias de customización del reproductor</i></html>";
            case ENGLISH -> "<html><i>My player customization preferences</i></html>";
            default -> "?";
        };
    }
    
    public String MenuLanguageText(){
        return switch (getLanguage()) {
            case SPANISH -> "<html><b>Idioma</b></html>";
            case ENGLISH -> "<html><b>Language</b></html>";
            default -> "?";
        };
    }
    
    public String MenuLanguageTooltipText(){
        return switch (getLanguage()) {
            case SPANISH -> "<html><i>Seleccionar/cambiar idioma</i></html>";
            case ENGLISH -> "<html><i>Select/change language</i></html>";
            default -> "?";
        };
    }
    
    public String MenuFontText(){
        return switch (getLanguage()) {
            case SPANISH -> "<html><b>Fuente</b></html>";
            case ENGLISH -> "<html><b>Font</b></html>";
            default -> "?";
        };
    }
    
    public String MenuFontTooltipText(){
        return switch(getLanguage()){
            case SPANISH -> "<html><i>Seleccionar/cambiar fuente</i></html>";
            case ENGLISH -> "<html><i>Select/change font</i></html>";
            default -> "?";  
        };
    }
    
    
    // </editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc="Menu Buttons">
    
    public String ButtonSongsText(){
        return switch(getLanguage()){
            case SPANISH -> "<html>Canciones</html>"; 
            case ENGLISH -> "<html>Songs</html>";
            default -> "?";
        };
    }
    
    public String ButtonSongsTooltipText(){
        return switch(getLanguage()){
            case SPANISH -> "<html><i>Mostrar las canciones cargadas</i></html>"; 
            case ENGLISH -> "<html><i>Show load songs</i></html>";
            default -> "?";
        };
    }
    
    public String ButtonArtistsText(){
        return switch(getLanguage()){
            case SPANISH -> "<html>Artistas</html>";
            case ENGLISH -> "<html>Artists</html>";
            default -> "?";
        };
    }
    
    public String ButtonArtistsTooltipText(){
        return switch(getLanguage()){
            case SPANISH -> "<html><i>Mostrar l@as artistas cargad@s</i></html>";
            case ENGLISH -> "<html><i>Show load artist</i></html>";
            default -> "?";
        };
    }
    
    public String ButtonAlbumsText(){
        return switch(getLanguage()){
            case SPANISH -> "<html>Álbumes</html>";
            case ENGLISH -> "<html>Albums</html>"; 
            default -> "?"; 
        };
    }
        
    public String ButtonAlbumsTooltipText(){
        return switch(getLanguage()){
            case SPANISH -> "<html><i>Mostrar los albumes cargados</i></html>";
            case ENGLISH -> "<html><i>Show load albums</i></html>";
            default -> "?";  
        };
    }
    
    public String ButtonGenresText(){
        return switch(getLanguage()){
            case SPANISH -> "<html>Géneros</html>";
            case ENGLISH -> "<html>Genres</html>";
            default -> "?";  
        };
    }
    
    public String ButtonGenresTooltipText(){
        return switch(getLanguage()){
            case SPANISH -> "<html><i>Mostrar los géneros cargados</i></html>";
            case ENGLISH -> "<html><i>Show load genres</i></html>";
            default -> "?";  
        };
    }
    
    public String ButtonPlaylistsText(){
        return switch(getLanguage()){
            case SPANISH -> "<html>Listas</html>";
            case ENGLISH -> "<html>Playlists</html>";
            default -> "?";  
        };
    }
    
    public String ButtonPlaylistsTooltipText(){
        return switch(getLanguage()){
            case SPANISH -> "<html><i>Mostrar las listas de reproducción</i></html>";
            case ENGLISH -> "<html><i>Show playlists</i></html>";
            default -> "?";  
        };
    }
    
    // </editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc="File Chooser">
    
    public String FileChooserDialogTitleText(){
        return switch(getLanguage()){
            case SPANISH -> "Explorar Archivos";
            case ENGLISH -> "Explore Files";
            default -> "?";
        };
    }
    
    public String FileChooserApproveButtonText(){
        return switch(getLanguage()){
            case SPANISH -> "Seleccionar archivo(s) de música";
            case ENGLISH -> "Select music file(s)";
            default -> "?";  
        };
    }
    
    public String FileNameExtensionFilterText(){
        return switch(getLanguage()){
            case SPANISH -> "Archivos de música";
            case ENGLISH -> "Music Files";
            default -> "?";  
        };
    }
    
    // </editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc="Extras">
    
    public String MetadataUnknownText(){
        return switch(getLanguage()){
            case SPANISH -> "<html>Desconocido</html>";
            case ENGLISH -> "<html>Unknown</html>";
            default -> "?";
        };
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
