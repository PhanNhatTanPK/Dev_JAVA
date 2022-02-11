import java.io.*;

public class DSNV
{
    private NV [] ds;
    private int sonv;
    
    public DSNV(int n)
    {
         ds= new NV [n];
         sonv=0;
    }
    
    public void themnv(NV x)
    {
        if(sonv<ds.length)
                ds[sonv++]=x;
    }
    
    public void lietke()
    {
        for(int i=0;i<sonv;i++)
        {
            ds[i].hienthi();
        }
    }
    
    public void lietke(String x)
    {
        for(int i=0;i<sonv;i++)
        {
            if(ds[i].loainv().equals(x))
                ds[i].hienthi();
        }
    }
    
    public double tongluong()
    {
        double t=0;
        for(int i=0;i<sonv;i++)
        {
            t+=ds[i].layluong();
        }
        return t;
    }
    
    public void dshddh()
    {
        for(int i=0;i<sonv;i++)
        {
            if(ds[i].lanvhddh())
                ds[i].hienthi();
        }
    }
     public void docFile(String filename)throws IOException, ClassNotFoundException
     {
        FileInputStream fin = new FileInputStream(filename);
        ObjectInputStream in = new ObjectInputStream(fin);          
        for(int i=0;i<sonv;i++){
            NV nv = (NV)in.readObject();
            nv.hienthi();
        }    
        fin.close();
        in.close();
    }
     
    public void ghiFile(String filename)throws IOException{
        FileOutputStream fout = new FileOutputStream(filename);
        ObjectOutputStream out = new ObjectOutputStream(fout);
        for(int i=0;i<sonv;i++){
            out.writeObject(ds[i]);                     
        }
        out.close();
        fout.close();  
    }    
}
