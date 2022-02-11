
public class ClassAdapter extends Service implements ClientInterface {
    
     public String[] Convert (String a) {
        String str = a.replaceAll(",", ";");
        str.trim();
       return str.split(";");
    }
    @Override
    public void method(String data, int index) {
        serviceMethod(Convert(data),index);
    }
}
