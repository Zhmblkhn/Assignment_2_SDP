package factories;

import abstractfactories.BMWBody;
import abstractfactories.BodyTypeChecking;
import abstractfactories.CarBody;
import cars.Car;
import cars.BMWCar;

public class BMWFactory implements CarFactory {
    @Override
    public Car createCar() {
        return new BMWCar();
    }

    @Override
    public CarBody createCarBody(String type) {
        BodyTypeChecking.checkingBMWBody(type);
        return new BMWBody(type);
    }
}
