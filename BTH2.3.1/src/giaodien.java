import java.awt.*;
import java.awt.event.*;
public class giaodien implements ActionListener
{
    Frame f = new Frame ("Giai phuong trinh bac 2");
    Label hs1 = new Label("Nhap a:");
    Label hs2 = new Label("Nhap b:");
    Label hs3 = new Label("Nhap c:");
    Label kq = new Label("Nghiem:");
    Button b1 = new Button("Giai");
    Button b2 = new Button("Thoat");
    Label t = new Label(" ");
    TextField o1 = new TextField(10);
    TextField o2 = new TextField(10);
    TextField o3 = new TextField(10);
    
    public giaodien()
    {
        f.setLayout(new GridLayout(5,2));
        
        b1.addActionListener(this);
        b2.addActionListener(this);
        
        f.add(hs1);   f.add(o1);
        f.add(hs2);   f.add(o2);
        f.add(hs3);   f.add(o3);
        f.add(kq);    f.add(t);
        f.add(b1);    f.add(b2);
        
        f.setSize(400, 500);
        f.setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource()==b2)
            System.exit(0);
        if(ae.getSource()== b1)
        {
            int a = Integer.parseInt(o1.getText());
            int b = Integer.parseInt(o2.getText());
            int c = Integer.parseInt(o3.getText());
            PTB2 pt = new PTB2(a,b,c);
           
                 kq.setText(pt.tinh());   
        }
    }
}
