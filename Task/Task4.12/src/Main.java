public class Main {
    public static void main(String[] args) {
        Car car = new Car("Reno", false,
                new Engine(1.8, false),
                new Wheel("Front right wheel"),
                new Wheel("Front left wheel"),
                new Wheel("Rear right wheel"),
                new Wheel("Rear left wheel"));

        car.viewCarName();
        car.viewCarInfo();

        car.fillTheCar();
        car.turnEngineOn();
        car.drive();

        Wheel oldWheel = car.changeWheel(1, "Extra wheel");
        System.out.println("\nOld wheel:\n" + oldWheel);

        car.setCarName("BMW");
        car.viewCarName();
        car.viewCarInfo();
    }
}