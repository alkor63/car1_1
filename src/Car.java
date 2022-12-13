public class Car {
    public String brand;
    public String model;
    public int year;
    public String country;
    public String color;
    public double engineVolume;

    public Car(String brand, String model, int year, String country, String color, double engineVolume) {

        if (year <= 0) year = 2000;
        if (engineVolume <= 0) engineVolume = 1.5;
        if (nullString(color)) color = "белый";
        if (nullString(brand)) brand = "default";
        if (nullString(model)) model = "default";
        if (nullString(country)) country = "default";
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.country = country;
        this.color = color;
        this.engineVolume = engineVolume;
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
}
