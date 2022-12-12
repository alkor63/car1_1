public class Main {
    public static void main(String[] args) {

        Car[] cars = new Car[5];
        cars[0] = new Car();
        cars[0].brand = "Lada";
        cars[0].model = "Granta";
        cars[0].year = 2015;
        cars[0].country = "Россия";
        cars[0].color = "желтый";
        cars[0].engineVolume = 1.7;

        cars[1] = new Car();
        cars[1].brand = "Audi";
        cars[1].model = "A8 50 L TDI quattro";
        cars[1].year = 2020;
        cars[1].country = "Германия";
        cars[1].color = "черный";
        cars[1].engineVolume = 3.0;

        cars[2] = new Car();
        cars[2].brand = "BMW";
        cars[2].model = "Z8";
        cars[2].year = 2015;
        cars[2].country = "Германия";
        cars[2].color = "черный";
        cars[2].engineVolume = 3.0;

        cars[3] = new Car();
        cars[3].brand = "Kia";
        cars[3].model = "Sportage 4-го поколения";
        cars[3].year = 2018;
        cars[3].country = "Южная Корея";
        cars[3].color = "красный";
        cars[3].engineVolume = 2.4;

        cars[4] = new Car();
        cars[4].brand = "Hyundai";
        cars[4].model = "Avante";
        cars[4].year = 2016;
        cars[4].country = "Южная Корея";
        cars[4].color = "оранжевый";
        cars[4].engineVolume = 1.6;

        for (Car car: cars)
            System.out.println(car);
    }
}