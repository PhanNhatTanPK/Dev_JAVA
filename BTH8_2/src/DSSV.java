import java.io.*;
public class DSSV 
{
    private SV ds[];
    private int sosv;
    
    public DSSV(int n)
    {
         ds= new SV[n];
         sosv=0;
    }

    public void ghiTep(String tenTep)
     {
     try
      {
          FileOutputStream out = new FileOutputStream(tenTep);
          ObjectOutputStream o = new ObjectOutputStream(out);
          for (int i=0; i<sosv; i++)
          {
            o.writeObject(ds[i]);
            
          }
          o.close();
      } 
     catch (IOException e1) 
      {
          System.out.print("loi ghi file");
      }
   }

  public void themsv(SV x)
  {
      if(sosv<ds.length)
          ds[sosv++]=x;
  }
}
