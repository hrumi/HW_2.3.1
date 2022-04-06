package web.service;

import web.model.Car;

import java.util.Arrays;
import java.util.List;

public class CarServiceImpl implements CarService{

    private List<Car> carList= Arrays.asList(
            new Car("Pobeda", "2005", "red"),
            new Car("TOYOTA", "1999", "white"),
            new Car("Renoult", "2007", "blue"),
            new Car("Zaz", "2010", "green"),
            new Car("Volga", "2011", "electric")
    );

    @Override
    public List<Car> getCars(int howMany) {
        if (howMany >= 0 && howMany <= 4)
            return carList.subList(0, howMany);
        else
            return carList;
    }
}

