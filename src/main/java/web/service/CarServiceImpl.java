package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.Arrays;
import java.util.List;

@Service
public class CarServiceImpl implements CarService {
    private List<Car> carList = Arrays.asList(new Car("BMW", "Black", 5),
            new Car("Lada", "Red", 10), new Car("Audi", "White", 7),
            new Car("Kia", "Blue", 1), new Car("Ford", "Grey", 2));

    @Override
    public List<Car> getCars(int count) {
        return carList.stream().limit(count).toList();
    }
}