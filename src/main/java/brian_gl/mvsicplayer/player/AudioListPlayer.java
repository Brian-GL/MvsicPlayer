/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package brian_gl.mvsicplayer.player;

import java.util.List;
import uk.co.caprica.vlcj.factory.MediaPlayerFactory;
import uk.co.caprica.vlcj.player.base.MediaPlayerEventListener;
import uk.co.caprica.vlcj.player.base.State;
import uk.co.caprica.vlcj.player.component.AudioListPlayerComponent;
import uk.co.caprica.vlcj.player.list.MediaListPlayerEventListener;

/**
 *
 * @author LENOVO
 */
public class AudioListPlayer {
    
    private final AudioListPlayerComponent _AudioListPlayerComponent;
    private final List<String> _Presets;
    
    public AudioListPlayer() throws UnsatisfiedLinkError{
        MediaPlayerFactory mediaPlayerFactory = new MediaPlayerFactory();
        
        _AudioListPlayerComponent = new AudioListPlayerComponent(mediaPlayerFactory);
        _AudioListPlayerComponent.mediaListPlayer().mediaPlayer().setMediaPlayer(mediaPlayerFactory.mediaPlayers().newMediaPlayer());
        _AudioListPlayerComponent.mediaListPlayer().mediaPlayer().mediaPlayer().audio().setEqualizer(mediaPlayerFactory.equalizer().newEqualizer("Flat"));
        
        _Presets = new MediaPlayerFactory().equalizer().presets();
    }

    public boolean addMedia(String route){
        return _AudioListPlayerComponent.mediaListPlayer().list().media().add(route);
    }
    
    public boolean clearPlaylist(){
        return _AudioListPlayerComponent.mediaListPlayer().list().media().clear();
    }
    
    public boolean isEmptyPlaylist(){
        return this.playListCount() < 1;
    }
    
    public int playListCount(){
        return _AudioListPlayerComponent.mediaListPlayer().list().media().count();
    }
    
    public void play(){
        if(this.playListCount() > 0 && !_AudioListPlayerComponent.mediaListPlayer().status().isPlaying()
                && !_AudioListPlayerComponent.mediaListPlayer().status().getMediaListPlayerState().equals(State.STOPPED)){
            _AudioListPlayerComponent.mediaListPlayer().controls().play();
        }
    }
    
    public boolean isPlaying(){
        return _AudioListPlayerComponent.mediaListPlayer().status().isPlaying();
    }
    
    public void pause(){
        if(this.playListCount() > 0 && _AudioListPlayerComponent.mediaListPlayer().status().isPlaying()
            && _AudioListPlayerComponent.mediaListPlayer().mediaPlayer().mediaPlayer().status().canPause()){
            _AudioListPlayerComponent.mediaListPlayer().controls().setPause(true);
        }
    }
    
    public void stop(){
        
        if(this.playListCount() > 0 && _AudioListPlayerComponent.mediaListPlayer().status().isPlaying()){
            _AudioListPlayerComponent.mediaListPlayer().controls().stop();
        }
    }
    
    public boolean previous(){
        return _AudioListPlayerComponent.mediaListPlayer().controls().playPrevious();
    }
    
    public boolean next(){
        return _AudioListPlayerComponent.mediaListPlayer().controls().playNext();
    }
    
    public void setEvent(MediaListPlayerEventListener listener){
        this._AudioListPlayerComponent.mediaListPlayer().events().addMediaListPlayerEventListener(listener);
    }
    
    public void setEvent(MediaPlayerEventListener listener){
        this._AudioListPlayerComponent.mediaListPlayer().mediaPlayer().mediaPlayer().events().addMediaPlayerEventListener(listener);
    }
    
    public float time(){
        return _AudioListPlayerComponent.mediaListPlayer().mediaPlayer().mediaPlayer().status().time();   
    }
    
    public long length(){
        return _AudioListPlayerComponent.mediaListPlayer().mediaPlayer().mediaPlayer().status().length();
    }
    
    public void setTime(long time){
        _AudioListPlayerComponent.mediaListPlayer().mediaPlayer().mediaPlayer().controls().setTime(time);
    }
    
    public void playIndex(int index){
        if(this.playListCount() > index && index > -1){
            _AudioListPlayerComponent.mediaListPlayer().controls().play(index);
        }
    }

    public List<String> presets() {
        return _Presets;
    }
    
    public void release(){
        this._AudioListPlayerComponent.release();
    }
}
