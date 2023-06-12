import java.time.DayOfWeek;
import java.time.LocalTime;

public class Airport {
    private Airline[] airlinesArray;

    public Airport() {
        airlinesArray = new Airline[]{
                new Airline("Tbilisi", 4, "Boeing 69",
                        LocalTime.of(10, 11, 23), DayOfWeek.SUNDAY),


        };
    }

    public void findFlightByDestination(String destination) {
        for (Airline airline : airlinesArray) {
            if (airline.getDestination().equalsIgnoreCase(destination)) {
                System.out.println(airline);
            }
        }
    }

    public void findFlightByDayOfWeek(DayOfWeek dayOfWeek) {
        for (Airline airline : airlinesArray) {
            if (airline.getDayOfWeek().equals(dayOfWeek)) {
                System.out.println(airline);
            }
        }
    }

    public void findFlightByDayOfWeekAndTime(DayOfWeek dayOfWeek, LocalTime time) {
        for (Airline airline : airlinesArray) {
            if (airline.getDayOfWeek().equals(dayOfWeek)) {
                if (airline.getDepartureTime().isAfter(time)) {
                    System.out.println(airline);
                }
            }
        }
    }

    public void viewAirlines() {
        for (Airline airline : airlinesArray) {
            System.out.println(airline);
        }
    }
}
