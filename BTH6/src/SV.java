import java.awt.event.ActionListener;
import java.io.Serializable;
public class SV implements Serializable
{
    protected String hoten;
    protected int namsinh;
    protected double dtb;
    
    public SV(String ht, int ns, double d)
    {
        hoten= ht;
        namsinh=ns;
        dtb=d;
    }
    
    public void hienthi()
    {
        System.out.println("Ho ten:"+hoten+"  nam sinh:"+namsinh+"  diem trung binh:"+dtb);
    }
    
    public String layhoten()
    {
        return hoten;
    }
    
    public String loaisv()
    {
        return "";
    }
    
    public  boolean dctn()
    {
        return true;
    }
    
    public boolean equals(Object sv)
    {
       SV sv1 =(SV)sv;
       return hoten.equals(sv1.hoten)&&namsinh==sv1.namsinh&&dtb==sv1.dtb;
    }
}
