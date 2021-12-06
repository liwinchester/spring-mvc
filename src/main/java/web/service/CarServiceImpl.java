package web.service;

import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CarServiceImpl implements CarService {
    private List<Car> carList;

    private void init() {
        List<Car> cars = new ArrayList();
        cars.add(new Car("Toyota", 1337, "blue"));
        cars.add(new Car("Nissan", 1337, "green"));
        cars.add(new Car("Mercedes", 1337, "black"));
        cars.add(new Car("BMW", 1337, "white"));
        cars.add(new Car("Volkswagen", 1337, "orange"));
        carList = cars;
    }
    @Override
    public List<Car> getCarList(int limit) {
        init();
        return carList.stream().limit(limit).collect(Collectors.toList());
    }
}
