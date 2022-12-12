public class Car {

    String brand;
    String model;
    int year;
    String country;
    String color;
    double engineVolume;

    @Override
    public String toString() {
        return "Автомобиль " + brand + " " + model + ", " + year +
                " год выауска, страна сборки " + country +
                ", цвет " + color + ", объем двигателя " + engineVolume + " л";
    }
}
