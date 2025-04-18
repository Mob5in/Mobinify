package Package.Songs;

import Package.Songs.User_Behavior.User;

import java.util.ArrayList;

public class Music {

    static ArrayList<Music> allMusics;
    private String title;
    private User singer;
    private int numberOfStream;



    public static void play(Music music){
        System.out.println("The "+music.title+" is playing");
        music.setNumberOfStream(1 + music.getNumberOfStream());
    }

    public static void search(){

    }

    //getters
    public String getTitle() {return title;}
    public int getNumberOfStream() {return numberOfStream;}

    //setters
    public void setTitle(String title) {this.title = title;}
    public void setNumberOfStream(int numberOfStream) {this.numberOfStream = numberOfStream;}
}
