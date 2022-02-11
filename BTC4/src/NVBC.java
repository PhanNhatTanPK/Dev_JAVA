
public class NVBC extends NV
{
    protected double hesoluong;
    protected int sonamct;
    
    public NVBC(String ht,String p,double hsl,int snct)
    {
       super(ht,p);
       hesoluong=hsl;
       sonamct=snct;
    }    
    
    public void hienthi()
    {
        super.hienthi();
        System.out.println(hesoluong+"  "+sonamct);
    }
    
    public String loainv()
    {
        return "BC";
    }
    
    public double layluong()
    {
        return 198000*hesoluong*sonamct;
    }
}