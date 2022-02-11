
public class HPThucHanh extends DiemHP 
{
    private double db1,db2,db3;
    
    public HPThucHanh(String thp,int stc, double d1, double d2,double d3)
    {
        super(thp,stc);
        db1=d1;
        db2=d2;
        db3=d3;
    }

 
    
    public double tinhdiem()
    {
        return (db1+db2+db3)/3;
    }
    
}
