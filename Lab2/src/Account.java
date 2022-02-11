abstract public class Account {
    protected String username;
    protected String password;
  
    
    public Account(String uName , String pass){
        username = uName;
        password = pass;   
    }

    public void register(Account acc) {
        YoutubeApp inst = YoutubeApp.getYoutubeApp();
        inst.signUp(acc);
    }

    public void logIn(Account acc) {
        YoutubeApp inst = YoutubeApp.getYoutubeApp();
        inst.signIn(acc);
    }

    public void logOut(Account acc) {
        YoutubeApp inst = YoutubeApp.getYoutubeApp();
        inst.signOut(acc);
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public void changePassword(String oldPass, String newPass) {
        if(this.password != oldPass) {
            System.out.println("You have entered the wrong password");
        }
        else if(this.password.equals(newPass)) {
            System.out.println("Your new password is the same as your old password");
        }
        else {
            password = newPass;
        }
    } 
}
