
public class TDToChuc extends TienDien
{
    private int MucDo;
    
    public TDToChuc(String t, int sl, int md)
    {
        super(t,sl);
        MucDo = md;
    }
    
    public double TinhTien()
    {
        
        switch(MucDo)
        {
            case 1: 
                if(LaySL()<=1000) 
                    return LaySL()*400;
                else 
                   return 1000*400+(LaySL()-1000)*800;
                
            case 2: 
                if(LaySL()<=2000) 
                    return LaySL()*400;
                else 
                   return 2000*400+(LaySL()-2000)*800;
                
            case 3: 
                if(LaySL()<=5000) 
                    return LaySL()*400;
                else 
                  return 5000*400+(LaySL()-5000)*800; 
            default : 
                return 0 ;
        }
        
        
    }
   
}
