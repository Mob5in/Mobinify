package Package.Songs.User_Behavior;
import Package.Songs.*;
import Package.Songs.Exceptions.InvalidOperationException;
import java.util.ArrayList;
import java.util.Objects;

public class User {

    //fields
    private static ArrayList<User> allUsers = new ArrayList<>();
    private String username;
    private String Password;
    private ArrayList<User> followerList = new ArrayList<>();
    private ArrayList<User> followingList = new ArrayList<>();
    private UserBehavior behavior;
    private ArrayList<Playlist> playlists = new ArrayList<>();


    //methods
    public User(String username, String password) throws InvalidOperationException {
        setUsername(username);
        setPassword(password);
        this.behavior = new RegularBehavior();
        allUsers.add(this);
    }


    public void follow (User user) throws InvalidOperationException {

        if(followingList.contains(user)){
            throw new InvalidOperationException("You already have followed this user");
        }
        if(user == this){
            throw new InvalidOperationException("You cant follow yourself");
        }

        this.followingList.add(user);
        user.followerList.add(this);

    }


    public void createPlaylist (String Title) throws InvalidOperationException {
        this.behavior.createPlaylist(Title, this);
    }


    public void playMusic (Music music) throws InvalidOperationException {
        this.behavior.playMusic(music);
    }


    public void buyPremium (int month) throws InvalidOperationException {
        this.behavior.buyPremium(this, month);
    }


    // getters
    public String getUsername() {return username;}
    public String getPassword() {return Password;}// do we need this?
    public ArrayList<User> getFollowerList() {return followerList;}
    public ArrayList<User> getFollowingList() {return followingList;}
    public UserBehavior getBehavior() {return behavior;}
    public ArrayList<Playlist> getPlaylists() {return playlists;}
    public ArrayList<User> getAllUsers() { return allUsers;}
    //setters
    public void setUsername(String username) throws InvalidOperationException {
        for(User user: allUsers){
            if(Objects.equals(user.getUsername(), username)){
                throw new InvalidOperationException("the username you took is already taken");
            }
        }
        this.username = username;
    }

    public void setPassword(String password) throws InvalidOperationException {
        if(password.length() < 8){
            throw new InvalidOperationException("The password is too weak");
        }
        Password = password;
    }

    public void setBehavior(UserBehavior behavior){ this.behavior = behavior;}


}
