import java.io.*;
public class SV implements  Serializable
{
    private String hoten;
    private int namsinh;
    private double dtb;
    
    public SV(String ht, int ns, double d)
    {
        hoten= ht;
        namsinh=ns;
        dtb=d;
    }
    
    public SV()
    {
        
    }
    
    public void hienthi()
    {
        System.out.println("Ho va ten: "+hoten+"-"+namsinh+"-"+dtb);
    }
    
    public String toString()
    {
        return hoten+" "+namsinh+" "+dtb;
    }
}
