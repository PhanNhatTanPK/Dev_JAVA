
public class Diem 
{
    private String tenhocphan;
    private int sotinchi;
    private int chuyencan, giuaky, cuoiky;
    
    public  Diem(String thp,int stc, int cc, int gk, int ck)
    {
        tenhocphan=thp;
        sotinchi=stc;
        chuyencan=cc;
        giuaky=gk;
        cuoiky=ck;
    }
    
    public double tinhdiem()
    {
        double diemHP;
        diemHP=chuyencan*0.1+giuaky*0.2+cuoiky*0.7;
        return diemHP;
    }
    
    public int laySTC()
    {
        return sotinchi;
    }
}
     
