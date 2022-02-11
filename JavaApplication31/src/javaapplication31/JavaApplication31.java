package javaapplication31;

import java.util.Arrays;
import java.util.List;

public class JavaApplication31 {  
        public interface ClientInterface {
            void method (String data, int index);    
        }

        public static class ObjectAdapter implements ClientInterface {
            private Service service;

            public ObjectAdapter (Service service) {
                this.service = service;
            }

            private String[] Convert (String a) {
                String str = a.replaceAll(",", ";").trim();
                return str.split(";");
            }

            public void method (String a, int index) { 
                service.serviceMethod(Convert(a), index);
            }
        }

        public static class ClassAdapter extends Service implements ClientInterface {
            public String[] Convert (String a) {
                String str = a.replaceAll(",", ";");
                str.trim();
                return str.split(";");
            }

            @Override
            public void method(String data, int index) {
                serviceMethod(Convert(data),index);
            }
        }

        public static class Service {
            private SemicolonSperatedValues semicolon = new SemicolonSperatedValues();

            public void serviceMethod(String[] data,int index) {    
                semicolon.values = Arrays.asList(data);

                semicolon.getSize();
                semicolon.getItem(index);
                semicolon.toSting();

            }
        }

        public static class SemicolonSperatedValues {
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

        public static void main(String[] args) {
            String a = "1,2,3,4,5,6,7,8,9,10";

            System.out.println("ObjectAdapter excute:");
            ObjectAdapter objectadapter = new ObjectAdapter(new Service());      
            objectadapter.method(a, 0);

            System.out.println("\n");

            System.out.println("ClassAdapter excute:");
            ClassAdapter classadapter = new ClassAdapter();        
            classadapter.method(a, 2);
        }   
}