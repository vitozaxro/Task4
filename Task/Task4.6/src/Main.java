public class Main {
    public static void main(String[] args) {
        Time time1 = new Time(11, 22, 33);
        Time time2 = new Time(33, 66, 99);

        System.out.println("Default time:");
        time1.viewTime();
        time2.viewTime();

        time1.setHours(2);
        time1.setMinutes(13);
        time1.setSeconds(12);

        time2.setHours(23);
        time2.setMinutes(11);
        time2.setSeconds(3);

        System.out.println("\nSet time:");
        time1.viewTime();
        time2.viewTime();

        time1.changeTimeHours(2);
        time1.changeTimeMinutes(15);
        time1.changeTimeSeconds(90);

        time2.changeTimeHours(1);
        time2.changeTimeMinutes(10);
        time2.changeTimeSeconds(100);

        System.out.println("\nChanged time: ");
        time1.viewTime();
        time2.viewTime();
    }
}