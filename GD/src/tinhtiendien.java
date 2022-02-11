import java.awt.*;
public class tinhtiendien {
    
    
    
    public static void main(String[] args) 
    {
        Frame f = new Frame("Tinh tien dien");
        Label csc =new Label("Chi so cu");
        TextField tf1 = new TextField(20);
        Label csm = new Label("Chi so moi");
        TextField tf2 = new TextField(20);
        Label dm = new Label("Nhap dinh muc");
        TextField tf3 = new TextField(20);
        Label kq = new Label("So tien");
        CheckboxGroup cbg = new CheckboxGroup();
        Checkbox cb1 = new Checkbox("1. Ho gia dinh", cbg, true);
        Checkbox cb2 = new Checkbox("2. Don vi hanh chinh", cbg, false);
        Checkbox cb3 = new Checkbox("3. Don vi san xuat", cbg, false);
        Button b1 = new Button("Tinh tien");
        Button b2 = new Button("Thoat");
        
        f.setLayout(new FlowLayout());
        f.add(csc);
        f.add(tf1);
        f.add(csm);
        f.add(tf2);
        f.add(dm);
        f.add(tf3);
        f.add(cb1);
        f.add(cb2);
        f.add(cb3);
        f.add(kq);
        f.add(b1);
        f.add(b2);
        f.setSize(300,400);
        f.setVisible(true);
    }
    
}
