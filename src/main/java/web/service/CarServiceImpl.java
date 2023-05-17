package web.service;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import web.dao.CarDao;
import web.dao.CarDaoImpl;
import web.model.Car;

import java.util.List;

@Component
public class CarServiceImpl implements CarService{
    CarDao carDao = new CarDaoImpl();
    @Override
    public List<Car> getList(int count) {
        return carDao.getList(count);
    }
}
