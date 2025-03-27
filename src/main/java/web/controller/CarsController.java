package web.controller;
import Model.Car;
import Service.ServiceCarImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;


@   Controller
public class CarsController {
   private final ServiceCarImpl serviceCar;

   public CarsController() {
       this.serviceCar = new ServiceCarImpl();

   }
   @GetMapping(value = "/cars")
   public String getCars(@RequestParam(required = false,defaultValue = "5") int count, ModelMap model) {
       List<Car> cars = serviceCar.getCars(count);
       model.addAttribute("cars", cars);

       List<String> messages = List.of("Hello","Its a list of the cars","enjoy");
       model.addAttribute("messages", messages);
       return "index";
   }


}
