package factories;

import abstractfactories.CarBody;
import abstractfactories.BodyTypeChecking;
import abstractfactories.MercedesBody;
import cars.Car;
import cars.MercedesCar;

public class MercedesFactory implements CarFactory {
    @Override
    public Car createCar() {
        return new MercedesCar();
    }

    @Override
    public CarBody createCarBody(String type) {
        BodyTypeChecking.checkingMercedesBody(type); // проверка вынесена
        return new MercedesBody(type);
    }
}
