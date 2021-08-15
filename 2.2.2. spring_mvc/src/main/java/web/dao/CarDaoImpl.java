package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class CarDaoImpl implements CarDao {
    private static final List<Car> carList = new ArrayList<>();

    static {
        carList.add(new Car("Toyota mark ||", "black", 1994, 70));
        carList.add(new Car("Honda Legend", "white", 1999, 80));
        carList.add(new Car("Mitsubishi diamond", "black", 2000, 90));
        carList.add(new Car("Toyota corolla", "black", 1991, 100));
        carList.add(new Car("Toyota supra", "green", 1996, 110));
    }

    @Override
    public List<Car> getCars(int count) {
        if (count == 0) {
            return carList;
        }

        return carList.stream().limit(count).collect(Collectors.toList());
    }
}