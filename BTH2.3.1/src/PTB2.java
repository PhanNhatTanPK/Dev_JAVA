
public class PTB2 
{
    private int a,b,c;
    
    public PTB2(int g,int d, int e)
    {
        a=g;
        b=d;
        c=e;
    }
    
    public String tinh()
    {
        String ketqua = null;
        double del =0;
        del=b*b-4*a*c;
        if(del<0)
        {
           ketqua="phuong trinh vo nghiem";
        }
        else
           if(del==0)
           {
               ketqua="phuong trinh co nghiem kep: x1=x2= "+(b/2*a);
               
           }
        else
           if(del>0)
           {
               ketqua="phuong trinh co 2 nghiem phan biet: "+"x1= "+(-b+Math.sqrt(del))/2*a+"   x2= "
                       +(-b-Math.sqrt(del))/2*a;  
           }
        return ketqua;
    }
}
