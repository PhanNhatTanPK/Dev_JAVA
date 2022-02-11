import java.io.*;
public class MainBTH8_2 
{
    public static void main(String[] args) 
    {
        DSSV ds = new DSSV(100);
        
        SV sv1 = new SV("Tuan",2000,9.0);
        ds.themsv(sv1);
        SV sv2 = new SV("Thuan",2001,8.0);
        ds.themsv(sv2);
        SV sv3 = new SV("Tai",2000,7.0);
        ds.themsv(sv3);
        ds.ghiTep("danhsachSV.txt");
    }
    
}
