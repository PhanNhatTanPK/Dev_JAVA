
public class Sinhvien 
{
    private String hoten;
    private Diem [] diem;
    
    public Sinhvien(String ht,Diem [] d )
    {
        hoten= ht;
        diem = d;
    }
    
    public double tinhdtb()
    {
       /* double dtb;
        dtb= (diem1.tinhdiem()*diem1.laySTC()+diem2.tinhdiem()*diem2.laySTC())/(diem1.laySTC()+diem2.laySTC());
        return dtb;
       */
        int i;
        double TD=0,TC=0;
        for(i=0;i<diem.length;i++)
        {
            TD+=diem[i].tinhdiem()*diem[i].laySTC();
            TC+=diem[i].laySTC();
        }
        return TD/TC;
    }
    public void hienthi()
    {
        System.out.println(hoten+" "+tinhdtb());
    }
}
