public class Car {
    String brand;
    String model;
    int year;
    String country;
    String color;
    double engineVolume;

    public Car(String brand, String model, int year, String country, String color, double engineVolume) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.country = country;
        this.color = color;
        this.engineVolume = engineVolume;
    }

    @Override
    public String toString() {
        return "Автомобиль " + brand + " " + model + ", " + year +
                " год выауска, страна сборки " + country +
                ", цвет " + color + ", объем двигателя " + engineVolume + " л";
    }
}
