package exemplul2;

public class CarFactory {
    public static Car createCar(String type){
        if(type.equals("electric")){
            Car car = new ElectricCar();
            return car;
        } else if(type.equals("classic")){
            Car car = new ClassicCar();
            return car;
        } else{
            return null;
        }

    }
}
