public class Client {

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
