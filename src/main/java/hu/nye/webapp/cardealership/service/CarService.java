package hu.nye.webapp.cardealership.service;

import hu.nye.webapp.cardealership.dto.CarDTO;


import java.util.List;

public interface CarService {

    List<CarDTO> findAll();

}
