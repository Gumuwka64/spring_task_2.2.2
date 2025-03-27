package Model;



public class Car {
    String brand;
    String model;
    Integer year;

    public Car(String brand, String model, Integer year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }
    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public Integer getYear(){
        return year;
    }

}
