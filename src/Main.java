import abstractfactories.CarBody;
import cars.Car;
import factories.CarFactory;
import factories.FactoryChecking;

public class Main {
    public static void main(String[] args) {
        CarFactory carFactory = FactoryChecking.getCarFactory("BMW");

        // Создаём машину и кузов
        Car car = carFactory.createCar();
        CarBody body = carFactory.createCarBody("Sedan");

        car.createCar();
        body.showBodyInfo();
    }
}
