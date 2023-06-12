import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Client client = new Client("Vito Zakaraia", 18,
                new BankAccount("1111111111111111", 100),
                new BankAccount("2222222222222222", -100),
                new BankAccount("3333333333333333", -5),
                new BankAccount("4444444444444444", 999));

        Scanner in = new Scanner(System.in);

        while (true) {
            System.out.println("\n1)View information.\n2)Unlock account.\n3)Block account.\n4)Check balance.\n5)Find account." +
                    "\n6)Sort accounts.\n7)Exit.\n");
            switch (in.nextInt()) {
                case 1: {
                    client.printClientAccounts();
                    System.out.println();
                    break;
                }
                case 2: {
                    System.out.println("Input account number to unlock this account: ");
                    client.unlockAccount(in.next());
                    break;
                }
                case 3: {
                    System.out.println("Input account number to block this account: ");
                    client.blockAccount(in.next());
                    break;
                }
                case 4: {
                    client.printBalance();
                    break;
                }
                case 5: {
                    System.out.println("Input account number to find this account: ");
                    client.findAccountByNumber(in.next());
                    break;
                }
                case 6: {
                    System.out.println("Sorted accounts:\n1)From min to max.\n2)From max to min.");
                    client.sortAccountsByBalance(in.nextInt() == 1);
                    break;
                }
                case 7: {
                    return;
                }
                default: {
                    System.out.println("\nCouldn't find...");
                }
            }
        }    }
}