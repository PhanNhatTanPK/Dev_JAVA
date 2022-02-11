
import java.util.*;

public class MainBTH6 {

    public static void main(String[] args) {
        DSSV ds1 = new DSSV();
        SV sv1 = new SVSP("L", 2000, 7.0, "BD", 8.0);
        ds1.themsv(sv1);

        sv1 = new SVSP("M", 2000, 7.0, "BD", 8.0);
        ds1.themsv(sv1);

        sv1 = new SVTH("E", 2001, 4.0, "BD", 5.0);
        ds1.themsv(sv1);

        //SV sv2=new SVTH("E",2001,4.0,"BD",5.0);
        //ds1.themsv(sv2);
        //SV sv3=new SVSP("B",2000,9.0,"BD",7.0);
        //ds1.themsv(sv3);
        //SV sv4=new SVTH("C",2000,6.0,"BD",9.0);
        //ds1.themsv(sv4);
        ds1.lietke();
        //ds1.lietke("SVSP");
    }

}
