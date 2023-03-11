package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.*;
import java.util.stream.Collectors;

@Service
public class CarServiceImp implements CarService {

    private List<Car> cars;

    @Autowired
    public CarServiceImp() {
        cars = new ArrayList<>();

        cars.add(new Car("RX", 400, 2016));
        cars.add(new Car("RXS", 323, 2023));
        cars.add(new Car("RXV", 444, 1864));
        cars.add(new Car("RXL", 657, 1996));
        cars.add(new Car("RXM", 545, 2000));
    }

    @Override
    public List<Car> getCars(int count) {
        if (count < 5) {
            List<Car> cars1 = cars.stream().limit(count).collect(Collectors.toList());
            return cars1;
        }
        return cars;
    }
}
