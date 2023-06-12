public class Main {
    public static void main(String[] args) {

        Test2 test2 = new Test2();

        view(test2, true);

        test2 = new Test2(32, 21);

        view(test2, true);

        test2.setA(46);
        test2.setB(64);

        view(test2, false);
    }

    public static void view(Test2 test2, boolean isDefault) {
        if (isDefault) {
            System.out.println("default: a = " + test2.getA());
            System.out.println("default: b = " + test2.getB() + "\n");
        } else {
            System.out.println("not default: a = " + test2.getA());
            System.out.println("not default: b = " + test2.getB());
        }
    }
}