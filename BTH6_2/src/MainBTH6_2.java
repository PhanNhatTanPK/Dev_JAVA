import java.util.*;
public class MainBTH6_2 {

    public static void main(String[] args)
    {
        TD td =new TD();
        Nghia tu1= new Nghia("chao","dongtu","ch");
        Nghia tu2= new Nghia("chay","dongtu","c");
        Nghia tu3= new Nghia("bo","danhtu","b");
        
        td.them("hello", tu1);
        td.them("run", tu2);
        td.them("father", tu3);
        
        System.out.println(td.tratu("hello"));
        td.hienthi();
    }
    
}
