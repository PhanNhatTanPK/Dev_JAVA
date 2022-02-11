import java.util.*;
public class buukien extends buupham
{
    private String diachi;
    private int gia;
    
    public buukien(String tbp, String dc)
    {
        super(tbp);
        diachi=dc;
        gia=5000;
    }
    
    @Override
    public String loaibp()
    {
        return "buu kien";
    }
    
    @Override
    public int laygia()
    {
        return gia;
    }
    
    @Override
    public void hienthi()
    {
        super.hienthi();
        System.out.println(" "+diachi+" "+ laygia());
    }
}
