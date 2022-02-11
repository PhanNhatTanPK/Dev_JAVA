import java.util.*;
public class MainC4 {
    
    public static void main(String[] args) 
    {
        Vector v = new Vector();
        v.addElement(new PS(1,2));
        v.addElement(new PS(3,4));
        v.addElement(new PS(100,400));
        PS p =new PS(1,2);
        if(v.contains(p))
            System.out.println("Vi tri"+v.indexOf(p));
        PS q =new PS(3,4);
        v.remove(q);
        System.out.println(v);
    }
    
}
