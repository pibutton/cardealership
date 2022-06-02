package hu.nye.webapp.cardealership.controller;


import hu.nye.webapp.cardealership.dto.CarDTO;
import hu.nye.webapp.cardealership.service.CarService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CarController {

    private final CarService carService;

    public CarController(CarService carService) {
        this.carService = carService;


/**        Car car1 = new Car();
        car1.setRendszam("ren1");

        Car car2 = new Car();
        car2.setRendszam("ren2");

        carRepository.save(car1);
        carRepository.save(car2);
 */
    }


    @RequestMapping(path = "/cars", method = RequestMethod.GET)
    public List<CarDTO> findAll() {
        return carService.findAll();

        // return List.of(
        //        "Volvo",
        //        "Mazda"
        // );
    }
    @RequestMapping(path = "/cars", method = RequestMethod.POST)
    public CarDTO create(@RequestBody CarDTO carDTO) {
        return carService.create(carDTO);

    }
}
