
public class SinhVien 
{
    private String Hoten;
    private DiemHP hp1,hp2;
    
    public SinhVien(String ht, DiemHP m1, DiemHP m2)
    {
        Hoten=ht;
        hp1=m1;
        hp2=m2;
    }
    public double tinhDTB()
    {
        return (hp1.tinhdiem()*hp1.laystc()+hp2.tinhdiem()*hp2.laystc())/(hp1.laystc()+hp2.laystc());
    }
    public void hienthi()
    {
        System.out.println(Hoten+" "+tinhDTB()+" "+hp1.tinhdiem()+" "+hp2.tinhdiem());
    }
}
