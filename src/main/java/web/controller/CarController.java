package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import web.Service;
import web.model.Car;

import java.util.List;

@Controller
@RequestMapping("/cars")
public class CarController {

    @GetMapping()
    public String getCars(ModelMap model) {
        List<Car> cars = new Service().getAllCars();
        model.addAttribute("cars", cars);
        return "cars";
    }
}
