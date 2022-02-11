import java.util.Vector;

public class Channel extends Account {
    private String nameChannel;
    private Vector<Post> posts = new Vector<Post>();
    private Vector<Subscriber> subscribers = new Vector<Subscriber>();

    
    public Channel(String uName , String pass) {
        super(uName, pass);
    }
    
    public void setName(String name) {
        nameChannel = name;
    }
    
    public String getName() {
        return nameChannel;
    }
    
    public void subscriber(Subscriber S) {
        subscribers.addElement(S);
    }
    
    public void unSubscriber(Subscriber S) {
        subscribers.removeElement(S);
    }
 
    public void addPost(Post P) {
        posts.addElement(P); 
        notifyToAll();
    }
    
    public void removePost(Post P) {
        posts.removeElement(P);
    }
    
    private void notifyToAll() {
        for(Subscriber sub : subscribers) {
                sub.update();
        }
    }
}
