package cn.com.car.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cn.com.car.entry.Car;

@Repository
public interface CarRepository extends JpaRepository<Car, Long> {
	
	
	
}
