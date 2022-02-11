
public class SVSP extends SV 
{
    protected String noitt;
    protected double diemtt;
          
    public SVSP(String ht, int ns, double d, String ntt, double dtt)
    {
        super(ht,ns,d);
        noitt=ntt;
        diemtt=dtt;
    }
    
    public void hienthi()
    {
        super.hienthi();
        System.out.println("noi thuc tap: "+noitt+"  diemtt: "+diemtt);
    }
    
    public String loaisv()
    {
        return "SVSP";
    }
    
    public boolean dctn()
    {
        return dtb>=5.0&&diemtt>=7.0;
    }
    
    
    public boolean equals(Object s)
    {
        SVSP ss = (SVSP) s;
        return hoten.equals(ss.hoten) && namsinh==ss.namsinh && dtb==ss.dtb &&
        noitt.equals(ss.noitt) && diemtt == ss.diemtt;
    }
}
