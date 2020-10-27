package web.dao;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class CarsRepository {
    private static List<Car> listCar = new ArrayList<>();

    static {
        listCar.add(new Car("bmw", "x6", 2020));
        listCar.add(new Car("bmw", "3", 2019));
        listCar.add(new Car("bmw", "5", 2018));
        listCar.add(new Car("bmw", "x1", 2017));
        listCar.add(new Car("bmw", "x3", 2016));
    }

    public static List<Car> getNCars(int n) {
        return listCar.stream().limit(n).collect(Collectors.toList());
    }

    public static int size(){
        return listCar.size();
    }

}
