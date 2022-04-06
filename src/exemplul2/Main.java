package exemplul2;

public class Main {
    public static void main(String[] args) {
        Car c1 = CarFactory.createCar("electric");
        Car c2 = CarFactory.createCar("classic");

        c1.showInfo();
        c2.showInfo();
    }
}
