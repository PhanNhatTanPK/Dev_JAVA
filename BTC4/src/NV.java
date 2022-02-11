
 public class NV 
{
    protected String hoten;
    protected String phong;
     
    public NV(String ht, String p)
    {
        hoten= ht;
        phong =p;       
    }
     public void hienthi()
     {
         System.out.println(hoten+" "+phong);
     }
     
     public String loainv()
     {
         return "";
     }
     
     public double layluong()
     {
         return 1;
     }
     
     public boolean lanvhddh()
     {
         return true;
     }       
}
