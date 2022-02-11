
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.StringTokenizer;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Phan Nhat Tan
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try
        {
            FileInputStream in =new FileInputStream("tudien.txt");
            DataInputStream din= new DataInputStream(in);
            while(din.available()>0)
            {
                String s =din.readLine();
                System.out.println(s);
            }
            
            din.close();
        }
       catch(IOException e)
        {
            System.out.println("loi doc file");
        }
    }
    
}
