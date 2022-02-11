

import java.util.Calendar;
import java.util.Date;
public class SV 
{
    private String hoten;
    private Date ngaysinh;
    private double diemtb;
    
    public SV(String ht, Date ngs, double dtb)
    {
        hoten= ht;
        ngaysinh= ngs;
        diemtb= dtb;
    }
    
    public String layhoten()
    {
        return hoten;
    }
    
    public void ganhoten(String x)
    {
        hoten=x;
    }
    
    public Date layngaysinh()
    {
        return ngaysinh;
    }
    
    public void ganngaysinh(Date x)
    {
        ngaysinh=x;
    }
    
    public double laydiemtb()
    {
        return diemtb;
    }
    
    public void gandiemtb(double x)
    {
        diemtb=x;
    }
    
    public void hienthi()
    {
        System.out.println(hoten+"--"+ngaysinh+"--"+diemtb);
    }
    
    public String layho()
    {
        String ho;
        hoten=hoten.trim();
        int i=hoten.indexOf(" ");
        ho =hoten.substring(0,i-1);
        return ho;
    }
    
    public String laytendem()
    {
        String tendem;
        hoten=hoten.trim();
        int i=hoten.lastIndexOf(" ");
        int j=hoten.indexOf(" ");
        tendem=hoten.substring(j+1,i-1);
        return tendem;
    }
    
    public String layten()
    {
        String ten;
        hoten=hoten.trim();
        int i=hoten.lastIndexOf(" ");
        ten=hoten.substring(i+1);
        return ten;
    }
    
    public int laytuoi()
    {
        Date a= new Date();
        Calendar c = Calendar.getInstance();
        c.setTime(a);
        Calendar d= Calendar.getInstance();
        d.setTime(ngaysinh);
        int t =c.get(Calendar.YEAR)-d.get(Calendar.YEAR) ;
        return t;
    }
    
    public String layxeploai()
    {
        String t=null;
        if(diemtb>=8) t="gioi";
        else 
            if(diemtb>=7&&diemtb<8) t="kha";
        else
            if(diemtb>=5&&diemtb<7) t="trung binh";
        else
            if(diemtb<5) t="yeu";
        
        return t;
    }
}
