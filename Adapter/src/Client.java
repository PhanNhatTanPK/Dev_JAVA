public class Client {
    public static void main(String[] args){ 	 
        Target objectAdapter = new ObjectAdapter(new Adaptee());					  
        System.out.println("Object Adapter: " + objectAdapter.operation());              
        
        Target classAdapter = new ClassAdapter(); 
        System.out.println("Class Adapter : " + classAdapter.operation()); 
    } 
} 

