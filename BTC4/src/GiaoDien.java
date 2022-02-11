import java.awt.*;
import java.awt.event.*;
import java. io.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class GiaoDien implements ActionListener
{
    Frame f = new Frame("Quản lý nhân viên");
    Label lbht = new Label("Họ và tên:");
    Label lbp = new Label("Phòng:");
    Label lbhsl = new Label("Hệ số lương:");
    Label lbl = new Label(" lương:");
    Label lbsnct = new Label("Số năm công tác:");
    Label lbkq = new Label("Kết quả:");
    Label lbt = new Label("");
    Label lbds = new Label("Danh sách nhân viên:");
   
    TextField tfht = new TextField(15);
    TextField tfp = new TextField(15);
    TextField tfhsl = new TextField(15);
    TextField tfl = new TextField(15);
    TextField tfsnct = new TextField(15);
    TextArea tads = new TextArea(15,15);
    
    CheckboxGroup cbg = new CheckboxGroup();
    Checkbox cbhd = new Checkbox("hop dong dai han",cbg,true);
    Checkbox cbhd2 = new Checkbox("hop dong ngan han",cbg,false);
    Checkbox cbbc = new Checkbox("bien che",cbg,false);
   
    Button btl = new Button("Tính lương");
    Button bTL = new Button("Tổng lương");
    Button bt = new Button("Thêm");
    Button bdf = new Button("Đọc file");
    Button bgf = new Button("Ghi file");
    Button bth = new Button("Thoát");
    DSNV ds=new DSNV(10);
    
    
    public GiaoDien(){
       
        f.setLayout(new GridLayout(12,2));
         
        f.add(lbht);       f.add(tfht);
        f.add(lbp);        f.add(tfp);
        f.add(lbhsl);      f.add(tfhsl);
        f.add(lbsnct);     f.add(tfsnct);
        f.add(lbl);        f.add(tfl);
        f.add(lbds);       f.add(tads);
        f.add(lbkq);       f.add(lbt);
        f.add(cbbc);       f.add(cbhd);
        f.add(cbhd2);      f.add(bt);
        f.add(bdf);        f.add(bgf);
        f.add(btl);        f.add(bTL);
                 f.add(bth);
        
        btl.addActionListener(this);
        bdf.addActionListener(this);
        bgf.addActionListener(this);
        bt.addActionListener(this);
        bth.addActionListener(this);  
        f.setSize(400,300);
        f.setVisible(true); 
        
    }
    
    public void actionPerformed(ActionEvent ae)
    {
       
        
        if(ae.getSource()==bth)
        {
            System.exit(0);
            
        }
        if(ae.getSource()==btl)
        {
          String ht = tfht.getText();
        String p = tfp.getText();
        double hsl = Double.parseDouble(tfhsl.getText());
        int snct = Integer.parseInt(tfsnct.getText());
        double l = Double.parseDouble(tfl.getText());     
            if(cbbc.getState()==true)
            {
                NV nv1=new NVBC(ht,p,hsl,snct);
                lbt.setText(""+nv1.layluong());
            }
            
            if(cbhd.getState()==true)
            {
                NV nv1=new NVHD(ht,p,l,"NH");
                lbt.setText(""+nv1.layluong());
            }
            
             if(cbhd2.getState()==true)
            {
                NV nv1=new NVHD(ht,p,l,"DH");
                lbt.setText(""+nv1.layluong());
            }
        }
        
        if(ae.getSource()==bt)
        { String ht = tfht.getText();
        String p = tfp.getText();
        double hsl = Double.parseDouble(tfhsl.getText());
        int snct = Integer.parseInt(tfsnct.getText());
        double l = Double.parseDouble(tfl.getText());
            
             if(cbbc.getState()==true)
            {
                NV nv1=new NVBC(ht,p,hsl,snct);
                ds.themnv(nv1);
            }
            
            if(cbhd.getState()==true)
            {
                NV nv1=new NVHD(ht,p,l,"NH");
                ds.themnv(nv1);
            }
            
             if(cbhd2.getState()==true)
            {
                NV nv1=new NVHD(ht,p,l,"DH");
                ds.themnv(nv1);
            }
        }
        
        if(ae.getSource()==bTL)
        {
            lbt.setText(""+ds.tongluong());
        }
        
       /* if(ae.getSource()==bdf)
        {
                try {
                    ds.docFile("nhanvien.txt");
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(GiaoDien.class.getName()).log(Level.SEVERE, null, ex);
                
            } 
            catch (IOException ex) 
            {
            
            
          
            }
           
        }
        
        if(ae.getSource()==bdf)
        {
            try {
                ds.ghiFile("tienluong.txt");
            } catch (IOException ex) {
                
            }
        }*/
        
    }
        
}
