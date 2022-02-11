

import java.text.SimpleDateFormat;
import java.util.Date;
import java.text.ParseException;

public class mainBTH4 {

    public static void main(String[] args) throws ParseException 
    {
        SimpleDateFormat a= new SimpleDateFormat("dd/mm/yyyy");
    
        DSSV ds =new DSSV(5);
        SV sv1 = new SV("Tran Thi D",a.parse("20/10/1998"),9.0);
        ds.themsv(sv1);
        SV sv2 = new SV("Hoang Van C",a.parse("19/8/2002"),8.0);
        ds.themsv(sv2);
        SV sv3 = new SV("Nguyen Thi B",a.parse("23/7/2001"),6.0);
        ds.themsv(sv3);
        SV sv4 = new SV("Pham Hoang E",a.parse("15/1/1999"),7.0);
        ds.themsv(sv4);
        SV sv5  = new SV("Vo Van A",a.parse("16/2/2000"),5.0);
        ds.themsv(sv5);
        
        
      /*ds.saptuoi();
      ds.xepDTB();
      ds.hienthi();
      ds.laysv(3);
      ds.lietkexeploai("gioi");
      ds.timten("D");
      System.out.println("tuoi trung binh cua sinh vien la: "+ds.tinhtuoi());*/
      ds.hienthi();
      
      
        
    } 
    
}
