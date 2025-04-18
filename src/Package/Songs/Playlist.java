package Package.Songs;

import Package.Songs.Exceptions.InvalidOperationException;
import Package.Songs.User_Behavior.User;
import java.util.ArrayList;
import java.util.Objects;


public class Playlist {

    //fields
    private String title;
    private ArrayList<Music> playlist = new ArrayList<>();
    User owner;


    //methods
    public Playlist(String title, User owner) {
        this.title = title;
        this.owner = owner;
    }

    public void editTitle(String newTitle, String password) throws InvalidOperationException {

        if(!Objects.equals(owner.getPassword(), password)){
            throw new InvalidOperationException("Wrong password");
        }

        this.setTitle(newTitle);
    }


    public void addMusic(Music music, String  password) throws InvalidOperationException {
        if(!Objects.equals(this.owner.getPassword(), password)){
            throw new InvalidOperationException("Wrong password");
        }

        playlist.add(music);
    }

    public void removeMusic(Music music, String password) throws InvalidOperationException {

        if(!Objects.equals(this.owner.getPassword(), password)){
            throw new InvalidOperationException("Wrong password");
        }

        if(this.playlist.contains(music)){
            this.playlist.remove(music);
        }else{
            throw new InvalidOperationException("the music is not in the play list at all");
        }
    }


    public ArrayList<Music> searchInPlaylist(String title) throws InvalidOperationException {

        ArrayList<Music> findedMusic = new ArrayList<>();
        for(Music music: this.playlist){
            if(Objects.equals(music.getTitle(), title)){
                findedMusic.add(music);
            }
        }

        if(findedMusic.isEmpty()){
            throw new InvalidOperationException("The music you are looking for is not in the playlist");
        }

        return findedMusic;
    }


    public Music searchInPlaylist(String title, String singer) throws InvalidOperationException {

        for(Music music: this.playlist){
            if(Objects.equals(music.getTitle(), title) && Objects.equals(singer, music.getSinger().getUsername())){
                return music;
            }
        }

        throw new InvalidOperationException("The music you are looking for we don't have");
    }


    public void playPlaylist(){

        for(Music music: this.playlist){
            Music.play(music);
        }
    }

    //getters
    public String getTitle() {return title;}

    //setters
    public void setTitle(String title) {this.title = title;}
}
