import java.time.DayOfWeek;
import java.time.LocalTime;

public class Main {
    public static void main(String[] args) {
        Airport airport = new Airport();

        System.out.println("\nAll flights:");
        airport.viewAirlines();

        String destination = "Tbilisi";

        System.out.println("\nFlight(s) to " + destination + ":");
        airport.findFlightByDestination(destination);

        DayOfWeek dayOfWeek = DayOfWeek.FRIDAY;

        System.out.println("\nFlight(s) on " + dayOfWeek + ":");
        airport.findFlightByDayOfWeek(dayOfWeek);

        LocalTime time = LocalTime.of(11, 2, 29);

        System.out.println("\nFlight(s) on " + dayOfWeek + ", after " + time + " :");
        airport.findFlightByDayOfWeekAndTime(dayOfWeek, time);

    }
}