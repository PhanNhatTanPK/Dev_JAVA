
public class DSSV 
{
    private SinhVien [] ds;
    private int SoSV;
    
    public DSSV ( int n )
    {
         ds = new SinhVien[n];
        SoSV =0;
    }
    
    public void Them(SinhVien x)
    {
        if(SoSV<ds.length)
        {
            ds[SoSV++]=x;
        }
    }
    
    
    
    
}
