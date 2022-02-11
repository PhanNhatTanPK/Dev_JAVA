import java.util.*;
public abstract class buupham
{
    protected String tenbp;
    
    public buupham(String tbp)
    {
        tenbp=tbp;
    }
    
    public abstract String loaibp();
    
    public abstract int laygia();
    
    public void hienthi()
    {
        System.out.print(tenbp);
    }
}
