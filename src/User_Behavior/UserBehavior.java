package User_Behavior;
import Exceptions.InvalidOperationException;
import Songs.Music;


public interface UserBehavior {

    void createPlaylist (String Title, User Owner) throws InvalidOperationException;

    void playMusic (Music music) throws InvalidOperationException;

    void buyPremium (User owner, int month) throws InvalidOperationException;

}
