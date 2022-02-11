import java.util.Arrays;
import java.util.List;

public class Service {
    private SemicolonSperatedValues semicolon = new SemicolonSperatedValues();
    
    public void serviceMethod(String[] data,int index) {    
        semicolon.values = Arrays.asList(data);
        
        semicolon.getSize();
        semicolon.getItem(index);
        semicolon.toSting();

    }
}
