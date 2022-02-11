
public class SVTH extends SV
{
    protected String tendt;
    protected double diemdt;
    
    public SVTH(String ht, int ns, double d,String tdt, double ddt)
    {
        super(ht,ns,d);
        tendt=tdt;
        diemdt=ddt;
    }
    
    public void hienthi()
    {
        super.hienthi();
        System.out.println("ten de tai: "+tendt+"  diem de tai:  "+diemdt);
    }
    
    
    public String loaisv()
    {
        return "SVTH";
    }
    
   
    public boolean dctn()
    {
        return dtb>4.0&&diemdt>5.0;
    }
    
    public boolean equals(Object s)
    {
       SVTH ss= (SVTH) s;
        return hoten.equals(ss.hoten) && namsinh==ss.namsinh && dtb==ss.dtb &&
        tendt.equals(ss.tendt) && diemdt == ss.diemdt;
    }
}
