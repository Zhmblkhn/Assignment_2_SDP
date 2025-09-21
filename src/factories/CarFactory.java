package factories;

import abstractfactories.CarBody;
import cars.Car;

public interface CarFactory {
    Car createCar();
    CarBody createCarBody(String type);
}
