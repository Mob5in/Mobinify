package Package.Songs.User_Behavior;
import Package.Songs.Exceptions.InvalidOperationException;
import Package.Songs.Music;


public class RegularBehavior implements UserBehavior{

    //fields
    private int playinglimit = 5;



    //methods
    @Override
    public void createPlaylist(String Title, User Owner) throws InvalidOperationException {
        throw new InvalidOperationException("You cant create a playlist, you are a regular user. update to premium");
    }


    @Override
    public void playMusic(Music music) throws InvalidOperationException {

        if(this.getPlayinglimit() > 0 ){
            System.out.println("The "+music.getTitle()+" is playing");
            Music.play(music);
            this.setPlayinglimit( getPlayinglimit() - 1);

        } else if (this.getPlayinglimit() <= 0) {
            throw new InvalidOperationException("You have reached your play limit");

        }
    }


    @Override
    public void buyPremium(User owner, int month) {
        owner.setBehavior(new PremiumBehavior(month));
    }


    //getters
    public int getPlayinglimit() {return playinglimit;}

    //setters
    public void setPlayinglimit(int playinglimit) {this.playinglimit = playinglimit;}
}
