package cn.com.car.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.com.car.entry.Car;
import cn.com.car.service.CarService;

@Controller
@RequestMapping("/car")
public class CarController {
	
	@Autowired
	private CarService carService;
	
	@RequestMapping("")
	public String area(Model model) {
        return "/car/list";
    }
	@ResponseBody
	@RequestMapping("/list")
	public List<Car> list() {
		return carService.findAll();
	}
	
}
