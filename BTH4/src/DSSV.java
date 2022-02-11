
public class DSSV 
{
    private  SV [] ds;
    private int sosv;
    
    
    public DSSV(int n)
    {
        ds= new SV[n];
        sosv=0;
    }
    
    public void themsv(SV x)
    {
        if(sosv<ds.length) 
            ds[sosv++]=x;
    }
    
    public void laysv(int n)
    {
        for(int i=0; i<sosv;i++)
        {
            if(i==n)
                System.out.println(ds[i].layhoten()+" "+ds[i].laytuoi()+" "+ds[i].laydiemtb());  
        }
    }
    
    public void hienthi()
    {
        for(int i=0;i<sosv;i++)
        {
            System.out.println(ds[i].layhoten()+" "+ds[i].laydiemtb()+" "+ds[i].layngaysinh());
        }
    }
    
    public void saphoten()
    {
        String s = null;
        for(int i=0;i<sosv;i++)
        {
            String s1=String.valueOf(ds[i].layten()+""+ds[i].layho()+""+ds[i].laytendem());
            for(int j=i+1;j<sosv;j++)
            {
               String s2=String.valueOf(ds[j].layten()+""+ds[j].layho()+""+ds[j].laytendem());
                if(s1.compareTo(s2)>0)
                {   
                    s=s1;
                    s1=s2;
                    s2=s;
                }   
            }
        }
    }
    
    public void saptuoi()
    {
        
        SV s=null;
        for(int i=0;i<sosv-1;i++)
        {
            for(int j=i+1;j<sosv;j++)
            {
                if(ds[i].laytuoi()>ds[j].laytuoi()) 
                {       
                        s=ds[i];
                        ds[i]=ds[j];
                        ds[j]=s;
                }
            }
        }
    }
    
    public void xepDTB()
    {
        SV tg=null;
        for(int i=0;i<sosv-1;i++)
        {
            for(int j=i+1;j<sosv;j++)
            {
                if(ds[i].laydiemtb()>ds[j].laydiemtb())
                {
                    tg=ds[i];
                    ds[i]=ds[j];
                    ds[j]=tg;
                }
            }
        }
    }
    
    public void timten(String x)
    {
        for(int i=0;i<sosv;i++)
        {
            if(ds[i].layten().equals(x))
                ds[i].hienthi();
        }
    }
    
    public void lietkexeploai(String x)
    {
        for(int i=0;i<sosv;i++)
        {
            if(ds[i].layxeploai().equals(x))
               ds[i].hienthi(); 
        }
    }
    
    public void xoaSV (String x)
    {
        for(int i=0;i<sosv;i++)
        {
            if(ds[i].layten().equals(x))
                for(int j=i;j<sosv;j++)
                {
                    ds[j]=ds[j+1];   
                }
            sosv--;
        }
    }
    
    public int tinhtuoi()
    {
        int t=0;
        for(int i=0;i<sosv;i++)
        {
             t+= ds[i].laytuoi();
        }
        
        return t/sosv;
    }
    
    public  void  tangdiem()
    {
        double t=0;
        for(int i=0;i<sosv;i++)
        {
            if(ds[i].laytuoi()<2000)
              t=ds[i].laydiemtb()+0.5;
        }
        
    }
}
   
