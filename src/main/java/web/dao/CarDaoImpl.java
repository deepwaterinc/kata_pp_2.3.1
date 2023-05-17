package web.dao;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class CarDaoImpl implements CarDao{
    List<Car> carList;

    {
        carList = new ArrayList<>();
        carList.add(new Car("BMW", "5-series", 2020));
        carList.add(new Car("Audi", "Q7", 2021));
        carList.add(new Car("Mercedes", "A-Class", 2019));
        carList.add(new Car("Porsche", "Cayenne", 2022));
        carList.add(new Car("Land Rover", "Range Rover", 2023));
    }

    @Override
    public List<Car> getList(int count) {
        if (count == 0) {
            return carList;
        }
        return carList.stream().limit(count).collect(Collectors.toList());
    }
}
