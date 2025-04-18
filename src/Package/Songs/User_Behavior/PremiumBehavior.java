package Package.Songs.User_Behavior;

import Package.Songs.Exceptions.InvalidOperationException;
import Package.Songs.Music;
import Package.Songs.Playlist;

public class PremiumBehavior implements UserBehavior{

    private int month;

    public PremiumBehavior(int month) {
        this.month = month;
    }

    @Override
    public void createPlaylist(String title, User owner) throws InvalidOperationException {
        Playlist newPlaylist = new Playlist(title, owner);
        owner.getPlaylists().add(newPlaylist);
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
