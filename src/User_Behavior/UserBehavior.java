package User_Behavior;
import Songs.Music;


public interface UserBehavior {

    void createPlaylist (String Title, User Owner);

    void playMusic (Music music);

    void buyPremium (User owner, int month);

}
