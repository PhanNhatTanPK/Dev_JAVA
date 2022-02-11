import java.util.*; 
import java.io.*;
public class TD
{
    private Hashtable td;
    
    public TD(String tentep)
    {
        td=new Hashtable();
        try
        {
            FileInputStream in =new FileInputStream("tentep");
            DataInputStream din= new DataInputStream(in);
            while(din.available()>0)
            {
                String s =din.readLine();
                StringTokenizer st= new StringTokenizer(s,":-");
                String tu     = st.nextToken();
                String n      = st.nextToken();
                String loaitu = st.nextToken();
                String vidu   = st.nextToken();
                Nghia ng = new Nghia(n,loaitu,vidu);
                td.put(tu, ng);
            }
            
            din.close();
        }
       catch(IOException e)
        {
            
        }
    }
    
    public Nghia tratu(String ta)
    {
        return (Nghia)td.get(ta);
    }
    
    public void hienthi()
    {
        Enumeration e= td.keys();
        while(e.hasMoreElements())
        {
            String ta =(String)e.nextElement();
            Nghia ng = (Nghia)td.get(ta);
            System.out.println(ta+":"+ng);  
        }
    }
}
