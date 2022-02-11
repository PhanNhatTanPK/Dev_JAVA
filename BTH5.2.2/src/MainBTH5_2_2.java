import java.util.*;
public class MainBTH5_2_2 {

   
    public static void main(String[] args) 
    {
       thungthu tt = new thungthu(100);
       
       buupham bp1= new thu("A","thuong","Da Nang");
       tt.them(bp1);
       
       bp1 = new buukien("F","Ha Noi");
       tt.them(bp1);
       
       bp1= new thu("W","dam bao","Binh Dinh");
       tt.them(bp1);
       
       bp1 = new buukien("M","Hue");
       tt.them(bp1);
       
       tt.lietke();
       tt.tinhtienloai();
       
    }
    
}
