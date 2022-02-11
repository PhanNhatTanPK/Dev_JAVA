import java.util.Vector;

abstract public class Post {
    protected String dateTime;
    protected String title;
    protected int numLike;
    protected int numDislike;
    protected Vector<String> comments = new Vector<String>();
    protected Vector<Video> videos = new Vector<Video>();


    public Post(String dateTime,String title) {
        this.dateTime = dateTime;
        this.title = title;
    }

    public void like() {
        numLike += 1;
    }

    public void dislike() {
        numDislike += 1;
    }

    public void getNumLike() {
        System.out.println(numLike);
    }

    public void getNumDislike() {
        System.out.println(numDislike);
    }

    public String getTitle() {
        return title;
    }

    public void addComment(String cmt) {
        comments.addElement(cmt);  
    }

    public void getComments() {
        System.out.println(comments + " ");   
    }
    
    abstract public String getLength();
    
    abstract public String getQuality();
 }
