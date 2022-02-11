
public class HPLyThuyet extends DiemHP
{
    private double chuyencan,giuaky,cuoiky;
    
    public HPLyThuyet(String thp, int stc,double cc, double gk, double ck)
    {
        super(thp,stc);
        chuyencan=cc;
        giuaky=gk;
        cuoiky=ck;
    }
    
    public double tinhdiem()
    {
       return (chuyencan*0.1+giuaky*0.2+cuoiky*0.7);  
    }
    
}
