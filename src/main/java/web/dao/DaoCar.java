package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Repository
public class DaoCar implements Dao {
    @Override
    public List<Car> getCountCar(int count) {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("White", "V6", "Honda"));
        cars.add(new Car("Black", "V12", "Mercedes-Benz"));
        cars.add(new Car("Yellow", "V6", "BMW"));
        cars.add(new Car("Blue", "V8", "Toyota"));
        cars.add(new Car("Gray", "V12", "KIA"));
        if (count >= 5) {
            return cars;
        } else if (count > 0) {
            return cars.subList(0, count);
        } else return cars;
    }
}
