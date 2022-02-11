
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.StringTokenizer;

public class TinhTienDien implements ActionListener, WindowListener
{
    Frame f = new Frame("Tính tiền điện");
    
    Label lb1 = new Label("Tên khách hàng");
    Label lb2 = new Label("Số lượng tiêu thụ");
    Label lb3 = new Label("Tổng tiền");
    Label lb4 = new Label(" ");
    
    Button b1 = new Button("Tính");
    Button b2 = new Button("Thoát");
    Button b3 = new Button("Đọc File");
    Button b4 = new Button("Ghi File");
    
    CheckboxGroup cbg = new CheckboxGroup();
    Checkbox cb1 = new Checkbox("Cá Nhân",cbg,true);
    Checkbox cb2 = new Checkbox("Tổ chức mức 1",cbg,false);
    Checkbox cb3 = new Checkbox("Tổ chức mức 2",cbg,false);
    Checkbox cb4 = new Checkbox("Tổ chức mức 3",cbg,false);
    
    TextField tf1 = new TextField(10);
    TextField tf2 = new TextField(10);
    
    FileOutputStream out;
    DataOutputStream dout; 
    FileInputStream in;
    DataInputStream din;
    
    public TinhTienDien()
    {
        f.setLayout(new GridLayout(7,2));
        
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        f.addWindowListener(this);
        
        f.add(lb1);   f.add(tf1);
        f.add(lb2);   f.add(tf2);
        f.add(cb1);   f.add(cb2);
        f.add(cb3);   f.add(cb4);
        f.add(lb3);   f.add(lb4);
        f.add(b3);    f.add(b4);
        f.add(b1);    f.add(b2);
        
        f.setSize(400, 500);
        f.setVisible(true);
        try
        {
            out = new FileOutputStream("TienDien.txt");
            dout = new DataOutputStream(out); 
            in = new FileInputStream("KhachHang.txt");
            din = new DataInputStream(in);
        }
        catch(IOException e){}
    }
    
   
    
    @Override
    public void windowClosing(WindowEvent e)
    {
        System.exit(0);
    }
    
    @Override
    public void actionPerformed(ActionEvent ae)
        {
       
        if(ae.getSource() == b2){
            System.exit(0);  
            try
            {
                out.close();
                dout.close();
                din.close();
                in.close();
            }
            catch(IOException e){}       
        }
        else 
           if(ae.getSource() == b1)
           {
               
               int a = Integer.parseInt(tf2.getText());
               TienDien t;
               if(cb1.getState()== true)
               {
                  t = new TDHoCaNhan(tf1.getText(),a);
                   lb3.setText("Thành tiền: "+t.TinhTien());        
               }
               
                if(cb2.getState()== true)
               {
                    t= new TDToChuc(tf1.getText(),a,1);
                    
                    lb3.setText("Thành tiền: "+ t.TinhTien());
               }
               
               if(cb3.getState()== true)
               {
                   t = new TDToChuc(tf1.getText(),a,2);
                    
                    lb3.setText("Thành tiền: "+ t.TinhTien());          
               }
               
               if(cb4.getState()== true)
               {
                    t = new TDToChuc(tf1.getText(),a,3);
                    
                    lb3.setText("Thành tiền: "+t.TinhTien());       
               }
           }
        else
           if(ae.getSource()==b4)
           {
               try
               {
                   String ten = tf1.getText();
                   String soluong = tf2.getText();
                   String tien = lb3.getText();
                   String kh ="";
                   if(cb1.getState()==true)
                           kh = "Cá Nhân";
                   else
                       if(cb2.getState()==true)
                           kh ="Tổ chức loại 1";
                   else
                       if(cb3.getState()==true)
                           kh = "Tổ chức loại 2";
                   else
                       if(cb4.getState()==true)
                           kh = "Tổ chức loại 3";
                   String dulieu = ten+","+soluong+","+tien+","+kh;            
                   dout.write(dulieu.getBytes());
                   dout.writeBytes("\n");
               }
               catch(IOException e){}
           }
        else
            if(ae.getSource()==b3)
            {
                try
                {
                    
                        String s =din.readLine();
                        StringTokenizer st = new StringTokenizer(s,",");
                        tf1.setText(st.nextToken());
                        tf2.setText(st.nextToken());
                        String md = st.nextToken();
                    switch (md) 
                    {
                        
                            
                        case "1":
                            cb2.setState(true);
                            break;
                        case "2":
                            cb3.setState(true);
                            break;
                        case "3":
                            cb4.setState(true);
                            break;
                        default:cb1.setState(true);
                            break;
                           
                    }
                    
                }
               catch(IOException e1)
                {
                    
                }
                
            
            }
        
        }

     @Override
    public void windowOpened(WindowEvent e) {
         //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void windowClosed(WindowEvent e) {
        //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void windowIconified(WindowEvent e) {
      //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void windowDeiconified(WindowEvent e) {
       //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void windowActivated(WindowEvent e) {
       //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void windowDeactivated(WindowEvent e) {
        //To change body of generated methods, choose Tools | Templates.
    }
}

   

    

    
