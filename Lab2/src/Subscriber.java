import java.util.Vector;

public class Subscriber extends Account {
    private Channel channel;
    private String nameSubscriber;
    private Vector<Post> likes = new Vector<Post>();
    
    public Subscriber(String uName , String pass, Channel channel) {
        super(uName,pass);
        this.channel = channel;
        this.channel.subscriber(this);
    }
      
    public void update() {
        System.out.println(channel.getName() + " channel uploaded a new video");
    }
    
    public void setName(String name) {
        nameSubscriber = name;
    }
    
     public String getName() {
        return nameSubscriber;
    }
    
    public void like(Post P) {
        P.like();
        likes.addElement(P);
    }
    
    public void dislike(Post P) {
        P.dislike();
    }
    
    public void comment(Post P, String cmt) {
        P.addComment(cmt);
    }
}
