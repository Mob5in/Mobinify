package User_Behavior;
import Exceptions.InvalidOperationException;
import Songs.Music;


public class RegularBehavior implements UserBehavior{

    private int playinglimit = 5;


    @Override
    public void createPlaylist(String Title, User Owner) throws InvalidOperationException {

        throw new InvalidOperationException("You cant create a playlist, you are a regular user. update to premium");

    }

    @Override
    public void playMusic(Music music) {

    }

    @Override
    public void buyPremium(User owner, int month) {

    }

    public int getPlayinglimit() {
        return playinglimit;
    }

    public void setPlayinglimit(int playinglimit) {
        this.playinglimit = playinglimit;
    }
}
