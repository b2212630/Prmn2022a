package lecture02;

public class GasStation {
    void refuel(Car car){
        System.out.println("給油したことによりfuelが20増えました。");
        car.fuel = car.fuel+20;
    }
}
