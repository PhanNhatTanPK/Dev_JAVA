import java.util.*;
public class PS
{
    private int tu;
    private int mau;
    
    public PS (int t, int m)
    {
        tu=t;
        mau=m;
    }
    
    public boolean equals(Object q)
    {
        PS p = (PS)q;
        return (double)tu/mau==(double)p.tu/p.mau;
    }
}
