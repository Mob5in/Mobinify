package Package.Songs;

import Package.Songs.User_Behavior.User;

import java.util.ArrayList;

public class Playlist {

    //fields
    private String title;
    ArrayList<Music> playlist = new ArrayList<>();
    User owner;



    //methods
    public Playlist(String title, User owner) {
        this.title = title;
        this.owner = owner;
    }

    public void editTitle(String newTitle, String password){

    }

    public void addMusic(Music music, String  password){

    }

    public void removeMusic(Music music, String password){

    }
    public ArrayList<Music> searchInPlaylist(){

        return;
    }


    public void playPlaylist(){

    }

    //getters
    public String getTitle() {return title;}

    //setters
    public void setTitle(String title) {this.title = title;}
}
