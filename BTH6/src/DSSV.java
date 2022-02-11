
import java.util.Vector;


public class DSSV
{
    private Vector ds;
    
    public DSSV()
    {
        ds= new Vector();
    }
    
    public void themsv(SV x)
    {
        if(!ds.contains(x))
           
            ds.addElement(x);
        
    }
    
    public void lietke()
    {
        for(int i=0;i<ds.size();i++)
        {
            ((SV)ds.elementAt(i)).hienthi();
        }
    }
    
    public void lietke(String x)
    {
        for(int i=0; i<ds.size();i++)
        {
            if(((SV)ds.elementAt(i)).loaisv().equals(x))
                ((SV)ds.elementAt(i)).hienthi();
        }
    }
    
    public SV tim(String ht)
    {
        for(int i=0;i<ds.size();i++)
        {
            if(((SV)ds.elementAt(i)).layhoten().equals(ht))
                return (SV)ds.elementAt(i);
        }
        return null;
    }
   
    public void xoa(String ht)
    {
        for(int i=0;i<ds.size();i++)
        {
            if(((SV)ds.elementAt(i)).layhoten().equals(ht))
                ds.removeElementAt(i);
            return;
        }
    }
    
    public void dstn()
    {
        for(int i=0;i<ds.size();i++)
        {
            if(((SV)ds.elementAt(i)).dctn())
                ((SV)ds.elementAt(i)).hienthi();
        }
    }
}
