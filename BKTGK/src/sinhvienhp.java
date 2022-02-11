
public class sinhvienhp 
{
    private String hoten;
    private int nganh;
    private String doituong;
    private int sotchl;
    
    public sinhvienhp(String ht, int n,String dt, int stc)
    {
        hoten=ht;
        nganh=n;
        doituong=dt;
        sotchl= stc;
    }
    
    public int hocphihk()
    {
        int t=0;
        if(nganh==101)
          t=0;
        else 
            if(nganh==102)
            {
                if(doituong.equals("01"))
                    t=3*2;
                else
                    if(doituong.equals("02"))
                        t=3*3;
            }
        else 
            if(nganh==103)
            {
                if(doituong.equals("01"))
                    t=2*2;
                else
                    if(doituong.equals("02"))
                      t=2*4;
            }
        else
            return 0;
        return t;
    }
}
