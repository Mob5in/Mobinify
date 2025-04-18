package User_Behavior;
import Songs.*;
import Exceptions.InvalidOperationException;
import java.util.ArrayList;

public class User {

    private static ArrayList<User> allUsers = new ArrayList<>();
    private String username;
    private String Password;
    private ArrayList<User> followerList = new ArrayList<>();
    private ArrayList<User> followingList = new ArrayList<>();
    private UserBehavior behavior = new RegularBehavior();


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

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public ArrayList<User> getFollowerList() {
        return followerList;
    }

    public void setFollowerList(ArrayList<User> followerList) {
        this.followerList = followerList;
    }

    public ArrayList<User> getFollowingList() {
        return followingList;
    }

    public void setFollowingList(ArrayList<User> followingList) {
        this.followingList = followingList;
    }

    public UserBehavior getBehavior() {
        return behavior;
    }

    public void setBehavior(UserBehavior behavior) {
        this.behavior = behavior;
    }
}
