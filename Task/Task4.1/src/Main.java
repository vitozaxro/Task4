public class Main {
    public static void main(String[] args) {


        Test1 test1 = new Test1();

        test1.view();

        test1.setA(10);
        test1.setB(20);

        test1.view();

        System.out.println("a + b = " + test1.findSum());
        System.out.println("max = " + test1.findMax());

    }
}