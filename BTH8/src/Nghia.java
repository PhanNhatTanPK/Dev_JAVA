
public class Nghia 
{
    private String nghia;
    private String loaitu;
    private String vidu;
    
    public Nghia(String ng, String lt, String vd)
    {
        nghia=ng;
        loaitu=lt;
        vidu=vd;
    }
    
    public String toString()
    {
        return nghia+"-"+loaitu+"-"+vidu;
    }
    
    public void hienthi()
    {
        System.out.println(nghia+"-"+loaitu+"-"+vidu);
    }
}
