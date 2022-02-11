
public class thu extends buupham
{
    private  String loaithu;
    private String diachi;
    
    public thu(String tbp, String lt, String dc)
    {
       super(tbp);
       loaithu=lt;
       diachi=dc;
    }
    
    @Override
    public String loaibp()
    {
        return "thu";
    }
    
    @Override
    public int laygia()
    {
        switch (loaithu) 
        {
            case "thuong":
                return 800;
            case "dam bao":
                return 2000;
            default:
                return 0;
        }
    }
    
    public void hienthi()
    {
        super.hienthi();
        System.out.println(" "+loaithu+" "+diachi+" "+ laygia());
    }
}
