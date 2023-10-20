package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import web.dao.Dao;
import web.model.Car;

import java.util.List;

@org.springframework.stereotype.Service
public class ServiceCar implements Service {
    private final Dao dao;

    @Autowired
    public ServiceCar(Dao dao) {
        this.dao = dao;
    }

    @Override
    public List<Car> getCountCar(int count) {
        return dao.getCountCar(count);
    }
}
