import java.awt.*;
public class maytinh {

   
    public static void main(String[] args)
    {
        Frame f = new Frame("May tinh");
        Panel p = new Panel(new GridLayout(4,4));
        TextField tf = new TextField(20);
        
        Button b0 = new Button(" 0 ");
        Button b1 = new Button(" 1 ");
        Button b2 = new Button(" 2 ");
        Button b3 = new Button(" 3 ");
        Button b4 = new Button(" 4 ");
        Button b5 = new Button(" 5 ");
        Button b6 = new Button(" 6 ");
        Button b7 = new Button(" 7 ");
        Button b8 = new Button(" 8 ");
        Button b9 = new Button(" 9 ");

        Button bC = new Button(" + ");
        Button bT = new Button(" - ");
        Button bNh = new Button(" x ");
        Button bCh = new Button(" / ");

        Button bB = new Button(" = ");
        Button bX = new Button(" C ");
        
        p.add(b0);    p.add(b1);
        p.add(b2);    p.add(b3);
        p.add(b4);    p.add(b5);
        p.add(b6);    p.add(b7);
        p.add(b8);    p.add(b9);
        p.add(bC);    p.add(bT);
        p.add(bNh);   p.add(bCh);
        p.add(bB);    p.add(bX);
        f.setLayout(new GridLayout(2,1));
        f.add(tf);
        f.add(p);
        f.setSize(200,500);
        f.setVisible(true);
    }    
}
