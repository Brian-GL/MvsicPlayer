/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package player;

import java.util.List;
import uk.co.caprica.vlcj.factory.MediaPlayerFactory;
import uk.co.caprica.vlcj.player.base.MediaPlayerEventListener;
import static uk.co.caprica.vlcj.player.base.State.PAUSED;
import static uk.co.caprica.vlcj.player.base.State.STOPPED;
import uk.co.caprica.vlcj.player.component.AudioListPlayerComponent;
import uk.co.caprica.vlcj.player.list.MediaListPlayerEventListener;

/**
 *
 * @author LENOVO
 */
public class AudioListPlayer {
    
    private AudioListPlayerComponent _AudioListPlayerComponent;
    private List<String> _Presets;
    
    public AudioListPlayer() throws UnsatisfiedLinkError{
        MediaPlayerFactory mediaPlayerFactory = new MediaPlayerFactory();
        
        _AudioListPlayerComponent = new AudioListPlayerComponent(mediaPlayerFactory);
        _AudioListPlayerComponent.mediaListPlayer().mediaPlayer().setMediaPlayer(mediaPlayerFactory.mediaPlayers().newMediaPlayer());
        _AudioListPlayerComponent.mediaListPlayer().mediaPlayer().mediaPlayer().audio().setEqualizer(mediaPlayerFactory.equalizer().newEqualizer("Flat"));
        
        _Presets = new MediaPlayerFactory().equalizer().presets();
    }

    public AudioListPlayerComponent getAudioListPlayer() {
        return _AudioListPlayerComponent;
    }
    
    public boolean addMedia(String route){
        return _AudioListPlayerComponent.mediaListPlayer().list().media().add(route);
    }
    
    public boolean clearPlaylist(){
        return _AudioListPlayerComponent.mediaListPlayer().list().media().clear();
    }
    
    public void play(){
        if(_AudioListPlayerComponent.mediaListPlayer().list().media().count() > 0
                && !_AudioListPlayerComponent.mediaListPlayer().status().isPlaying()){
            _AudioListPlayerComponent.mediaListPlayer().controls().play();
        }
    }
    
    public void pause(){
        if(_AudioListPlayerComponent.mediaListPlayer().list().media().count() > 0
                && _AudioListPlayerComponent.mediaListPlayer().status().isPlaying()){
            _AudioListPlayerComponent.mediaListPlayer().controls().setPause(true);
        }
    }
    
    public void stop(){
        
        if(_AudioListPlayerComponent.mediaListPlayer().list().media().count() > 0 && 
                _AudioListPlayerComponent.mediaListPlayer().status().isPlaying()){
            _AudioListPlayerComponent.mediaListPlayer().controls().stop();
            
        }
    }
    
    public void setEvent(MediaListPlayerEventListener listener){
        this._AudioListPlayerComponent.mediaListPlayer().events().addMediaListPlayerEventListener(listener);
    }
    
    public void setEvent(MediaPlayerEventListener listener){
        this._AudioListPlayerComponent.mediaListPlayer().mediaPlayer().mediaPlayer().events().addMediaPlayerEventListener(listener);
    }
    
    public void release(){
        this._AudioListPlayerComponent.release();
    }

    public List<String> getPresets() {
        return _Presets;
    }
}
