import java.util.*;
public class thungthu 
{
    private buupham[] bp;
    private int sobp;
    
    public thungthu(int n)
    {
        bp =new buupham[n];
        sobp=0;
    }
    
    public void them(buupham x)
    {
        if(sobp<bp.length)
            bp[sobp++]=x;
    }
    
    public void lietke()
    {
        for(int i=0;i<sobp;i++)
        {
            bp[i].hienthi();
        }
    }
    
    public void lietke(String x)
    {
        for(int i=0;i<sobp;i++)
        {
            if(bp[i].loaibp().equals(x))
                bp[i].hienthi();
        }
    }
    
    public int tinhtien()
    {
        int t=0;
        for(int i=0;i<sobp;i++)
        {
            
            t+=bp[i].laygia();
        }
        return t;
    }
    
    public void tinhtienloai()
    {
        int t1=0;
        int t2=0;
        for(int i=0;i<sobp;i++)
        {
            if(bp[i].loaibp().equals("thu"))
                t1+=bp[i].laygia();
            else 
                if(bp[i].loaibp().equals("buu kien"))
                   t2+=bp[i].laygia();
        }
       System.out.println("tong tinh thu la:"+t1+"\ntong tien bưu kien la:"+t2);
    }
}
