package web.model;

import org.springframework.stereotype.Component;

public class Car {
    private String brand;
    private String model;
    private int produced;

    public Car(String brand, String model, int produced) {
        this.brand = brand;
        this.model = model;
        this.produced = produced;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getProduced() {
        return produced;
    }

    public void setProduced(int produced) {
        this.produced = produced;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", produced=" + produced +
                '}';
    }
}
