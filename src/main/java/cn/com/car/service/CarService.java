package cn.com.car.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.com.car.dao.CarRepository;
import cn.com.car.entry.Car;

@Service
public class CarService {
	@Autowired
	private CarRepository carRepository;
	
	public List<Car> findAll(){
		return carRepository.findAll();
	}
	
	
}
