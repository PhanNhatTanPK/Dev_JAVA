import java.util.Vector;

public class YoutubeApp {
    static private YoutubeApp inst;
    private Vector<Account> accounts = new Vector<Account>();


    private YoutubeApp() {}

    public static YoutubeApp getYoutubeApp() {
        if (inst == null) 
            inst = new YoutubeApp();
        return inst;
    }

    public void signUp(Account acc) {
        accounts.addElement(acc);
    }

    public boolean signIn(Account Acc) {    
        return true;
    }

    public void signOut(Account Acc) {
        System.out.print("Good bye!!!");
    }
}