public class Main {
    public static void main(String[] args) {
        Waiter waiter = new Waiter();
        Customer customer = new Customer(waiter);
        customer.request("pizza");
        customer.request("steak");
    } 
}
