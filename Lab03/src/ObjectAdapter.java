
import java.util.List;

public class ObjectAdapter implements ClientInterface {
    private Service service;
    
    public ObjectAdapter (Service service) {
        this.service = service;
    }
    
    private String[] Convert (String a) {
        String str = a.replaceAll(",", ";").trim();
        return str.split(";");
    }
   
    public void method (String a, int index) { 
        service.serviceMethod(Convert(a), index);
    }
}
