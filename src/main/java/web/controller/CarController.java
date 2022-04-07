package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarServiceImpl;
import java.util.List;

@Controller
public class CarController {

    @GetMapping("/cars")                //URL, который запрашивает пользователь
    public String giveMeMyCars(@RequestParam(required = false) String count, Model model) {
        List<Car> carList;

        if (count == null || Integer.parseInt(count) >= 5) {
            carList = new CarServiceImpl().getCars(5);
        } else {
            carList = new CarServiceImpl().getCars(Integer.parseInt(count));
        }
        model.addAttribute("message", carList); //model передается в представление, "message" - это ключ, имя - любое
        return "cars";                  //Имя view, которое мы вернем
    }
}
