public class Main {
    public static void main(String[] args) {
        Triangle triangle = new Triangle(3,4,5);
        System.out.println(triangle.calculatePerimeter()+"\n"+triangle.calculateArea()+"\n"+triangle.calculateCentroid());

    }
}