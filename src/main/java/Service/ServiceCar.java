package Service;

import Model.Car;

import java.util.List;

public interface ServiceCar {

    void add(Car car);
    void setCar(String brand, String model, Integer year);
    List<Car> getCars(int count) ;
}
