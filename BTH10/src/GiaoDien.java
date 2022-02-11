import java.awt.*;
import java.awt.event.*;
import java.io.*;
public class GiaoDien implements ActionListener
{
   Frame f = new Frame("Thu nhập cá nhân");
   Label lb1 = new Label("Họ và Tên");
   Label lb2 = new Label("Thu Nhập");
   Label lb3 = new Label("Thuế");
   Label lb4 = new Label("");
   TextField tf1 = new TextField(15);
   TextField tf2 = new TextField(15);
   CheckboxGroup cbg = new CheckboxGroup();
   Checkbox cb1 = new Checkbox("Thường xuyên",cbg,true);
   Checkbox cb2 = new Checkbox("Không thường xuyên",cbg,false);
   Button b1 = new Button("Tính");
   Button b2 = new Button("Thoát");
   Button b3 = new Button("Ghi");
   FileOutputStream out;
   DataOutputStream dout;
   
   public GiaoDien()
   {
       f.setLayout(new GridLayout(6,2));
       f.add(lb1);   f.add(tf1);
       f.add(lb2);   f.add(tf2);
       f.add(cb1);   f.add(cb2);
       f.add(lb3);   f.add(lb4);
       f.add(b1);    f.add(b2);
       f.add(b3);
       b1.addActionListener(this);
       b2.addActionListener(this);
       b3.addActionListener(this);
       try
       {
       out = new FileOutputStream("tien.txt");
       dout = new DataOutputStream(out);
       }
       catch (IOException e){}
       f.setSize(300,400);
       f.setVisible(true);
   }
   
   public void actionPerformed(ActionEvent ae) 
   {
       if(ae.getSource()==b2)
       {
           System.exit(0);
           try
           {
               out.close();
               dout.close();
           }
           catch(IOException e1){}
       }
       
       if(ae.getSource()==b1)
       {
           int a = Integer.parseInt(tf2.getText());
           if(cb1.getState()==true)
           {
               if(a<=500)  
                   lb4.setText("");
               else
                   lb4.setText(""+(a-500)*0.1);
           }
           else
                if(cb2.getState()==true)
           {
                   lb4.setText(""+(a)*0.05);
           }
       }
       else
           if(ae.getSource()==b3)
           {
               try
               {
               String ten = tf1.getText();
               String l = tf2.getText();
               String muc ="";
               if(cb1.getState()==true)
                   muc="Thường xuyên";
               else
                   if(cb2.getState()==true)
                    muc="Không thường xuyên";
              String dl = ten+","+l+","+muc;
              dout.write(dl.getBytes());
               }
               catch(IOException e2){}
              
           }
   }
}
