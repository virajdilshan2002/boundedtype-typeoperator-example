package Main;

public class Main {
    public static void main(String[] args) {
        data d1 = new data(10, "Hello"); //bounded type
        d1.printData();

        data<Double, String> d2 = new data<>(60.75, "World"); //bounded type
        d2.printData();
    }
}
