
public class mainBTH5 {        

    public static void main(String[] args)
    {
        DiemHP m1 = new HPLyThuyet("toan",3,8,8,9);
        DiemHP m2 = new HPThucHanh("lap trinh",4,6.5,5.2,7.7);
        DiemHP m3 = new HPLyThuyet("tienganh",3,6,8,9);
        DiemHP m4 = new HPThucHanh("vat ly",2,10,8,7);
        
        SinhVien [] sv= new SinhVien[3];
        sv[0]= new SinhVien("tran",m1,m3);
        sv[1]=new SinhVien("tuan",m2,m3);
        sv[2]=new SinhVien("hanh",m3,m4);
        
        for(int i=0;i<3;i++)
        {
          sv[i].hienthi();  
          
        }
        
    }
    
}
