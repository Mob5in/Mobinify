package Package.Songs.User_Behavior;
import Package.Songs.*;
import Package.Songs.Exceptions.InvalidOperationException;
import java.util.ArrayList;

public class User {

    private static ArrayList<User> allUsers = new ArrayList<>();
    private String username;
    private String Password;
    private ArrayList<User> followerList = new ArrayList<>();
    private ArrayList<User> followingList = new ArrayList<>();
    private UserBehavior behavior = new RegularBehavior();
    private ArrayList<Playlist> playlists = new ArrayList<>();

    void follow (User user){

    }

    void createPlaylist (String Title, User Owner) throws InvalidOperationException {
        this.behavior.createPlaylist(Title, Owner);
    }

    void playMusic (Music music){

    }

    void buyPremium (User owner, int month){

    }

    public static ArrayList<User> getAllUsers() {
        return allUsers;
    }

    public static void setAllUsers(ArrayList<User> allUsers) {
        User.allUsers = allUsers;
    }


    // getters
    public String getUsername() {return username;}
    public String getPassword() {return Password;}
    public ArrayList<User> getFollowerList() {return followerList;}
    public ArrayList<User> getFollowingList() {return followingList;}
    public UserBehavior getBehavior() {return behavior;}
    public ArrayList<Playlist> getPlaylists() {return playlists;}

    //setters
    public void setUsername(String username) {this.username = username;}
    public void setPassword(String password) {Password = password;}
    public void setFollowerList(ArrayList<User> followerList) {this.followerList = followerList;}
    public void setFollowingList(ArrayList<User> followingList) {this.followingList = followingList;}
    public void setBehavior(UserBehavior behavior) {this.behavior = behavior;}
    public void setPlaylists(ArrayList<Playlist> playlists) {this.playlists = playlists;}

}
