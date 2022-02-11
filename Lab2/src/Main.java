public class Main {
    public static void main(String[] args) {    
        Channel channel = new Channel("cartoon", "cartoon123");
        channel.register(channel);
        channel.logIn(channel);
        channel.setName("Cartoon");
       
        Subscriber sub = new Subscriber("pht", "pht123", channel);
        sub.register(sub);
        sub.logIn(sub); 
        sub.setName("Phan Hoang Thanh");
        
        Post post1 = new Video("9AM 10-6-2021", "Doraemon", "10 minutes", "1080p");
        channel.addPost(post1);  
        System.out.println("Video " + post1.getTitle() + " is " + post1.getLength() + " and quality " + post1.getQuality());
        
        System.out.println("List of post comments:");
        sub.comment(post1, "The content of thí video is quite good");
        sub.comment(post1, "I don't like this");
        sub.comment(post1, "It so bad"); 
        post1.getComments();

        sub.like(post1);
        System.out.print("The number of likes for this post is: ");
        post1.getNumLike();
        
        sub.dislike(post1);
        System.out.print("The number of dislikes for this post is: ");
        post1.getNumDislike();
        
        System.out.println();
        Post post2 = new Video("5PM 5-9-2021", "Gaoranger", "30 minutes", "1080p");
        channel.addPost(post2);
        System.out.println("Video " + post2.getTitle() + " is " + post2.getLength() + " and quality " + post2.getQuality());

        System.out.println("List of post comments:");
        sub.comment(post2, "It so bad");
        sub.comment(post2, "The content of thí video is quite good");
        sub.comment(post2, "I don't like this"); 
        post2.getComments();

        sub.like(post2);
        System.out.print("The number of likes for this post is: ");
        post2.getNumLike();
        
        sub.dislike(post1);
        System.out.print("The number of dislikes for this post is: ");
        post2.getNumDislike();
    }
    
}
