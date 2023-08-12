import java.util.ArrayList;

public class CarCity {
    ArrayList<Car> cars = new ArrayList<>();

    public CarCity() {
    }

    public CarCity(ArrayList<Car> cars) {
        this.cars = cars;
    }

    public ArrayList<Car> getCars() {
        return cars;
    }

    public void setCars(ArrayList<Car> cars) {
        this.cars = cars;
    }
    public void addCar(Car car){
        cars.add(car);
    }
    public Car firstGreatVolumeCar(){
        return cars.stream().filter(car -> car.getEngineVolume()>3.0)
                .findFirst().orElse(null);
    }
    public ArrayList<Car> search(String name){
        return cars.stream().filter(car -> car.equals(name));
    }
}
