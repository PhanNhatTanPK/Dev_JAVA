

import java.io.Serializable;


abstract public class  TienDien implements  Serializable
{
    protected String TenKH;
    protected int SoLuong;
    
    public TienDien(String t, int sl)
    {
        TenKH = t;
        SoLuong = sl;
    }
    
    abstract public double TinhTien();
    
    public int LaySL()
    {
        return SoLuong;
    }
    
            
}
