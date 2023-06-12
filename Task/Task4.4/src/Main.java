import java.time.LocalTime;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        Train[] trainsArray = {
                new Train("Tbilisi", 2, LocalTime.of(22, 5, 13)),
                new Train("Batumi", 5, LocalTime.of(11, 59, 12)),
                new Train("Foti", 3, LocalTime.of(15, 25, 11)),
                new Train("Tskneti", 1, LocalTime.of(20, 21, 55)),
        };

        System.out.println("\nAll trains: ");
        Train.viewAllTrains(trainsArray);

        System.out.println("\nInput train number to see information about this train: ");
        Train.findTrainByNumber(trainsArray, in.nextInt());

        System.out.println("\nSort by number: ");
        Train.sortByNumber(trainsArray);
        Train.viewAllTrains(trainsArray);

        System.out.println("\nSort by destination: ");
        Train.sortByDestination(trainsArray);
        Train.viewAllTrains(trainsArray);
    }
}