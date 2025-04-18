package User_Behavior;

import Exceptions.InvalidOperationException;
import Songs.Music;

public class PremiumBehavior implements UserBehavior{

    private int month;

    @Override
    public void createPlaylist(String Title, User Owner) throws InvalidOperationException {

    }

    @Override
    public void playMusic(Music music) throws InvalidOperationException {

    }

    @Override
    public void buyPremium(User owner, int month) throws InvalidOperationException {
        setMonth(month + getMonth());
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }
}
