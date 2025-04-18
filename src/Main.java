import Package.Songs.*;
import Package.Songs.Exceptions.InvalidOperationException;
import Package.Songs.User_Behavior.User;

import java.util.TreeMap;


public class Main {
    public static void main(String[] args) throws InvalidOperationException {

        try{
            User Mobin = new User("Mobin", "123");
        }catch (InvalidOperationException e){
            System.out.println("Error: "+e.getMessage());
        }
        System.out.println("----------------------------------\n");

        User Mobin = new User("Mobin", "123456789");
        System.out.println("User Mobin created");
        User Negar = new User("Negar", "123456789");
        System.out.println("User Negar created\n");

        try {
            User duplicate = new User("Negar", "123456789");
        }catch (InvalidOperationException e){
            System.out.println("Error: "+e.getMessage());
        }

        System.out.println("----------------------------------\n");

        Music Song1 = new Music("Van Gogh", Mobin);
        Music Song2 = new Music("Underneath the ocean", Mobin);
        Music Song3 = new Music("Maybe", Negar);
        Music Song4 = new Music("Underneath the ocean", Negar);
        System.out.println("songs created");

        System.out.println("----------------------------------\n");

        Mobin.follow(Negar);
        System.out.println("Mobin followed Negar");
        try {
            Mobin.follow(Negar);
        } catch (InvalidOperationException e) {
            System.out.println("Error: "+e.getMessage());
        }
        System.out.println("Mobin followers:" +  Mobin.getFollowerList().size());
        System.out.println("Mobin followings:" +  Mobin.getFollowingList().size());
        System.out.println("Negar followers:" +  Negar.getFollowerList().size());
        System.out.println("Negar followings:" +  Negar.getFollowingList().size());

        System.out.println("Mobin following list:");
        for(User user: Mobin.getFollowingList()){
            System.out.println(user.getUsername());
        }
        System.out.println("----------------------------------\n");

        Mobin.playMusic(Song2);
        Mobin.playMusic(Song1);
        Mobin.playMusic(Song3);
        Mobin.playMusic(Song2);
        Mobin.playMusic(Song2);

        try{
            Mobin.playMusic(Song2);
        }catch (InvalidOperationException e){
            System.out.println("Error: "+e.getMessage());
        }
        System.out.println("----------------------------------\n");

        System.out.println("song2 streams: "+Song2.getNumberOfStream());
        System.out.println("song4 streams: "+Song4.getNumberOfStream());

        System.out.println("Upgrage to premium");
        Mobin.buyPremium(3);
        Mobin.playMusic(Song4);

        System.out.println("----------------------------------\n");
        try{
            Negar.createPlaylist("MyPlaylist");
        }catch (InvalidOperationException e){
            System.out.println("Error: "+ e.getMessage());
        }
        Mobin.createPlaylist("Sitaroma");
        System.out.println("Playlist created");

        Playlist Sitaroma = Mobin.getPlaylists().getFirst();
        Sitaroma.addMusic(Song4, "123456789");
        Sitaroma.addMusic(Song1, "123456789");
        System.out.println("Songs added to the playlist");
        try{
            Sitaroma.addMusic(Song2, "123456");
        }catch (InvalidOperationException e){
            System.out.println("Error: " + e.getMessage());
        }
        System.out.println("----------------------------------\n");


        Sitaroma.searchInPlaylist("Underneath the ocean");
        System.out.println("Song Underneath the ocean founded");
        try {
            Sitaroma.searchInPlaylist("somerandom");
        }catch (InvalidOperationException e){
            System.out.println("Error: "+ e.getMessage());
        }
        System.out.println("Play all music in Sitaroma playlist");
        Sitaroma.playPlaylist();

        System.out.println("----------------------------------\n");


        System.out.println("Checking Errors");
        try {
            Mobin.follow(Mobin);
        }catch (InvalidOperationException e){
            System.out.println("Error: "+ e.getMessage());
        }


    }
}