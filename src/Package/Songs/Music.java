package Package.Songs;

import Package.Songs.Exceptions.InvalidOperationException;
import Package.Songs.User_Behavior.User;

import java.util.ArrayList;
import java.util.Objects;

public class Music {

    //fields
    static ArrayList<Music> allMusics = new ArrayList<>();
    private String title;
    private User singer;
    private int numberOfStream;


    //methods
    public Music(String title, User singer){
        setTitle(title);
        setSinger(singer);
        allMusics.add(this);
    }

    public static void play(Music music){
        System.out.println("The "+music.title+" is playing");
        music.setNumberOfStream(1 + music.getNumberOfStream());
    }

    public static ArrayList<Music> search(String title) throws InvalidOperationException {
        ArrayList<Music> findedMusic = new ArrayList<>();
        for(Music music: allMusics){
            if(Objects.equals(music.title, title)){
                findedMusic.add(music);
            }
        }
        if(findedMusic.isEmpty()){
            throw new InvalidOperationException("The music you are looking for we don't have");
        }
        return findedMusic;
    }

    public static Music search(String title, String singer) throws InvalidOperationException {
        for(Music music: allMusics){
            if(Objects.equals(music.title, title) && Objects.equals(singer, music.getSinger().getUsername())){
                return music;
            }
        }
        throw new InvalidOperationException("The music you are looking for we don't have");
    }



    //getters
    public String getTitle() {return title;}
    public int getNumberOfStream() {return numberOfStream;}
    public User getSinger(){return this.singer;}

    //setters
    private void setSinger(User singer){this.singer = singer;}
    private void setTitle(String title) {this.title = title;}
    private void setNumberOfStream(int numberOfStream) {this.numberOfStream = numberOfStream;}
}
