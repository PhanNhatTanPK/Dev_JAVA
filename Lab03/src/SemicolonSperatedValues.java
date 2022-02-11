import java.util.List;
import java.util.Vector;

public class SemicolonSperatedValues {
    protected List<String> values;
    
    public void getSize () {
        System.out.println("Kích thước của mảng là: " + values.size());
    }
    
    public void getItem (int index) {
        System.out.println("Phần tử thứ " + index + " của mảng là: " + values.get(index));
    }
    
    public void toSting () {
        System.out.print("Danh sách các phần tử trong mảng: ");
        for(int i = 0; i < values.size(); i++)
        {            
                System.out.print(values.get(i) + "; ");
        }
    }
}
