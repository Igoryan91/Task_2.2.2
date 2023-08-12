package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarServiceImpl;

import java.util.Arrays;
import java.util.List;

@Controller
public class CarController {
    private final CarServiceImpl carService;
    private static List<Car> carList = Arrays.asList(new Car("BMW", "Black", 5),
            new Car("Lada", "Red", 10), new Car("Audi", "White", 7),
            new Car("Kia", "Blue", 1), new Car("Ford", "Grey", 2));

    public CarController(CarServiceImpl carService) {
        this.carService = carService;
    }

    @GetMapping("/cars")
    public String carPage(@RequestParam(value = "count", defaultValue = "5") int count, Model model) {
        model.addAttribute("cars", carService.getCars(carList, count));
        return "cars";
    }
}
