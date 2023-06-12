public class Main {
    public static void main(String[] args) {
        City Tbilisi = new City("Tbilisi");
        State state = new State("Sakartvelo", Tbilisi,
                new Region("Qartli", new City("Tbilisi"), 40.5, new District("Tbilisi",
                        new City("Tbilisi"), new City("Tbilisi"), new City("Tbilisi"))),


                new Region("Samegrelo", new City("Zugdidid"), 20, new District("Zugdidid",
                        new City("Zugdidid"), new City("Zugdidid"))));

        state.printCapitalCity();
        state.printNumberOfRegions();
        state.printRegionalCenter();
        state.printStateArea();
    }
}