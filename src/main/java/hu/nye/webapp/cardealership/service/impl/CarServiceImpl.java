package hu.nye.webapp.cardealership.service.impl;

import hu.nye.webapp.cardealership.dto.CarDTO;
import hu.nye.webapp.cardealership.entity.Car;
import hu.nye.webapp.cardealership.repository.CarRepository;
import hu.nye.webapp.cardealership.service.CarService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class CarServiceImpl implements CarService {

    private final CarRepository carRepository;
    private final ModelMapper modelMapper;

    public CarServiceImpl(CarRepository carRepository, ModelMapper modelMapper) {
        this.carRepository = carRepository;
        this.modelMapper = modelMapper;
    }

    @Override
    public List<CarDTO> findAll() {
        List<Car> carList = carRepository.findAll();

        return carList.stream()
                .map(car -> modelMapper.map(car, CarDTO.class))
                .collect(Collectors.toList());

    }

    @Override
    public CarDTO create(CarDTO carDTO) {
        Car carToSave = modelMapper.map(carDTO, Car.class);
        carToSave.setId(null);
        Car savedCar = carRepository.save(carToSave);
        return modelMapper.map(savedCar, CarDTO.class);
    }

    @Override
    public void delete(Long id) {
        Optional<Car> optionalCar = carRepository.findById(id);

        if (optionalCar.isPresent()) {
            Car carToDelete = optionalCar.get();
            carRepository.delete(carToDelete);
        }  else {
            throw new RuntimeException();
        }
    }
}
