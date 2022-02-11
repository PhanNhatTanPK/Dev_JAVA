
public class NVHD extends NV
{
    protected double luong;
    protected String loaihd;
    
    public NVHD(String ht, String p, double l, String lhd)
    {
        super(ht,p);
        luong=l;
        loaihd=lhd;
    }
    
    public void hienthi()
    {
        super.hienthi();
        System.out.println(luong+""+loaihd);
    }
    
    public String loainv()
    {
        return "HD";
    }
    
    public double layluong()
    {
        return luong;
    }
    
    public boolean lanvhddh()
    {
        return loaihd.equals("DH");
    }
}    
