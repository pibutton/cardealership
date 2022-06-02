package hu.nye.webapp.cardealership.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CarController {

    @RequestMapping(path = "/cars", method = RequestMethod.GET)
    public List<String> findAll() {
        return List.of(
                "Volvo",
                "Mazda"
        );
    }

}
