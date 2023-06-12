public class Main {
    public static void main(String[] args) {
        Counter counter1 = new Counter();
        Counter counter2 = new Counter(10, -100, 100);
        Counter counter3 = new Counter(100, -10, 10);

        System.out.println("Before increase/decrease:");
        counter1.view();
        counter2.view();
        counter3.view();

        for (int i = 0; i < 100; i++) {
            counter1.increase();
            counter2.decrease();
        }

        System.out.println("\nAfter increase/decrease:");
        counter1.view();
        counter2.view();
        counter3.view();
    }
}