import java.io.*;
import java.util.*;
public class SV   implements Serializable
{
    protected String hoten;
    protected int namsinh;
    protected double dtb;
    
    public SV(String ht, int ns, double d)
    {
        hoten=ht;
        namsinh=ns;
        dtb=d;
    }
    
    public SV()
    {
      
    }
    
    public void hienthi()
    {
        System.out.println(hoten+"-"+namsinh+"-"+dtb);
    }
    
    
    public String toString()
    {
        return hoten+"-"+namsinh+"-"+dtb;
    }
    
    public void ghitep(String tentep)
    {
        try 
        {
            FileOutputStream out = new FileOutputStream("tentep");
            PrintWriter write =new PrintWriter(out);
            write.println(this);
            write.close();
        } 
        catch (IOException ex) 
        {
            System.out.print("loi ghi tep");
        }
        
    }
    
    public void doctep(String tentep)
    {
        try
        {
            FileInputStream in = new FileInputStream("tentep");
            DataInputStream din = new DataInputStream(in);
            String s = din.readLine();
            StringTokenizer st =new StringTokenizer(s,"-");
            hoten=st.nextToken();
            namsinh=Integer.parseInt(st.nextToken());
            dtb=Double.parseDouble(st.nextToken());
            din.close();
        } 
        catch (IOException ex) 
        {
            System.out.println("khong tim thay tep");
        }
    }
            
}
