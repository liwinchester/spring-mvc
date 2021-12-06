package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarService;
import web.service.CarServiceImpl;

import java.util.List;


@Controller
public class CarController {
    CarService carService = new CarServiceImpl();

    @GetMapping("/cars")
    public String carsCity(@RequestParam(value = "count", defaultValue = "5") String count, Model models){
        int countInt = Integer.parseInt(count);
        List<Car> cars = carService.getCarList(countInt);
        models.addAttribute("carList", cars);
        return "cars";
    }
}
