package lecture02;

public class Exercise2_3 {
    public static void main(String[] args) {
        Engine engine = new Engine(4000);
        GasStation gas = new GasStation();
        Tire[] tires = new Tire[4];
        for(int i = 0;i<tires.length;i++){
            tires[i] = new Tire(65);
        }
        Car car = new Car(tires, engine);

        gas.refuel(car);
        car.startEngine();
        car.run();
    }
}
