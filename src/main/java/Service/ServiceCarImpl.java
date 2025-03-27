package Service;

import Model.Car;

import java.util.ArrayList;
import java.util.List;
public class ServiceCarImpl implements ServiceCar {

    private List<Car> cars;

    public ServiceCarImpl() {
        cars = new ArrayList<Car>();
        setCar("Lada","Granta",2015);
        setCar("Opel","Ascona",1984);
        setCar("BatCar","M1",2010);
        setCar("Mark","2",1995);
        setCar("Honad","Civic",2015);
    }


    @Override
    public void add(Car car) {
    cars.add(car);
    }

    @Override
    public void setCar(String brand, String model, Integer year) {
    Car car =new Car(brand, model, year);
    add(car);

    }

    @Override
    public List<Car> getCars(int count) {
        if(count >= 5){
        return cars;
    }
        return cars.subList(0, count);
}}
