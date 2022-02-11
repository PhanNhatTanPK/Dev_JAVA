public class ObjectAdapter  implements Target {  
	private Adaptee adaptee; 

	public ObjectAdapter(Adaptee adaptee) {  		       
            this.adaptee  =  adaptee;  
	} 

	public String operation() {
	    return  adaptee.specificOperation();
	} 
} 
