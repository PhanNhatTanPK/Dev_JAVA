import java.util.Enumeration;
import java.util.Vector;
class PrintSpooler {
        private boolean Connected;
        private Vector List = new Vector();
        private static PrintSpooler PS;

        private PrintSpooler() {
            Connected = false;
        }

        public static PrintSpooler getPS() {
            if(PS == null) {
                PS = new PrintSpooler();
            }
            return PS;   
        }
        
        public boolean Connect() {
            Connected = true;  
            return Connected;
        }
        
        public int StartDoc() {
            if(Connect() == true)
                return 1;
            else
                return 0;
        }
        
        public int EndDoc() {
            return 1;
        }
        
        public void Add(String str) {
            List.addElement(str);
        }
        
        public void LoadingDriver() {
            System.out.print("Loading that driver\n");
        }
        
        public void SetDataType() {
            System.out.print("Choose the right data type such as: EMF or ASCII text or raw data\n");
        }

        public void Print() {
            if(StartDoc() > 0) {
                Enumeration e = List.elements();
                while( e.hasMoreElements()) {
                    List.removeElementAt(0);
                    System.out.print("You have successfully printed\n");
                }
                EndDoc();
            }   
        }
        
        public void Show() {
            	System.out.print(List);
            	System.out.print("\n");
        }   
}

public class Main {
    public static void main(String[] args) {
        	Main application = new Main();
        
        	PrintSpooler ps = PrintSpooler.getPS();
        	ps.Connect();
        	ps.SetDataType();
        	ps.LoadingDriver();
        
        	application.Request1();
        	application.Request2();
        	application.Request3();
    }
    
    public void Request1() {
	PrintSpooler ps = PrintSpooler.getPS();
	ps.Add("Document-1");
        	ps.Add("Document-2"); 
        	ps.Show();
        	ps.Print();  
    }
    
    public void Request2() {
	PrintSpooler ps = PrintSpooler.getPS();
        	ps.Add("Document-3");
        	ps.Add("Document-4");
        	ps.Show();
        	ps.Print();   
    }
     
    public void Request3() {
	PrintSpooler ps = PrintSpooler.getPS();
        	ps.Add("Document-5");
        	ps.Add("Document-6");
        	ps.Show();
        	ps.Print();
    } 
}