package web.service;

import org.springframework.stereotype.Component;
import web.dao.CarsRepository;
import web.model.Car;

import java.util.List;

@Component
public class ReceiveCars {

    public List<Car> nCars(int n) {
        return CarsRepository.getNCars(n);
    }

    public int carsCount(){
        return CarsRepository.size();
    }
}
