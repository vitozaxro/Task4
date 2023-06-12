public class Main {
    public static void main(String[] args) {
        CustomerDatabase customerDatabase = new CustomerDatabase();

        System.out.println("\nCustomers:");
        customerDatabase.viewCustomers();

        customerDatabase.sortCustomers();

        System.out.println("\nCustomers sorted by name:");
        customerDatabase.viewCustomers();

        System.out.println("\nCustomers with credit card number between 100000000 and 300000000:");
        customerDatabase.findCustomersByCreditCardNumber(100000000, 300000000);
    }
}