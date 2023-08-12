package web.service;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.List;

@Component
public class CarServiceImpl implements CarService {

    @Override
    public List<Car> getCars(List<Car> carList, int count) {
        return carList.stream().limit(count).toList();
    }
}