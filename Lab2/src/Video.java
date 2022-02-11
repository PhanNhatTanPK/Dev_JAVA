public class Video extends Post {
    private String length;
    private String quality;
  
  
    public Video(String dateTime, String title, String length, String quality) {
        super(dateTime, title);
        this.length = length;
        this.quality = quality;
    }
  
    public String getLength() {
        return length;
    }
    public String getQuality() {
        return quality;
    }
}
