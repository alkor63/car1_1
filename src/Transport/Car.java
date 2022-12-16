package Transport;

public class Car {
    private final String brand;
    private final String model;
    private final int year;
    private final String country;
    private String color;

    private double engineVolume;
    private String transmission;
    private final String bodyType;
    private String regNumber;
    private final int numberOfSeats;
    private boolean summerTires;

    public Car(String brand, String model, int year, String country, String color, double engineVolume,
               String transmission, String bodyType, String regNumber, int numberOfSeats) {

        if (year <= 0) year = 2000;
        if (engineVolume <= 0) engineVolume = 1.5;
        if (numberOfSeats <= 0) numberOfSeats = 5;
        if (nullString(color)) color = "белый";
        if (nullString(brand)) brand = "default";
        if (nullString(model)) model = "default";
        if (nullString(country)) country = "default";
        if (nullString(transmission)) transmission = "не указан";
        if (nullString(bodyType)) bodyType = "не указан";
        if (nullString(regNumber)) regNumber = "не указан";
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.country = country;
        this.color = color;
        this.engineVolume = engineVolume;
        this.transmission = transmission;
        this.bodyType = bodyType;
        this.regNumber = regNumber;
        this.numberOfSeats = numberOfSeats;

    }
    public boolean nullString(String s){
        return (s == null || s.isEmpty());
    }
    @Override
    public String toString() {
        return "Автомобиль " + brand + " " + model + ", " + year +
                " год выауска, страна сборки " + country +
                ", цвет " + color + ", объем двигателя " + engineVolume + " л";
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public String getCountry() {
        return country;
    }

    public String getBodyType() {
        return bodyType;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    public String getRegNumber() {
        return regNumber;
    }

    public void setRegNumber(String regNumber) {
        this.regNumber = regNumber;
    }

    public boolean isSummerTires() {
        return summerTires;
    }

    public void setSummerTires(boolean summerTires) {
        this.summerTires = summerTires;
    }
}
