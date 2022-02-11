
public class MAINBTH3
{

    public static void main(String[] args)
    {
     
     Diem m1 = new Diem("toan",3,7,8,9);
     Diem m2 = new Diem("van",3,7,4,10);
     Diem m3 = new Diem("anh",3,5,8,8);
     Diem m4 = new Diem("ly",4,7,6,10);
     
     /*Sinhvien[] sv =new Sinhvien[4];
     sv [0]= new Sinhvien("tuan",m1,m2);
     sv [1]= new Sinhvien("hanh",m2,m3);
     sv [2]= new Sinhvien("tai",m1,m3);
     
     int i;
     for(i=0;i<3;i++)
     {
         sv[i].hienthi();
     }
     */
     
     Diem [] sv1= new Diem [4];
       sv1[0]= m1;
       sv1[1]=m2;
       sv1[2]=m3;
       sv1[3]=m4;
     
      Sinhvien sv =new Sinhvien("hoang",sv1);
      sv.hienthi();
    }
}
