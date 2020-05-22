package web;

import web.model.Car;

import java.util.ArrayList;
import java.util.List;

public class Service implements CarService {

    @Override
    public List<Car> getAllCars() {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("Toyota", "a123sdaq123", 111));
        cars.add(new Car("BMW", "dsjfn3424we", 333));
        cars.add(new Car("Volvo", "mbn3432kcv43", 555));
        cars.add(new Car("Audi RS", "rrrewqwww3123123ooo", 888));
        return cars;
    }

}
