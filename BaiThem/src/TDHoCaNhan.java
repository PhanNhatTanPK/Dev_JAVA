
public class TDHoCaNhan extends TienDien
{
    public TDHoCaNhan(String t, int sl)
    {
        super(t,sl);
    }
    
    public double TinhTien()
    {
        
        if(LaySL()<100)
        {
           return LaySL()*500; 
        }
        else 
        {
            return 100*500+(LaySL()-100)*800;
        }
        
    }
}
