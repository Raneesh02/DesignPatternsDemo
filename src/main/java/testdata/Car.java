package testdata;

public class Car {
    private String brand ;
    private int year ;
    private boolean cruiseControl;
    private String transmission;

    private Car(CarBuilder carBuilder){
        brand = carBuilder.brand;
        year = carBuilder.year;
        cruiseControl = carBuilder.cruiseControl;
        transmission = carBuilder.transmission;
    }

    public String getBrand() {
        return brand;
    }

    public int getYear() {
        return year;
    }

    public boolean isCruiseControl() {
        return cruiseControl;
    }

    public String getTransmission() {
        return transmission;
    }

    public void printObj(){
        System.out.println(this.brand +" "+this.year+" "+this.cruiseControl+" "+this.transmission);
    }

public static class CarBuilder {
    private String brand = "BMW"+Math.random();
    private int year = 2023;
    private boolean cruiseControl;
    private String transmission;

    public CarBuilder(String brand, int year){
        this.brand= brand;
        this.year = year;
    }

    public CarBuilder(){
        System.out.println("Car initialized with default values");
    }

    public CarBuilder setCruiseControl(boolean cruiseControl){
        this.cruiseControl = cruiseControl;
        return this;
    }

    public CarBuilder setTransmission(String transmission){
        this.transmission = transmission;
        return this;
    }

    public Car build(){
        Car car = new Car(this);
        //api call to create this car
        return car;
    }

}

}
