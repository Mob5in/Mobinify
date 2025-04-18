package Package.Songs.User_Behavior;

import Package.Songs.Exceptions.InvalidOperationException;
import Package.Songs.Music;

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
