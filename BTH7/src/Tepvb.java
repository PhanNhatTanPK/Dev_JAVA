import java.io.*;
import java.util.*;

public class Tepvb 
{
    public void CreatFile()
    {
        try 
        {
            FileOutputStream out =new FileOutputStream("songuyen.txt");
            PrintWriter write = new PrintWriter(out);
            for(int i=1;i<=100;i++)
            {
                int k= (int)(Math.random()*100);
                write.print(k+" ");
                if(i%10==0)
                    write.println();  
            }
            write.close();
        } 
        catch (IOException e1) 
        {
            System.out.println("loi nhap file");
        }
    }
    
    public void ReadAndWrite()
    {
        int d=0;
        try
        {
           FileInputStream in = new FileInputStream("songuyen.txt");
           FileOutputStream out = new FileOutputStream("sochan.txt");
           PrintWriter write = new PrintWriter(out);
           Scanner sc= new Scanner(in);
           for(int i=1;i<=100;i++)
           {
               int k = sc.nextInt();
               if(k%2==0)
                 {
                   write.print(k+" ");
                   d++;
                 }
               if(d%10==0)
                   write.println();
            }
            in.close();
            write.close();
        }
        catch(IOException e2)
        {
            System.out.println("loi doc va ghi file");
        }
    }
}
