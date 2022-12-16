
import Transport.Car;

public class Main {
    public static void main(String[] args) {

        Car[] cars = new Car[5];
        cars[0] = new Car("Lada","Granta",2015,"Россия","желтый",1.7);
        cars[1] = new Car("Audi","A8 50 L TDI quattro",2020,"Германия","черный",3.0);
        cars[2] = new Car("BMW","Z8",2015,"Германия","черный",3.0);
        cars[3] = new Car("Kia","Sportage 4-го поколения",2018,"Южная Корея","красный",2.4);
        cars[4] = new Car("","Avante",-2016,"Южная Корея",null,-1.6);

        for (Car car: cars)
            System.out.println(car);
    }
}