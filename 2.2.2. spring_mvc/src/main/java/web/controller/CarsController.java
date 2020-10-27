package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.ReceiveCars;

import java.util.List;

@Controller
public class CarsController {
    ReceiveCars receiveCars;

    public CarsController(ReceiveCars receiveCars) {
        this.receiveCars = receiveCars;
    }

    @GetMapping(value = "/cars")
    public String printCars(@RequestParam(value = "count", defaultValue = "0") int count, ModelMap model) {
        if (count == 0) {
            count = receiveCars.carsCount();
        }

        List<Car> list = receiveCars.nCars(count);
        model.addAttribute("listCars", list);

        return "cars";
    }
}
