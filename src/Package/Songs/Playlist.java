package Package.Songs;

import Package.Songs.User_Behavior.User;

import java.util.ArrayList;

public class Playlist {

    private String title;
    ArrayList<Music> playlist = new ArrayList<>();
    User owner;


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

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
