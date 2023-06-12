public class CustomerDatabase {
    private Customer[] customersArray;

    public CustomerDatabase() {
        customersArray = new Customer[]{new Customer(111111111, 222222222, "vito",
                "zakaraia", "shaurma", "tbilisi"),
                new Customer(22222222, 33333333, "ilia",
                        "lomidze", "xalva", "bordjomi"),
                new Customer(333333333, 444444444, "luka",
                        "Arabidze", "green", "gldani"),
                new Customer(555555555, 666666666, "tamar",
                        "salayaia", "blue", "varketili"),
                new Customer(575652365, 578097653, "vako",
                        "ragaca", "ragaca", "saburtalo")};
    }

    public void sortCustomers() {
        boolean flag = true;

        while (flag) {
            flag = false;

            for (int i = 0; i < customersArray.length - 1; i++) {
                if (customersArray[i].getFirstName().compareToIgnoreCase(customersArray[i + 1].getFirstName()) > 0) {
                    Customer customer = customersArray[i];
                    customersArray[i] = customersArray[i + 1];
                    customersArray[i + 1] = customer;

                    flag = true;
                }
            }
        }
    }

    public void findCustomersByCreditCardNumber(long minLimit, long maxLimit) {
        for (Customer customer : customersArray) {
            if (customer.getCreditCardNumber() >= minLimit && customer.getCreditCardNumber() <= maxLimit) {
                System.out.println(customer);
            }
        }
    }

    public void viewCustomers() {
        for (Customer customer : customersArray) {
            System.out.println(customer);
        }
    }
}
